package com.cozary.floralench.compat;

import com.cozary.floralench.FloralEnchantment;
import com.cozary.floralench.init.ModItems;
import com.cozary.floralench.init.RegistryObject;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.Map;

@JeiPlugin
public class FloralenchJeiPlugin implements IModPlugin {
    private static final ResourceLocation ID = ResourceLocation.fromNamespaceAndPath(FloralEnchantment.MOD_ID, "jei_plugin");
    private static final Map<RegistryObject<Item>, String> VINE_BUSH_TRANSLATION_KEYS = Map.ofEntries(
            Map.entry(ModItems.DANDELION_VINE_ITEM, "dandelion_bush"),
            Map.entry(ModItems.POPPY_VINE_ITEM, "poppy_bush"),
            Map.entry(ModItems.BLUE_ORCHID_VINE_ITEM, "blue_orchid_bush"),
            Map.entry(ModItems.ALLIUM_VINE_ITEM, "allium_bush"),
            Map.entry(ModItems.AZURE_BLUET_VINE_ITEM, "azure_bluet_bush"),
            Map.entry(ModItems.RED_TULIP_VINE_ITEM, "red_tulip_bush"),
            Map.entry(ModItems.ORANGE_TULIP_VINE_ITEM, "orange_tulip_bush"),
            Map.entry(ModItems.WHITE_TULIP_VINE_ITEM, "white_tulip_bush"),
            Map.entry(ModItems.PINK_TULIP_VINE_ITEM, "pink_tulip_bush"),
            Map.entry(ModItems.OXEYE_DAISY_VINE_ITEM, "oxeye_daisy_bush"),
            Map.entry(ModItems.CORNFLOWER_VINE_ITEM, "cornflower_bush"),
            Map.entry(ModItems.LILY_OF_THE_VALLEY_VINE_ITEM, "lily_of_the_valley_bush"),
            Map.entry(ModItems.WITHER_ROSE_VINE_ITEM, "wither_rose_bush"),
            Map.entry(ModItems.SUNFLOWER_VINE_ITEM, "sunflower_bush"),
            Map.entry(ModItems.LILAC_VINE_ITEM, "lilac_bush"),
            Map.entry(ModItems.ROSE_BUSH_VINE_ITEM, "rose_bush_bush"),
            Map.entry(ModItems.PEONY_VINE_ITEM, "peony_bush"),
            Map.entry(ModItems.TORCHFLOWER_VINE_ITEM, "torchflower_bush"),
            Map.entry(ModItems.PITCHER_PLANT_VINE_ITEM, "pitcher_plant_bush"),
            Map.entry(ModItems.CHORUS_FLOWER_VINE_ITEM, "chorus_flower_bush"),
            Map.entry(ModItems.AZALEA_VINE_ITEM, "azalea_bush"),
            Map.entry(ModItems.PINK_PETALS_VINE_ITEM, "pink_petals_bush"),
            Map.entry(ModItems.SPORE_BLOSSOM_VINE_ITEM, "spore_blossom_bush")
    );

    @Override
    public ResourceLocation getPluginUid() {
        return ID;
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        for (Map.Entry<RegistryObject<Item>, String> entry : VINE_BUSH_TRANSLATION_KEYS.entrySet()) {
            ItemStack stack = new ItemStack(entry.getKey().get());
            Component bushComponent = Component.translatable("block.floralench." + entry.getValue());
            registration.addIngredientInfo(stack, VanillaTypes.ITEM_STACK,
                    Component.translatable("jei.floralench.vine_info", bushComponent));
        }
    }
}


