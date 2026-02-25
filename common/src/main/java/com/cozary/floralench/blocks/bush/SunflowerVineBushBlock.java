package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class SunflowerVineBushBlock extends VineBushBlock {

    public SunflowerVineBushBlock() {
        super("sunflower_bush", () -> Items.SUNFLOWER, ModItems.SUNFLOWER_VINE_ITEM);
    }
}
