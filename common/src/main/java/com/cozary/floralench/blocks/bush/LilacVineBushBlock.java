package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class LilacVineBushBlock extends VineBushBlock {

    public LilacVineBushBlock() {
        super("lilac_bush", () -> Items.LILAC, ModItems.LILAC_VINE_ITEM);
    }
}
