package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.blocks.base.LargePot;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class LargeRedTulipPot extends LargePot {

    @Override
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        ItemStack itemstack = player.getItemInHand(handIn);
        Item item = itemstack.getItem();
        ItemStack item1 = Items.RED_TULIP.getDefaultInstance();
        Direction direction1 = state.getValue(FACING);
        if (!worldIn.isClientSide) {
            if (item == Items.AIR) {

                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_POT.get().defaultBlockState().setValue(LargePot.FACING, direction1));
                player.setItemInHand(handIn, item1);
            }
            if (item == Items.RED_TULIP) {

                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_DOUBLE_RED_TULIP_POT.get().defaultBlockState().setValue(LargePot.FACING, direction1));
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
            }
        }
        return InteractionResult.CONSUME;
    }
}