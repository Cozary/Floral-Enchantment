package com.cozary.floralench.blocks.base;

import com.cozary.floralench.FloralEnchantment;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LargePotBase extends Block {
    public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
    protected static final VoxelShape SHAPE = Shapes.or(box(0, 0, 4, 16, 1, 12), box(0, 1, 4, 16, 8, 5), box(0, 1, 11, 16, 8, 12), box(1, 5, 5, 15, 6, 11), box(0, 1, 5, 1, 8, 11), box(15, 1, 5, 16, 8, 11));
    protected static final VoxelShape SHAPE_0 = Shapes.or(box(4, 0, 0, 12, 1, 16), box(11, 1, 0, 12, 8, 16), box(4, 1, 0, 5, 8, 16), box(5, 1, 15, 11, 8, 16), box(5, 1, 0, 11, 8, 1), box(5, 5, 1, 11, 6, 15));

    public LargePotBase(String name) {
        super(Properties.of()
                .setId(ResourceKey.create(
                        Registries.BLOCK,
                        Identifier.fromNamespaceAndPath(FloralEnchantment.MOD_ID, name)
                ))
                .instabreak()
                .noOcclusion()
        );
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            case EAST, WEST -> SHAPE_0;
            default -> SHAPE;
        };
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }
}
