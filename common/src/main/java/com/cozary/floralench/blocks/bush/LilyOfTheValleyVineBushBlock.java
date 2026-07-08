package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class LilyOfTheValleyVineBushBlock extends VineBushBlock {

    public LilyOfTheValleyVineBushBlock() {
        super("lily_of_the_valley_bush", () -> Items.LILY_OF_THE_VALLEY, () -> ModItems.LILY_OF_THE_VALLEY_VINE_ITEM.get());
    }
}

