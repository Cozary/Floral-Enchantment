package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargePeonyPot extends LargePottedBlock {
    public LargePeonyPot() {
        super("large_peony_pot", () -> Items.PEONY, ModBlocks.LARGE_POT);
    }
}
