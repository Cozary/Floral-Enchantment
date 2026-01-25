package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeOrangeTulipPot extends LargePottedBlock {
    public LargeOrangeTulipPot() {
        super("large_orange_tulip_pot", () -> Items.ORANGE_TULIP, ModBlocks.LARGE_POT, ModBlocks.LARGE_DOUBLE_ORANGE_TULIP_POT);
    }
}
