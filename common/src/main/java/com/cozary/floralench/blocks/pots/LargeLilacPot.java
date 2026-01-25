package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeLilacPot extends LargePottedBlock {
    public LargeLilacPot() {
        super("large_lilac_pot", () -> Items.LILAC, ModBlocks.LARGE_POT);
    }
}
