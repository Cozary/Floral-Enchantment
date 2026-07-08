package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class PinkTulipVineBushBlock extends VineBushBlock {

    public PinkTulipVineBushBlock() {
        super("pink_tulip_bush", () -> Items.PINK_TULIP, () -> ModItems.PINK_TULIP_VINE_ITEM.get());
    }
}

