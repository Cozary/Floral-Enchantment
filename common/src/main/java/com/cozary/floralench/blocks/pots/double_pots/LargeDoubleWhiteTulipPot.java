package com.cozary.floralench.blocks.pots.double_pots;

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

public class LargeDoubleWhiteTulipPot extends LargePot {

    @Override
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        ItemStack itemstack = player.getItemInHand(handIn);
        Item item = itemstack.getItem();
        ItemStack item1 = Items.WHITE_TULIP.getDefaultInstance();
        Direction direction1 = state.getValue(FACING);
        if (!worldIn.isClientSide) {
            if (item == Items.AIR) {

                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_WHITE_TULIP_POT.get().defaultBlockState().setValue(LargePot.FACING, direction1));
                player.setItemInHand(handIn, item1);
            }
        }
        return InteractionResult.CONSUME;
    }
}