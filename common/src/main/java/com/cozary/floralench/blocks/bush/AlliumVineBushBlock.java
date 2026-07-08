package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class AlliumVineBushBlock extends VineBushBlock {

    public AlliumVineBushBlock() {
        super("allium_bush", () -> Items.ALLIUM, () -> ModItems.ALLIUM_VINE_ITEM.get());
    }
}

