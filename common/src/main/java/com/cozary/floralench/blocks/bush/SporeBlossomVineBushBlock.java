package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class SporeBlossomVineBushBlock extends VineBushBlock {

    public SporeBlossomVineBushBlock() {
        super("spore_blossom_bush", () -> Items.SPORE_BLOSSOM, ModItems.SPORE_BLOSSOM_VINE_ITEM);
    }
}
