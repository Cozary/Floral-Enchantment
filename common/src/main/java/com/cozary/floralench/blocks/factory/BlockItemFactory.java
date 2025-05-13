package com.cozary.floralench.blocks.factory;

import com.cozary.floralench.blocks.base.BasketBase;
import com.cozary.floralench.blocks.base.BlockItemBase;
import net.minecraft.world.level.block.Block;

public class BlockItemFactory {

    public static BlockItemBase create(Block block, String name) {
        return new BlockItemBase(block, name);
    }
}
