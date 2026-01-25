package com.cozary.floralench.blocks.pots.double_pots;

import com.cozary.floralench.blocks.pots.LargePottedBlock;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeDoubleBlueOrchidPot extends LargePottedBlock {
    public LargeDoubleBlueOrchidPot() {
        super("large_double_blue_orchid_pot", () -> Items.BLUE_ORCHID, ModBlocks.LARGE_BLUE_ORCHID_POT);
    }
}
