package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class WildflowersVineBushBlock extends VineBushBlock {

    public WildflowersVineBushBlock() {
        super("wildflowers_bush", () -> Items.WILDFLOWERS, ModItems.WILDFLOWERS_VINE_ITEM);
    }
}
