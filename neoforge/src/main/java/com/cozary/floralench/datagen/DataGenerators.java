package com.cozary.floralench.datagen;

import com.cozary.floralench.FloralEnchantment;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.data.event.GatherDataRegistryEntriesEvent;

@EventBusSubscriber(modid = FloralEnchantment.MOD_ID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        event.createProvider(ModModelProvider::new);
        event.createProvider(EquipmentInfoProvider::new);
    }

    @SubscribeEvent
    public static void gatherServerData(GatherDataEvent.Server event) {
        event.createProvider(ModBlockTagProvider::new);
    }

    @SubscribeEvent
    public static void gatherRegistryEntries(GatherDataRegistryEntriesEvent event) {
        event.recipe(ModRecipeProvider::new);
        event.lootTable(new LootTableProvider.SubProviderEntry(
                ModLootTableProvider::new,
                LootContextParamSets.BLOCK
        ));
    }
}