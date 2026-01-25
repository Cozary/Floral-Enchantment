package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeAzaleaPot extends LargePottedBlock {
    public LargeAzaleaPot() {
        super("large_azalea_pot", () -> Items.FLOWERING_AZALEA, ModBlocks.LARGE_POT, ModBlocks.LARGE_DOUBLE_AZALEA_POT);
    }
}
