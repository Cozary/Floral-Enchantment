package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeCactusFlowerPot extends LargePottedBlock {
    public LargeCactusFlowerPot() {
        super("large_cactus_flower_pot", () -> Items.CACTUS_FLOWER, ModBlocks.LARGE_POT, ModBlocks.LARGE_DOUBLE_CACTUS_FLOWER_POT);
    }
}
