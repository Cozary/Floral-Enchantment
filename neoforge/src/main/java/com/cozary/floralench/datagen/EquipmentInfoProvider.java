package com.cozary.floralench.datagen;

import com.cozary.floralench.init.ModEquipmentAssets;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static com.cozary.floralench.FloralEnchantment.MOD_ID;

public class EquipmentInfoProvider implements DataProvider {

    private final PackOutput.PathProvider path;

    public EquipmentInfoProvider(PackOutput output) {
        this.path = output.createPathProvider(PackOutput.Target.RESOURCE_PACK, "equipment");
    }

    @Override
    public CompletableFuture<?> run(CachedOutput output) {
        Map<ResourceKey<EquipmentAsset>, EquipmentClientInfo> map = new HashMap<>();
        ModEquipmentAssets.bootstrap((key, info) -> {
            if (map.putIfAbsent(key, info) != null) {
                throw new IllegalStateException("Duplicate equipment model for id: " + key.location().toString());
            }
        });
        return DataProvider.saveAll(output, EquipmentClientInfo.CODEC, this.path::json, map);
    }

    @Override
    public String getName() {
        return "Equipment Client Infos: " + MOD_ID;
    }
}