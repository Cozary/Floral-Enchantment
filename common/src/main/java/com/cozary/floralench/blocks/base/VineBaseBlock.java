package com.cozary.floralench.blocks.base;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.VineBlock;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class VineBaseBlock extends VineBlock {
    public VineBaseBlock() {
        super(Properties.of()
                .noCollission()
                .randomTicks()
                .strength(0.2F)
                .sound(SoundType.VINE)
                .mapColor(MapColor.PLANT)
                .replaceable()
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY)
        );
    }
}
