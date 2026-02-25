package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class AzaleaVineBushBlock extends VineBushBlock {

    public AzaleaVineBushBlock() {
        super("azalea_bush", () -> Items.FLOWERING_AZALEA, ModItems.AZALEA_VINE_ITEM);
    }
}
