package com.cozary.floralench.blocks.eyeblossom_variant;

import com.cozary.floralench.blocks.base.VineBaseBlock;
import com.cozary.floralench.init.ModBlocks;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.TrailParticleOption;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;


public class EyeblossomVineBaseBlock extends VineBaseBlock {

    public static final MapCodec<EyeblossomVineBaseBlock> CODEC = RecordCodecBuilder.mapCodec((instance) -> {
        return instance.group(Codec.BOOL.fieldOf("open").forGetter((eyeblossomBlock) -> {
            return eyeblossomBlock.type.open;
        })).apply(instance, EyeblossomVineBaseBlock::new);
    });

    private final EyeblossomVineBaseBlock.Type type;

    public MapCodec<? extends EyeblossomVineBaseBlock> codec_() {
        return CODEC;
    }

    public EyeblossomVineBaseBlock(String name, EyeblossomVineBaseBlock.Type type) {
        super(name);
        this.type = type;

    }

    public EyeblossomVineBaseBlock(Boolean open) {
        super("eyeblossom_vine");
        this.type = EyeblossomVineBaseBlock.Type.fromBoolean(open);


    }


    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (this.type.emitSounds() && random.nextInt(700) == 0) {
            BlockState blockState = level.getBlockState(pos.below());
            if (blockState.is(Blocks.PALE_MOSS_BLOCK)) {
                level.playLocalSound((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), SoundEvents.EYEBLOSSOM_IDLE, SoundSource.BLOCKS, 1.0F, 1.0F, false);
            }
        }

    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (this.tryChangingState(state, level, pos, random)) {
            level.playSound((Player)null, pos, this.type.transform().longSwitchSound, SoundSource.BLOCKS, 1.0F, 1.0F);
        }

        super.randomTick(state, level, pos, random);
    }

    @Override
    protected void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (this.tryChangingState(state, level, pos, random)) {
            level.playSound((Player)null, pos, this.type.transform().shortSwitchSound, SoundSource.BLOCKS, 1.0F, 1.0F);
        }

        super.tick(state, level, pos, random);
    }

    private boolean tryChangingState(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.dimensionType().natural()) {
            return false;
        } else if (level.isDay() != this.type.open) {
            return false;
        } else {
            EyeblossomVineBaseBlock.Type type = this.type.transform();
            level.setBlock(pos, type.state(), 3);
            level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(state));
            type.spawnTransformParticle(level, pos, random);
            BlockPos.betweenClosed(pos.offset(-3, -2, -3), pos.offset(3, 2, 3)).forEach((blockPos2) -> {
                BlockState blockState2 = level.getBlockState(blockPos2);
                if (blockState2 == state) {
                    double d = Math.sqrt(pos.distSqr(blockPos2));
                    int i = random.nextIntBetweenInclusive((int)(d * 5.0), (int)(d * 10.0));
                    level.scheduleTick(blockPos2, state.getBlock(), i);
                }

            });
            return true;
        }
    }

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (!level.isClientSide() && level.getDifficulty() != Difficulty.PEACEFUL && entity instanceof Bee bee) {
            if (Bee.attractsBees(state) && !bee.hasEffect(MobEffects.POISON)) {
                bee.addEffect(this.getBeeInteractionEffect());
            }
        }

    }

    public MobEffectInstance getBeeInteractionEffect() {
        return new MobEffectInstance(MobEffects.POISON, 25);
    }

    public static enum Type {
        OPEN(true, SoundEvents.EYEBLOSSOM_OPEN_LONG, SoundEvents.EYEBLOSSOM_OPEN, 16545810),
        CLOSED(false, SoundEvents.EYEBLOSSOM_CLOSE_LONG, SoundEvents.EYEBLOSSOM_CLOSE, 6250335);

        final boolean open;
        final SoundEvent longSwitchSound;
        final SoundEvent shortSwitchSound;
        private final int particleColor;

        private Type(final boolean open, final SoundEvent longSwitchSound, final SoundEvent shortSwitchSound, final int particleColor) {
            this.open = open;
            this.longSwitchSound = longSwitchSound;
            this.shortSwitchSound = shortSwitchSound;
            this.particleColor = particleColor;
        }

        public Block block() {
            return this.open ? ModBlocks.OPEN_EYEBLOSSOM_VINE.get() : ModBlocks.CLOSED_EYEBLOSSOM_VINE.get();
        }

        public BlockState state() {
            return this.block().defaultBlockState();
        }

        public EyeblossomVineBaseBlock.Type transform() {
            return fromBoolean(!this.open);
        }

        public boolean emitSounds() {
            return this.open;
        }

        public static EyeblossomVineBaseBlock.Type fromBoolean(boolean open) {
            return open ? OPEN : CLOSED;
        }

        public void spawnTransformParticle(ServerLevel level, BlockPos pos, RandomSource random) {
            Vec3 vec3 = pos.getCenter();
            double d = 0.5 + random.nextDouble();
            Vec3 vec32 = new Vec3(random.nextDouble() - 0.5, random.nextDouble() + 1.0, random.nextDouble() - 0.5);
            Vec3 vec33 = vec3.add(vec32.scale(d));
            TrailParticleOption trailParticleOption = new TrailParticleOption(vec33, this.particleColor, (int)(20.0 * d));
            level.sendParticles(trailParticleOption, vec3.x, vec3.y, vec3.z, 1, 0.0, 0.0, 0.0, 0.0);
        }
    }


}
