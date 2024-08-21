package com.cozary.floralench;

import com.cozary.floralench.init.ModBlocks;
import com.cozary.floralench.init.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class FloralEnchantmentFabric implements ModInitializer {

    private static final ResourceKey<CreativeModeTab> ITEM_GROUP = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(FloralEnchantment.MOD_ID, "floralench_tab"));

    @Override
    public void onInitialize() {

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ITEM_GROUP, FabricItemGroup.builder()
                .title(Component.translatable("itemGroup.floralench"))
                .icon(() -> new ItemStack(ModBlocks.ALLIUM_MOSSY_STONE_BRICK.get()))
                .displayItems((parameters, output) -> ModItems.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(item.get())))
                .build()
        );

        FloralEnchantment.init();
    }

}
