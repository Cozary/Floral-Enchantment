package com.cozary.floralench.blocks.base;

import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class BasketBase extends BlockItem {

    public BasketBase(Block block) {
        super(block, new Properties().craftRemainder(ModItems.FLORAL_BASKET.get()));
    }

}
