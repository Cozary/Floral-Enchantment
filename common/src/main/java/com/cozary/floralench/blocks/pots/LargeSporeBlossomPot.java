package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeSporeBlossomPot extends LargePottedBlock {
    public LargeSporeBlossomPot() {
        super("large_spore_blossom_pot", () -> Items.SPORE_BLOSSOM, ModBlocks.LARGE_POT, ModBlocks.LARGE_DOUBLE_SPORE_BLOSSOM_POT);
    }
}
