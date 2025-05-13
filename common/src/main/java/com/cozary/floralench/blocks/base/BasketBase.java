package com.cozary.floralench.blocks.base;

import com.cozary.floralench.FloralEnchantment;
import com.cozary.floralench.init.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class BasketBase extends BlockItem {

    public BasketBase(Block block, String name) {
        super(block, new Properties()
                .setId(ResourceKey.create(
                        Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath(FloralEnchantment.MOD_ID, name)
                ))
                .craftRemainder(ModItems.FLORAL_BASKET.get()));
    }

}
