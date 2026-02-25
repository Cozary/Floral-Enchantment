package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class RoseBushVineBushBlock extends VineBushBlock {

    public RoseBushVineBushBlock() {
        super("rose_bush_bush", () -> Items.ROSE_BUSH, ModItems.ROSE_BUSH_VINE_ITEM);
    }
}
