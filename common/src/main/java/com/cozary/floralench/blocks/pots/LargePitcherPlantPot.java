package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargePitcherPlantPot extends LargePottedBlock {
    public LargePitcherPlantPot() {
        super("large_pitcher_plant_pot", () -> Items.PITCHER_PLANT, ModBlocks.LARGE_POT, ModBlocks.LARGE_DOUBLE_PITCHER_PLANT_POT);
    }
}
