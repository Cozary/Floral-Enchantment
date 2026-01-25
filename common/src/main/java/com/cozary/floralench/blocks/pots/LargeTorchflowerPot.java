package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeTorchflowerPot extends LargePottedBlock {
    public LargeTorchflowerPot() {
        super("large_torchflower_pot", () -> Items.TORCHFLOWER, ModBlocks.LARGE_POT, ModBlocks.LARGE_DOUBLE_TORCHFLOWER_POT);
    }
}
