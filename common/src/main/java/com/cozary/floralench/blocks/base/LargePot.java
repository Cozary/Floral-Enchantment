package com.cozary.floralench.blocks.base;

import com.cozary.floralench.blocks.pots.*;
import com.cozary.floralench.blocks.wither_variant.LargeWitherRosePot;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class LargePot extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    protected static final VoxelShape SHAPE = Shapes.or(box(0, 0, 4, 16, 1, 12), box(0, 1, 4, 16, 8, 5), box(0, 1, 11, 16, 8, 12), box(1, 5, 5, 15, 6, 11), box(0, 1, 5, 1, 8, 11), box(15, 1, 5, 16, 8, 11));
    protected static final VoxelShape SHAPE_0 = Shapes.or(box(4, 0, 0, 12, 1, 16), box(11, 1, 0, 12, 8, 16), box(4, 1, 0, 5, 8, 16), box(5, 1, 15, 11, 8, 16), box(5, 1, 0, 11, 8, 1), box(5, 5, 1, 11, 6, 15));

    public LargePot() {
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

    @Override
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        ItemStack itemstack = player.getItemInHand(handIn);
        Item item = itemstack.getItem();
        Direction direction1 = state.getValue(FACING);
        if (!worldIn.isClientSide) {
            if (item == Items.ALLIUM) {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_ALLIUM_POT.get().defaultBlockState().setValue(LargeAlliumPot.FACING, direction1));
            } else if (item == Items.AZURE_BLUET) {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_AZURE_BLUET_POT.get().defaultBlockState().setValue(LargeAzureBluetPot.FACING, direction1));
            } else if (item == Items.BLUE_ORCHID) {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_BLUE_ORCHID_POT.get().defaultBlockState().setValue(LargeBlueOrchidPot.FACING, direction1));
            } else if (item == Items.CORNFLOWER) {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_CORNFLOWER_POT.get().defaultBlockState().setValue(LargeCornflowerPot.FACING, direction1));
            } else if (item == Items.DANDELION) {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_DANDELION_POT.get().defaultBlockState().setValue(LargeDandelionPot.FACING, direction1));
            } else if (item == Items.LILAC) {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_LILAC_POT.get().defaultBlockState().setValue(LargeLilacPot.FACING, direction1));
            } else if (item == Items.LILY_OF_THE_VALLEY) {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_LILY_OF_THE_VALLEY_POT.get().defaultBlockState().setValue(LargeLilyOfTheValleyPot.FACING, direction1));
            } else if (item == Items.ORANGE_TULIP) {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_ORANGE_TULIP_POT.get().defaultBlockState().setValue(LargeOrangeTulipPot.FACING, direction1));
            } else if (item == Items.OXEYE_DAISY) {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_OXEYE_DAISY_POT.get().defaultBlockState().setValue(LargeOxeyeDaisyPot.FACING, direction1));
            } else if (item == Items.PEONY) {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_PEONY_POT.get().defaultBlockState().setValue(LargePeonyPot.FACING, direction1));
            } else if (item == Items.PINK_TULIP) {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_PINK_TULIP_POT.get().defaultBlockState().setValue(LargePinkTulipPot.FACING, direction1));
            } else if (item == Items.POPPY) {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_POPPY_POT.get().defaultBlockState().setValue(LargePoppyPot.FACING, direction1));
            } else if (item == Items.RED_TULIP) {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_RED_TULIP_POT.get().defaultBlockState().setValue(LargeRedTulipPot.FACING, direction1));
            } else if (item == Items.ROSE_BUSH) {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_ROSE_BUSH_POT.get().defaultBlockState().setValue(LargeRoseBushPot.FACING, direction1));
            } else if (item == Items.SUNFLOWER) {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_SUNFLOWER_POT.get().defaultBlockState().setValue(LargeSunflowerPot.FACING, direction1));
            } else if (item == Items.WHITE_TULIP) {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_WHITE_TULIP_POT.get().defaultBlockState().setValue(LargeWhiteTulipPot.FACING, direction1));
            } else if (item == Items.WITHER_ROSE) {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_WITHER_ROSE_POT.get().defaultBlockState().setValue(LargeWitherRosePot.FACING, direction1));
            }
        }
        return InteractionResult.CONSUME;
    }

}