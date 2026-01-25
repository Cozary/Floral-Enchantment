package com.cozary.floralench.blocks.pots.double_pots;

import com.cozary.floralench.blocks.pots.LargePottedBlock;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeDoubleAlliumPot extends LargePottedBlock {
    public LargeDoubleAlliumPot() {
        super("large_double_allium_pot", () -> Items.ALLIUM, ModBlocks.LARGE_ALLIUM_POT);
    }
}
