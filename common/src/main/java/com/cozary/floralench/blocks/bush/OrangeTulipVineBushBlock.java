package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;

public class OrangeTulipVineBushBlock extends VineBushBlock {

    public OrangeTulipVineBushBlock() {
        super("orange_tulip_bush", () -> Items.ORANGE_TULIP, ModItems.ORANGE_TULIP_VINE_ITEM);
    }

    @Override
    public ItemStack getCloneItemStack(LevelReader worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(ModItems.ORANGE_TULIP_BUSH_ITEM.get());
    }
}
