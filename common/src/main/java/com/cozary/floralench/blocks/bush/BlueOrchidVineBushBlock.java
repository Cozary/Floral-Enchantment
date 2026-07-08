package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class BlueOrchidVineBushBlock extends VineBushBlock {

    public BlueOrchidVineBushBlock() {
        super("blue_orchid_bush", () -> Items.BLUE_ORCHID, () -> ModItems.BLUE_ORCHID_VINE_ITEM.get());
    }
}

