package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class CornflowerVineBushBlock extends VineBushBlock {

    public CornflowerVineBushBlock() {
        super("cornflower_bush", () -> Items.CORNFLOWER, ModItems.CORNFLOWER_VINE_ITEM);
    }
}
