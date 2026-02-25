package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class OrangeTulipVineBushBlock extends VineBushBlock {

    public OrangeTulipVineBushBlock() {
        super("orange_tulip_bush", () -> Items.ORANGE_TULIP, ModItems.ORANGE_TULIP_VINE_ITEM);
    }
}
