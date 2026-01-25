package com.cozary.floralench.blocks.pots.double_pots;

import com.cozary.floralench.blocks.pots.LargePottedBlock;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeDoubleTorchflowerPot extends LargePottedBlock {
    public LargeDoubleTorchflowerPot() {
        super("large_double_torchflower_pot", () -> Items.TORCHFLOWER, ModBlocks.LARGE_TORCHFLOWER_POT);
    }
}
