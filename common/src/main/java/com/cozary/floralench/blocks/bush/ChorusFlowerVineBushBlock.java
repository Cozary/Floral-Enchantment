package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class ChorusFlowerVineBushBlock extends VineBushBlock {

    public ChorusFlowerVineBushBlock() {
        super("chorus_flower_bush", () -> Items.CHORUS_FLOWER, ModItems.CHORUS_FLOWER_VINE_ITEM);
    }
}
