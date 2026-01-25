package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeDandelionPot extends LargePottedBlock {
    public LargeDandelionPot() {
        super("large_dandelion_pot", () -> Items.DANDELION, ModBlocks.LARGE_POT, ModBlocks.LARGE_DOUBLE_DANDELION_POT);
    }
}
