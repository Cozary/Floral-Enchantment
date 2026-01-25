package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeRedTulipPot extends LargePottedBlock {
    public LargeRedTulipPot() {
        super("large_red_tulip_pot", () -> Items.RED_TULIP, ModBlocks.LARGE_POT, ModBlocks.LARGE_DOUBLE_RED_TULIP_POT);
    }
}
