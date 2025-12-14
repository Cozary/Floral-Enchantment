package com.cozary.floralench.blocks.base;

import com.cozary.floralench.FloralEnchantment;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;


public class MossyStoneBrickBlock extends Block {
    public MossyStoneBrickBlock(String name) {
        super(Properties.of()
                .setId(ResourceKey.create(
                        Registries.BLOCK,
                        Identifier.fromNamespaceAndPath(FloralEnchantment.MOD_ID, name)
                ))
                .strength(2.0F, 6.0F)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()
                .mapColor(MapColor.STONE)
        );
    }
}
