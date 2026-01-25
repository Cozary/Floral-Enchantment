package com.cozary.floralench.blocks.pots.double_pots;

import com.cozary.floralench.blocks.pots.LargePottedBlock;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeDoubleOrangeTulipPot extends LargePottedBlock {
    public LargeDoubleOrangeTulipPot() {
        super("large_double_orange_tulip_pot", () -> Items.ORANGE_TULIP, ModBlocks.LARGE_ORANGE_TULIP_POT);
    }
}
