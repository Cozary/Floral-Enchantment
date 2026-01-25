package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargePinkTulipPot extends LargePottedBlock {
    public LargePinkTulipPot() {
        super("large_pink_tulip_pot", () -> Items.PINK_TULIP, ModBlocks.LARGE_POT, ModBlocks.LARGE_DOUBLE_PINK_TULIP_POT);
    }
}
