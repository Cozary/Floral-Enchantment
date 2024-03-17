package com.cozary.floralench.blocks.base;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class FloralBasket extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    protected static final VoxelShape SHAPE = Shapes.or(box(1, 0, 3, 15, 1, 13), box(0, 1, 2, 16, 8, 3), box(0, 1, 13, 16, 8, 14), box(15, 1, 3, 16, 8, 13), box(0, 1, 3, 1, 8, 13), box(1, 5, 3, 15, 6, 13));
    protected static final VoxelShape SHAPE_0 = Shapes.or(box(3, 0, 1, 13, 1, 15), box(2, 1, 0, 3, 8, 16), box(2, 1, 0, 3, 8, 16), box(3, 1, 15, 13, 8, 16), box(3, 1, 0, 13, 8, 1), box(3, 5, 1, 13, 6, 15));

    public FloralBasket() {
        super(Properties.of()
                .instabreak()
                .noOcclusion()
        );
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public @NotNull BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    @Override
    public @NotNull BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public @NotNull VoxelShape getShape(BlockState state, @NotNull BlockGetter worldIn, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return switch (state.getValue(FACING)) {
            case EAST, WEST -> SHAPE_0;
            default -> SHAPE;
        };
    }

    @Override
    public @NotNull RenderShape getRenderShape(@NotNull BlockState state) {
        return RenderShape.MODEL;
    }

}