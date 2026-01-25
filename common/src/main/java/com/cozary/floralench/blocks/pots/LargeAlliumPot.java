package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeAlliumPot extends LargePottedBlock {
    public LargeAlliumPot() {
        super("large_allium_pot", () -> Items.ALLIUM, ModBlocks.LARGE_POT, ModBlocks.LARGE_DOUBLE_ALLIUM_POT);
    }
}
