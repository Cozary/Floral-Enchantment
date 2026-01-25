package com.cozary.floralench.blocks.pots.double_pots;

import com.cozary.floralench.blocks.pots.LargePottedBlock;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeDoubleLilyOfTheValleyPot extends LargePottedBlock {
    public LargeDoubleLilyOfTheValleyPot() {
        super("large_double_lily_of_the_valley_pot", () -> Items.LILY_OF_THE_VALLEY, ModBlocks.LARGE_LILY_OF_THE_VALLEY_POT);
    }
}
