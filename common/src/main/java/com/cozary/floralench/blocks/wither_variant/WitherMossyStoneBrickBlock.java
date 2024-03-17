package com.cozary.floralench.blocks.wither_variant;

import com.cozary.floralench.blocks.base.MossyStoneBrickBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;


public class WitherMossyStoneBrickBlock extends MossyStoneBrickBlock {

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
