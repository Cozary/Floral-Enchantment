package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class DandelionVineBushBlock extends VineBushBlock {

    public DandelionVineBushBlock() {
        super("dandelion_bush", () -> Items.DANDELION, () -> ModItems.DANDELION_VINE_ITEM.get());
    }
}

