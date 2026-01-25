package com.cozary.floralench.blocks.pots.double_pots;

import com.cozary.floralench.blocks.pots.LargePottedBlock;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeDoubleDandelionPot extends LargePottedBlock {
    public LargeDoubleDandelionPot() {
        super("large_double_dandelion_pot", () -> Items.DANDELION, ModBlocks.LARGE_DANDELION_POT);
    }
}
