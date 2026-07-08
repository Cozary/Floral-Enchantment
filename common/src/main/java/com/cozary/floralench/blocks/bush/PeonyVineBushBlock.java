package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class PeonyVineBushBlock extends VineBushBlock {

    public PeonyVineBushBlock() {
        super("peony_bush", () -> Items.PEONY, () -> ModItems.PEONY_VINE_ITEM.get());
    }
}

