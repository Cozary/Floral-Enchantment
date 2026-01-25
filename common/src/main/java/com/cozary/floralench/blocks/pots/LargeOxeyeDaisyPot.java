package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeOxeyeDaisyPot extends LargePottedBlock {
    public LargeOxeyeDaisyPot() {
        super("large_oxeye_daisy_pot", () -> Items.OXEYE_DAISY, ModBlocks.LARGE_POT, ModBlocks.LARGE_DOUBLE_OXEYE_DAISY_POT);
    }
}
