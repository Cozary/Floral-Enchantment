package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class PitcherPlantVineBushBlock extends VineBushBlock {

    public PitcherPlantVineBushBlock() {
        super("pitcher_plant_bush", () -> Items.PITCHER_PLANT, () -> ModItems.PITCHER_PLANT_VINE_ITEM.get());
    }
}

