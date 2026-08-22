package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class GoldenDandelionVineBushBlock extends VineBushBlock {

    public GoldenDandelionVineBushBlock() {
        super("golden_dandelion_bush", () -> Items.GOLDEN_DANDELION, () -> ModItems.GOLDEN_DANDELION_VINE_ITEM.get());
    }
}
