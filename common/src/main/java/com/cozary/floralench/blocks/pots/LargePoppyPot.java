package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargePoppyPot extends LargePottedBlock {
    public LargePoppyPot() {
        super("large_poppy_pot", () -> Items.POPPY, ModBlocks.LARGE_POT, ModBlocks.LARGE_DOUBLE_POPPY_POT);
    }
}
