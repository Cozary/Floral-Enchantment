package com.cozary.floralench.blocks.pots.double_pots;

import com.cozary.floralench.blocks.pots.LargePottedBlock;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeDoublePoppyPot extends LargePottedBlock {
    public LargeDoublePoppyPot() {
        super("large_double_poppy_pot", () -> Items.POPPY, ModBlocks.LARGE_POPPY_POT);
    }
}
