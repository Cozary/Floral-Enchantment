package com.cozary.floralench.init;

import com.cozary.floralench.FloralEnchantment;
import net.minecraft.Util;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.Map;

public interface ModEquipmentAssets {
    ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID = ResourceKey.createRegistryKey(ResourceLocation.fromNamespaceAndPath(FloralEnchantment.MOD_ID,"equipment_asset"));
    ResourceKey<EquipmentAsset> RED = createId("red");
    ResourceKey<EquipmentAsset> YELLOW = createId("yellow");
    ResourceKey<EquipmentAsset> BLUE = createId("blue");
    ResourceKey<EquipmentAsset> WHITE = createId("white");
    ResourceKey<EquipmentAsset> PINK = createId("pink");
    ResourceKey<EquipmentAsset> BLACK = createId("black");
    ResourceKey<EquipmentAsset> TULIP = createId("tulip");

    static ResourceKey<EquipmentAsset> createId(String name) {
        return ResourceKey.create(ROOT_ID, ResourceLocation.withDefaultNamespace(name));
    }
}
