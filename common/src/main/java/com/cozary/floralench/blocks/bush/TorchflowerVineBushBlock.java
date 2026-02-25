package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class TorchflowerVineBushBlock extends VineBushBlock {

    public TorchflowerVineBushBlock() {
        super("torchflower_bush", () -> Items.TORCHFLOWER, ModItems.TORCHFLOWER_VINE_ITEM);
    }
}
