package com.cozary.floralench.blocks.pots.double_pots;

import com.cozary.floralench.blocks.pots.LargePottedBlock;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeDoubleRedTulipPot extends LargePottedBlock {
    public LargeDoubleRedTulipPot() {
        super("large_double_red_tulip_pot", () -> Items.RED_TULIP, ModBlocks.LARGE_RED_TULIP_POT);
    }
}
