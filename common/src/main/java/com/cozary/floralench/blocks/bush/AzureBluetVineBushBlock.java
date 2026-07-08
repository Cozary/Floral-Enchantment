package com.cozary.floralench.blocks.bush;

import com.cozary.floralench.blocks.base.VineBushBlock;
import com.cozary.floralench.init.ModItems;
import net.minecraft.world.item.Items;

public class AzureBluetVineBushBlock extends VineBushBlock {

    public AzureBluetVineBushBlock() {
        super("azure_bluet_bush", () -> Items.AZURE_BLUET, () -> ModItems.AZURE_BLUET_VINE_ITEM.get());
    }
}

