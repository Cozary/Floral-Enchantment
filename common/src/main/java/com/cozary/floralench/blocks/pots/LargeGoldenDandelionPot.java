package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeGoldenDandelionPot extends LargePottedBlock {
    public LargeGoldenDandelionPot() {
        super("large_golden_dandelion_pot", () -> Items.GOLDEN_DANDELION, ModBlocks.LARGE_POT, ModBlocks.LARGE_DOUBLE_GOLDEN_DANDELION_POT);
    }
}
