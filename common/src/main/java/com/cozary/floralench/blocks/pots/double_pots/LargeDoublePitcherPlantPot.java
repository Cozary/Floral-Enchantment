package com.cozary.floralench.blocks.pots.double_pots;

import com.cozary.floralench.blocks.pots.LargePottedBlock;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeDoublePitcherPlantPot extends LargePottedBlock {
    public LargeDoublePitcherPlantPot() {
        super("large_double_pitcher_plant_pot", () -> Items.PITCHER_PLANT, ModBlocks.LARGE_PITCHER_PLANT_POT);
    }
}
