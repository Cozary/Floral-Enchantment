package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class CactusFlowerVineBushBlock extends VineBushBlock {

    public CactusFlowerVineBushBlock() {
        super("cactus_flower_bush", () -> Items.CACTUS_FLOWER, ModItems.CACTUS_FLOWER_VINE_ITEM);
    }
}
