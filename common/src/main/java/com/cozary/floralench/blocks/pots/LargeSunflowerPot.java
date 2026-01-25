package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeSunflowerPot extends LargePottedBlock {
    public LargeSunflowerPot() {
        super("large_sunflower_pot", () -> Items.SUNFLOWER, ModBlocks.LARGE_POT);
    }
}
