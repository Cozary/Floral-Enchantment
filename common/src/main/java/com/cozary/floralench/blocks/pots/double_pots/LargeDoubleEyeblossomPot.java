package com.cozary.floralench.blocks.pots.double_pots;

import com.cozary.floralench.blocks.base.LargePotBase;
import com.cozary.floralench.blocks.pots.special.LargePot;
import com.cozary.floralench.init.ModBlocks;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.TrailParticleOption;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

public class LargeDoubleEyeblossomPot extends LargePotBase {

    public static final MapCodec<LargeDoubleEyeblossomPot> CODEC = RecordCodecBuilder.mapCodec((instance) -> {
        return instance.group(Codec.BOOL.fieldOf("open").forGetter((eyeblossomBlock) -> {
            return eyeblossomBlock.type.open;
        })).apply(instance, LargeDoubleEyeblossomPot::new);
    });

    private final LargeDoubleEyeblossomPot.Type type;

    public LargeDoubleEyeblossomPot(LargeDoubleEyeblossomPot.Type type) {
        super("large_double_closed_eyeblossom_pot");
        this.type = type;

    }

    public LargeDoubleEyeblossomPot(Boolean open) {
        super("large_double_closed_eyeblossom_pot");
        this.type = LargeDoubleEyeblossomPot.Type.fromBoolean(open);
    }

    public MapCodec<? extends LargeDoubleEyeblossomPot> codec_() {
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
        if (!level.dimensionType().natural()) {
            return false;
        } else if (level.isBrightOutside() != this.type.open) {
            return false;
        } else {
            LargeDoubleEyeblossomPot.Type type = this.type.transform();
            BlockState newState = type.state();
            newState = newState.setValue(HorizontalDirectionalBlock.FACING, state.getValue(HorizontalDirectionalBlock.FACING));
            level.setBlock(pos, newState, 3);
            level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(state));
            type.spawnTransformParticle(level, pos, random);
            BlockPos.betweenClosed(pos.offset(-3, -2, -3), pos.offset(3, 2, 3)).forEach((blockPos2) -> {
                BlockState blockState2 = level.getBlockState(blockPos2);
                if (blockState2 == state) {
                    double d = Math.sqrt(pos.distSqr(blockPos2));
                    int i = random.nextIntBetweenInclusive((int) (d * 5.0), (int) (d * 10.0));
                    level.scheduleTick(blockPos2, state.getBlock(), i);
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

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level worldIn, BlockPos pos, Player player, BlockHitResult hit) {
        ItemStack itemstack = player.getMainHandItem();
        Item item = itemstack.getItem();
        ItemStack item1 = this.type.open ? Items.OPEN_EYEBLOSSOM.getDefaultInstance() : Items.CLOSED_EYEBLOSSOM.getDefaultInstance();
        Direction direction1 = state.getValue(FACING);
        if (!worldIn.isClientSide()) {
            if (item == Items.AIR) {

                worldIn.setBlockAndUpdate(pos, (this.type.open ? ModBlocks.LARGE_OPEN_EYEBLOSSOM_POT.get() : ModBlocks.LARGE_CLOSED_EYEBLOSSOM_POT.get()).defaultBlockState().setValue(LargePot.FACING, direction1));
                player.setItemInHand(InteractionHand.MAIN_HAND, item1);
            }
        }
        return InteractionResult.CONSUME;
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

        public static LargeDoubleEyeblossomPot.Type fromBoolean(boolean open) {
            return open ? OPEN : CLOSED;
        }

        public Block block() {
            return this.open ? ModBlocks.LARGE_DOUBLE_OPEN_EYEBLOSSOM_POT.get() : ModBlocks.LARGE_DOUBLE_CLOSED_EYEBLOSSOM_POT.get();
        }

        public BlockState state() {
            return this.block().defaultBlockState();
        }

        public LargeDoubleEyeblossomPot.Type transform() {
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