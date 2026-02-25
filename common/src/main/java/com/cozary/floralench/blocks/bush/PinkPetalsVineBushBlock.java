package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class PinkPetalsVineBushBlock extends VineBushBlock {

    public PinkPetalsVineBushBlock() {
        super("pink_petals_bush", () -> Items.PINK_PETALS, ModItems.PINK_PETALS_VINE_ITEM);
    }
}
