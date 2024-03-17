package com.cozary.floralench.blocks.base;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VineBushBlock extends SweetBerryBushBlock {
    private static final VoxelShape BUSHLING_SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 8.0D, 13.0D);
    private static final VoxelShape HALF_GROW_SHAPE = Block.box(3, 0, 3, 13, 10, 13);
    private static final VoxelShape GROW_SHAPE = Block.box(1, 0, 1, 15, 14, 15);

    public VineBushBlock() {
        super(Properties.of()
                .noCollission()
                .randomTicks()
                .strength(0.2F)
                .sound(SoundType.SWEET_BERRY_BUSH)
                .mapColor(MapColor.PLANT)
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY)
        );
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, Integer.valueOf(0)));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        if (state.getValue(AGE) == 0) {
            return BUSHLING_SHAPE;
        } else if ((state.getValue(AGE) == 1 || state.getValue(AGE) == 2)) {
            return HALF_GROW_SHAPE;
        } else {
            return state.getValue(AGE) == 3 ? GROW_SHAPE : super.getShape(state, worldIn, pos, context);
        }
    }

    @Override
    public void entityInside(BlockState state, Level worldIn, BlockPos pos, Entity entityIn) {
        if (entityIn instanceof LivingEntity && entityIn.getType() != EntityType.FOX && entityIn.getType() != EntityType.BEE) {
            entityIn.makeStuckInBlock(state, new Vec3(0.9F, 0.85D, 0.9F));
        }
    }

}