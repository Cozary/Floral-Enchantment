package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.state.BlockState;

public class LilyOfTheValleyVineBushBlock extends VineBushBlock {

    public LilyOfTheValleyVineBushBlock() {
        super("lily_of_the_valley_bush", () -> Items.LILY_OF_THE_VALLEY, ModItems.LILY_OF_THE_VALLEY_VINE_ITEM);
    }

    @Override
    public ItemStack getCloneItemStack(LevelReader worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(ModItems.LILY_OF_THE_VALLEY_BUSH_ITEM.get());
    }
}
