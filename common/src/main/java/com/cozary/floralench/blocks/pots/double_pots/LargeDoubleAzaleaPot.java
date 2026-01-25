package com.cozary.floralench.blocks.pots.double_pots;

import com.cozary.floralench.blocks.pots.LargePottedBlock;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeDoubleAzaleaPot extends LargePottedBlock {
    public LargeDoubleAzaleaPot() {
        super("large_double_azalea_pot", () -> Items.FLOWERING_AZALEA, ModBlocks.LARGE_AZALEA_POT);
    }
}
