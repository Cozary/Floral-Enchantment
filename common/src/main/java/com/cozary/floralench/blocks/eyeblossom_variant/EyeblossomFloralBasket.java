package com.cozary.floralench.blocks.eyeblossom_variant;

import com.cozary.floralench.blocks.base.FloralBasket;
import com.cozary.floralench.init.ModBlocks;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.TrailParticleOption;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.TriState;
import net.minecraft.world.Difficulty;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.animal.bee.Bee;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.EyeblossomBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;

public class EyeblossomFloralBasket extends FloralBasket {

    public static final MapCodec<EyeblossomFloralBasket> CODEC = RecordCodecBuilder.mapCodec((instance) -> {
        return instance.group(Codec.BOOL.fieldOf("open").forGetter((eyeblossomBlock) -> {
            return eyeblossomBlock.type.open;
        })).apply(instance, EyeblossomFloralBasket::new);
    });

    private final Type type;

    public EyeblossomFloralBasket(String name, Type type) {
        super(name);
        this.type = type;
    }

    public EyeblossomFloralBasket(Boolean open) {
        super("eyeblossom_basket");
        this.type = Type.fromBoolean(open);
    }

    public MapCodec<? extends EyeblossomFloralBasket> codec_() {
        return CODEC;
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (this.type.emitSounds() && random.nextInt(700) == 0) {
            BlockState blockState = level.getBlockState(pos.below());
            if (blockState.is(Blocks.PALE_MOSS_BLOCK)) {
                level.playLocalSound((double) pos.getX(), (double) pos.getY(), (double) pos.getZ(), SoundEvents.EYEBLOSSOM_IDLE, SoundSource.BLOCKS, 1.0F, 1.0F, false);
            }
        }

    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (this.tryChangingState(state, level, pos, random)) {
            level.playSound((Player) null, pos, this.type.transform().longSwitchSound, SoundSource.BLOCKS, 1.0F, 1.0F);
        }

        super.randomTick(state, level, pos, random);
    }

    @Override
    protected void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (this.tryChangingState(state, level, pos, random)) {
            level.playSound((Player) null, pos, this.type.transform().shortSwitchSound, SoundSource.BLOCKS, 1.0F, 1.0F);
        }

        super.tick(state, level, pos, random);
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    private boolean tryChangingState(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        boolean flag = ((TriState)level.environmentAttributes().getValue(EnvironmentAttributes.EYEBLOSSOM_OPEN, pos)).toBoolean(this.type.open);
        if (flag == this.type.open) {
            return false;
        } else {
            EyeblossomFloralBasket.Type eyeblossomblock$type = this.type.transform();
            level.setBlock(pos, eyeblossomblock$type.state(), 3);
            level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(state));
            eyeblossomblock$type.spawnTransformParticle(level, pos, random);
            BlockPos.betweenClosed(pos.offset(-3, -2, -3), pos.offset(3, 2, 3)).forEach((p_383198_) -> {
                BlockState blockstate = level.getBlockState(p_383198_);
                if (blockstate == state) {
                    double d0 = Math.sqrt(pos.distSqr(p_383198_));
                    int i = random.nextIntBetweenInclusive((int)(d0 * 5.0), (int)(d0 * 10.0));
                    level.scheduleTick(p_383198_, state.getBlock(), i);
                }

            });
            return true;
        }
    }

    @Override
    protected void entityInside(BlockState state, Level level, BlockPos pos, Entity entity, InsideBlockEffectApplier p_405414_, boolean p_451767_) {
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

        public static Type fromBoolean(boolean open) {
            return open ? OPEN : CLOSED;
        }

        public Block block() {
            return this.open ? ModBlocks.OPEN_EYEBLOSSOM_BASKET.get() : ModBlocks.CLOSED_EYEBLOSSOM_BASKET.get();
        }

        public BlockState state() {
            return this.block().defaultBlockState();
        }

        public Type transform() {
            return fromBoolean(!this.open);
        }

        public boolean emitSounds() {
            return this.open;
        }

        public void spawnTransformParticle(ServerLevel level, BlockPos pos, RandomSource random) {
            Vec3 vec3 = pos.getCenter();
            double d = 0.5 + random.nextDouble();
            Vec3 vec32 = new Vec3(random.nextDouble() - 0.5, random.nextDouble() + 1.0, random.nextDouble() - 0.5);
            Vec3 vec33 = vec3.add(vec32.scale(d));
            TrailParticleOption trailParticleOption = new TrailParticleOption(vec33, this.particleColor, (int) (20.0 * d));
            level.sendParticles(trailParticleOption, vec3.x, vec3.y, vec3.z, 1, 0.0, 0.0, 0.0, 0.0);
        }
    }

}