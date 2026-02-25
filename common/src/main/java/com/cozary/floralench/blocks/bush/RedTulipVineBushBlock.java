package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class RedTulipVineBushBlock extends VineBushBlock {

    public RedTulipVineBushBlock() {
        super("red_tulip_bush", () -> Items.RED_TULIP, ModItems.RED_TULIP_VINE_ITEM);
    }
}
