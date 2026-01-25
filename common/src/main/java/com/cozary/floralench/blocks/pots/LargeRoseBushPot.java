package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeRoseBushPot extends LargePottedBlock {
    public LargeRoseBushPot() {
        super("large_rose_bush_pot", () -> Items.ROSE_BUSH, ModBlocks.LARGE_POT);
    }
}
