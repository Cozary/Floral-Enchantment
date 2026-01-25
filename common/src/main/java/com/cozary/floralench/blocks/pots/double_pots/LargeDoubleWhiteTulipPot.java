package com.cozary.floralench.blocks.pots.double_pots;

import com.cozary.floralench.blocks.pots.LargePottedBlock;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeDoubleWhiteTulipPot extends LargePottedBlock {
    public LargeDoubleWhiteTulipPot() {
        super("large_double_white_tulip_pot", () -> Items.WHITE_TULIP, ModBlocks.LARGE_WHITE_TULIP_POT);
    }
}
