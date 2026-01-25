package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeLilyOfTheValleyPot extends LargePottedBlock {
    public LargeLilyOfTheValleyPot() {
        super("large_lily_of_the_valley_pot", () -> Items.LILY_OF_THE_VALLEY, ModBlocks.LARGE_POT, ModBlocks.LARGE_DOUBLE_LILY_OF_THE_VALLEY_POT);
    }
}
