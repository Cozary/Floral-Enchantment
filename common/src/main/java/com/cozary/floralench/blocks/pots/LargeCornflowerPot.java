package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeCornflowerPot extends LargePottedBlock {
    public LargeCornflowerPot() {
        super("large_cornflower_pot", () -> Items.CORNFLOWER, ModBlocks.LARGE_POT, ModBlocks.LARGE_DOUBLE_CORNFLOWER_POT);
    }
}
