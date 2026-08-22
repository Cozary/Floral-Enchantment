package com.cozary.floralench.blocks.pots.double_pots;

import com.cozary.floralench.blocks.pots.LargePottedBlock;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeDoubleGoldenDandelionPot extends LargePottedBlock {
    public LargeDoubleGoldenDandelionPot() {
        super("large_double_golden_dandelion_pot", () -> Items.GOLDEN_DANDELION, ModBlocks.LARGE_GOLDEN_DANDELION_POT);
    }
}
