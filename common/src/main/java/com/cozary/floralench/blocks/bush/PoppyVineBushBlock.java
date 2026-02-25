package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class PoppyVineBushBlock extends VineBushBlock {

    public PoppyVineBushBlock() {
        super("poppy_bush", () -> Items.POPPY, ModItems.POPPY_VINE_ITEM);
    }
}
