package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class OxeyeDaisyVineBushBlock extends VineBushBlock {

    public OxeyeDaisyVineBushBlock() {
        super("oxeye_daisy_bush", () -> Items.OXEYE_DAISY, () -> ModItems.OXEYE_DAISY_VINE_ITEM.get());
    }
}

