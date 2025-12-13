package com.cozary.floralench.blocks.base;

import com.cozary.floralench.FloralEnchantment;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.VineBlock;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class VineBaseBlock extends VineBlock {
    public VineBaseBlock(String name) {
        super(Properties.of()
                .setId(ResourceKey.create(
                        Registries.BLOCK,
                        ResourceLocation.fromNamespaceAndPath(FloralEnchantment.MOD_ID, name)
                ))
                .noCollision()
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
