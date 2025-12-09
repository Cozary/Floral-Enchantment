package com.cozary.floralench.init;

import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.function.BiConsumer;

import static com.cozary.floralench.FloralEnchantment.MOD_ID;

public interface ModEquipmentAssets {
    ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID = ResourceKey.createRegistryKey(ResourceLocation.withDefaultNamespace("equipment_asset"));
    ResourceKey<EquipmentAsset> RED = createId("red_crown");
    ResourceKey<EquipmentAsset> YELLOW = createId("yellow_crown");
    ResourceKey<EquipmentAsset> BLUE = createId("blue_crown");
    ResourceKey<EquipmentAsset> WHITE = createId("white_crown");
    ResourceKey<EquipmentAsset> PINK = createId("pink_crown");
    ResourceKey<EquipmentAsset> BLACK = createId("black_crown");
    ResourceKey<EquipmentAsset> TULIP = createId("tulip_crown");

    static ResourceKey<EquipmentAsset> createId(String name) {
        return ResourceKey.create(ROOT_ID, ResourceLocation.fromNamespaceAndPath(MOD_ID, name));
    }

    public static void bootstrap(BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> consumer) {
        consumer.accept(ModEquipmentAssets.RED, onlyHumanoid("red_crown"));
        consumer.accept(ModEquipmentAssets.YELLOW, onlyHumanoid("yellow_crown"));
        consumer.accept(ModEquipmentAssets.BLUE, onlyHumanoid("blue_crown"));
        consumer.accept(ModEquipmentAssets.WHITE, onlyHumanoid("white_crown"));
        consumer.accept(ModEquipmentAssets.PINK, onlyHumanoid("pink_crown"));
        consumer.accept(ModEquipmentAssets.BLACK, onlyHumanoid("black_crown"));
        consumer.accept(ModEquipmentAssets.TULIP, onlyHumanoid("tulip_crown"));
    }

    private static EquipmentClientInfo onlyHumanoid(String name) {
        return EquipmentClientInfo.builder().addHumanoidLayers(ResourceLocation.fromNamespaceAndPath(MOD_ID, name)).build();
    }
}
