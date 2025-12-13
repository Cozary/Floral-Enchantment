package com.cozary.floralench.blocks.wither_variant;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;


public class WitherVineBushBlock extends VineBushBlock {

    public WitherVineBushBlock() {
        super("wither_rose_bush");
    }

    @Override
    public void animateTick(BlockState stateIn, Level level, BlockPos pos, RandomSource rand) {
        VoxelShape voxelshape = this.getShape(stateIn, level, pos, CollisionContext.empty());
        Vec3 vector3d = voxelshape.bounds().getCenter();
        double d0 = (double) pos.getX() + vector3d.x;

        for (int i = 0; i < 4; ++i) {
            if (rand.nextBoolean()) {
                level.addParticle(ParticleTypes.SMOKE, d0 + rand.nextDouble() / 5.0D, (double) pos.getY() + rand.nextDouble(), (double) pos.getZ() + rand.nextDouble(), 0.0D, 0.0D, 0.0D);
            }
        }

    }

    @Override
    protected void entityInside(BlockState state, Level level, BlockPos pos, Entity entity, InsideBlockEffectApplier p_405414_, boolean p_451767_) {
        if (!level.isClientSide() && level.getDifficulty() != Difficulty.PEACEFUL) {
            if (entity instanceof LivingEntity livingentity) {
                if (!livingentity.isInvulnerableTo((ServerLevel) level, level.damageSources().wither())) {
                    livingentity.addEffect(new MobEffectInstance(MobEffects.WITHER, 40));
                }
            }

        }
    }

    @Override
    public ItemStack getCloneItemStack(LevelReader level, BlockPos pos, BlockState state) {
        return new ItemStack(ModItems.WITHER_ROSE_BUSH_ITEM.get());
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        int i = state.getValue(AGE);
        boolean flag = i == 3;
        if (!flag && player.getMainHandItem().getItem() == Items.BONE_MEAL) {
            return InteractionResult.PASS;
        } else if (i == 2) {
            int j = 1 + level.random.nextInt(4);
            popResource(level, pos, new ItemStack(Items.WITHER_ROSE, j));
            level.playSound(null, pos, SoundEvents.GRASS_FALL, SoundSource.BLOCKS, 1.0F, 0.8F + level.random.nextFloat() * 0.4F);
            level.setBlock(pos, state.setValue(AGE, Integer.valueOf(1)), 2);
            return InteractionResult.SUCCESS.withoutItem();
        } else if (i == 3) {
            int j = 1 + level.random.nextInt(3);
            popResource(level, pos, new ItemStack(ModItems.WITHER_ROSE_VINE_ITEM.get(), j));
            level.playSound(null, pos, SoundEvents.GRASS_FALL, SoundSource.BLOCKS, 1.0F, 0.8F + level.random.nextFloat() * 0.4F);
            level.setBlock(pos, state.setValue(AGE, Integer.valueOf(2)), 2);
            return InteractionResult.SUCCESS.withoutItem();
        } else {
            return super.useWithoutItem(state, level, pos, player, hit);
        }
    }
}
