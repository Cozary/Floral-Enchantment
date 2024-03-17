package com.cozary.floralench.blocks.wither_variant;

import com.cozary.floralench.blocks.base.LargePot;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LargeWitherRosePot extends LargePot {

    @Override
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        ItemStack itemstack = player.getItemInHand(handIn);
        Item item = itemstack.getItem();
        ItemStack item1 = Items.WITHER_ROSE.getDefaultInstance();
        Direction direction1 = state.getValue(FACING);
        if (!worldIn.isClientSide) {
            if (item == Items.AIR) {

                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_POT.get().defaultBlockState().setValue(LargePot.FACING, direction1));
                player.setItemInHand(handIn, item1);
            }
            if (item == Items.WITHER_ROSE) {

                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_DOUBLE_WITHER_ROSE_POT.get().defaultBlockState().setValue(LargePot.FACING, direction1));
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
            }
        }
        return InteractionResult.CONSUME;
    }

    @Override
    public void animateTick(BlockState stateIn, Level worldIn, BlockPos pos, RandomSource rand) {
        VoxelShape voxelshape = this.getShape(stateIn, worldIn, pos, CollisionContext.empty());
        Vec3 vector3d = voxelshape.bounds().getCenter();
        double d0 = (double) pos.getX() + vector3d.x;

        for (int i = 0; i < 3; ++i) {
            if (rand.nextBoolean()) {
                worldIn.addParticle(ParticleTypes.SMOKE, d0 + rand.nextDouble() / 5.0D, (double) pos.getY() + rand.nextDouble(), (double) pos.getZ() + rand.nextDouble(), 0.0D, 0.0D, 0.0D);
            }
        }

    }

    @Override
    public void stepOn(Level worldIn, BlockPos pos, BlockState blockState, Entity entityIn) {
        if (!worldIn.isClientSide && worldIn.getDifficulty() != Difficulty.PEACEFUL) {
            if (entityIn instanceof LivingEntity livingentity) {
                if (!livingentity.isInvulnerableTo(worldIn.damageSources().wither())) {
                    livingentity.addEffect(new MobEffectInstance(MobEffects.WITHER, 40));
                }
            }

        }

        super.stepOn(worldIn, pos, blockState, entityIn);
    }

}