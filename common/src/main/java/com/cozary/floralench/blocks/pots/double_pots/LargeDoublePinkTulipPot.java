package com.cozary.floralench.blocks.pots.double_pots;

import com.cozary.floralench.blocks.pots.LargePottedBlock;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.world.item.Items;

public class LargeDoublePinkTulipPot extends LargePottedBlock {
    public LargeDoublePinkTulipPot() {
        super("large_double_pink_tulip_pot", () -> Items.PINK_TULIP, ModBlocks.LARGE_PINK_TULIP_POT);
    }
}
