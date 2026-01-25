package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeBlueOrchidPot extends LargePottedBlock {
    public LargeBlueOrchidPot() {
        super("large_blue_orchid_pot", () -> Items.BLUE_ORCHID, ModBlocks.LARGE_POT, ModBlocks.LARGE_DOUBLE_BLUE_ORCHID_POT);
    }
}
