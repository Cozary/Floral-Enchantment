package com.cozary.floralench.blocks.base;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;


public class MossyStoneBrickBlock extends Block {
    public MossyStoneBrickBlock() {
        super(Properties.of()
                .strength(2.0F, 6.0F)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()
                .mapColor(MapColor.STONE)
        );
    }
}
