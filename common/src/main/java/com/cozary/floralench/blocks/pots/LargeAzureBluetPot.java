package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeAzureBluetPot extends LargePottedBlock {
    public LargeAzureBluetPot() {
        super("large_azure_bluet_pot", () -> Items.AZURE_BLUET, ModBlocks.LARGE_POT, ModBlocks.LARGE_DOUBLE_AZURE_BLUET_POT);
    }
}
