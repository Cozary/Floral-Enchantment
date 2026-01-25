package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeWhiteTulipPot extends LargePottedBlock {
    public LargeWhiteTulipPot() {
        super("large_white_tulip_pot", () -> Items.WHITE_TULIP, ModBlocks.LARGE_POT, ModBlocks.LARGE_DOUBLE_WHITE_TULIP_POT);
    }
}
