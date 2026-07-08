package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class WhiteTulipVineBushBlock extends VineBushBlock {

    public WhiteTulipVineBushBlock() {
        super("white_tulip_bush", () -> Items.WHITE_TULIP, () -> ModItems.WHITE_TULIP_VINE_ITEM.get());
    }
}

