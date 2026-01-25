package com.cozary.floralench.blocks.pots.double_pots;

import com.cozary.floralench.blocks.pots.LargePottedBlock;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeDoubleCactusFlowerPot extends LargePottedBlock {
    public LargeDoubleCactusFlowerPot() {
        super("large_double_cactus_flower_pot", () -> Items.CACTUS, ModBlocks.LARGE_CACTUS_FLOWER_POT);
    }
}
