package com.cozary.floralench.init;

import com.cozary.floralench.FloralEnchantment;
import com.cozary.floralench.blocks.base.BasketBase;
import com.cozary.floralench.blocks.base.BlockItemBase;
import com.google.common.collect.Sets;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

public class ModItems {

    private static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(Registries.ITEM, FloralEnchantment.MOD_ID);

    public static LinkedHashSet<RegistryObject<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();
    //Vines
    public static final RegistryObject<Item> DANDELION_VINE_ITEM = registerWithTab("dandelion_vine", () -> new BlockItemBase(ModBlocks.DANDELION_VINE.get()));
    public static final RegistryObject<Item> POPPY_VINE_ITEM = registerWithTab("poppy_vine", () -> new BlockItemBase(ModBlocks.POPPY_VINE.get()));
    public static final RegistryObject<Item> BLUE_ORCHID_VINE_ITEM = registerWithTab("blue_orchid_vine", () -> new BlockItemBase(ModBlocks.BLUE_ORCHID_VINE.get()));
    public static final RegistryObject<Item> ALLIUM_VINE_ITEM = registerWithTab("allium_vine", () -> new BlockItemBase(ModBlocks.ALLIUM_VINE.get()));
    public static final RegistryObject<Item> AZURE_BLUET_VINE_ITEM = registerWithTab("azure_bluet_vine", () -> new BlockItemBase(ModBlocks.AZURE_BLUET_VINE.get()));
    public static final RegistryObject<Item> RED_TULIP_VINE_ITEM = registerWithTab("red_tulip_vine", () -> new BlockItemBase(ModBlocks.RED_TULIP_VINE.get()));
    public static final RegistryObject<Item> ORANGE_TULIP_VINE_ITEM = registerWithTab("orange_tulip_vine", () -> new BlockItemBase(ModBlocks.ORANGE_TULIP_VINE.get()));
    public static final RegistryObject<Item> WHITE_TULIP_VINE_ITEM = registerWithTab("white_tulip_vine", () -> new BlockItemBase(ModBlocks.WHITE_TULIP_VINE.get()));
    public static final RegistryObject<Item> PINK_TULIP_VINE_ITEM = registerWithTab("pink_tulip_vine", () -> new BlockItemBase(ModBlocks.PINK_TULIP_VINE.get()));
    public static final RegistryObject<Item> OXEYE_DAISY_VINE_ITEM = registerWithTab("oxeye_daisy_vine", () -> new BlockItemBase(ModBlocks.OXEYE_DAISY_VINE.get()));
    public static final RegistryObject<Item> CORNFLOWER_VINE_ITEM = registerWithTab("cornflower_vine", () -> new BlockItemBase(ModBlocks.CORNFLOWER_VINE.get()));
    public static final RegistryObject<Item> LILY_OF_THE_VALLEY_VINE_ITEM = registerWithTab("lily_of_the_valley_vine", () -> new BlockItemBase(ModBlocks.LILY_OF_THE_VALLEY_VINE.get()));
    public static final RegistryObject<Item> WITHER_ROSE_VINE_ITEM = registerWithTab("wither_rose_vine", () -> new BlockItemBase(ModBlocks.WITHER_ROSE_VINE.get()));
    public static final RegistryObject<Item> SUNFLOWER_VINE_ITEM = registerWithTab("sunflower_vine", () -> new BlockItemBase(ModBlocks.SUNFLOWER_VINE.get()));
    public static final RegistryObject<Item> LILAC_VINE_ITEM = registerWithTab("lilac_vine", () -> new BlockItemBase(ModBlocks.LILAC_VINE.get()));
    public static final RegistryObject<Item> ROSE_BUSH_VINE_ITEM = registerWithTab("rose_bush_vine", () -> new BlockItemBase(ModBlocks.ROSE_BUSH_VINE.get()));
    public static final RegistryObject<Item> PEONY_VINE_ITEM = registerWithTab("peony_vine", () -> new BlockItemBase(ModBlocks.PEONY_VINE.get()));
    //Mossy Cobblestone
    public static final RegistryObject<Item> DANDELION_MOSSY_COBBLESTONE_ITEM = registerWithTab("dandelion_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.DANDELION_MOSSY_COBBLESTONE.get()));
    public static final RegistryObject<Item> POPPY_MOSSY_COBBLESTONE_ITEM = registerWithTab("poppy_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.POPPY_MOSSY_COBBLESTONE.get()));
    public static final RegistryObject<Item> BLUE_ORCHID_MOSSY_COBBLESTONE_ITEM = registerWithTab("blue_orchid_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.BLUE_ORCHID_MOSSY_COBBLESTONE.get()));
    public static final RegistryObject<Item> ALLIUM_MOSSY_COBBLESTONE_ITEM = registerWithTab("allium_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.ALLIUM_MOSSY_COBBLESTONE.get()));
    public static final RegistryObject<Item> AZURE_BLUET_MOSSY_COBBLESTONE_ITEM = registerWithTab("azure_bluet_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.AZURE_BLUET_MOSSY_COBBLESTONE.get()));
    public static final RegistryObject<Item> RED_TULIP_MOSSY_COBBLESTONE_ITEM = registerWithTab("red_tulip_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.RED_TULIP_MOSSY_COBBLESTONE.get()));
    public static final RegistryObject<Item> ORANGE_TULIP_MOSSY_COBBLESTONE_ITEM = registerWithTab("orange_tulip_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.ORANGE_TULIP_MOSSY_COBBLESTONE.get()));
    public static final RegistryObject<Item> WHITE_TULIP_MOSSY_COBBLESTONE_ITEM = registerWithTab("white_tulip_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.WHITE_TULIP_MOSSY_COBBLESTONE.get()));
    public static final RegistryObject<Item> PINK_TULIP_MOSSY_COBBLESTONE_ITEM = registerWithTab("pink_tulip_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.PINK_TULIP_MOSSY_COBBLESTONE.get()));
    public static final RegistryObject<Item> OXEYE_DAISY_MOSSY_COBBLESTONE_ITEM = registerWithTab("oxeye_daisy_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.OXEYE_DAISY_MOSSY_COBBLESTONE.get()));
    public static final RegistryObject<Item> CORNFLOWER_MOSSY_COBBLESTONE_ITEM = registerWithTab("cornflower_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.CORNFLOWER_MOSSY_COBBLESTONE.get()));
    public static final RegistryObject<Item> LILY_OF_THE_VALLEY_MOSSY_COBBLESTONE_ITEM = registerWithTab("lily_of_the_valley_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.LILY_OF_THE_VALLEY_MOSSY_COBBLESTONE.get()));
    public static final RegistryObject<Item> WITHER_ROSE_MOSSY_COBBLESTONE_ITEM = registerWithTab("wither_rose_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.WITHER_ROSE_MOSSY_COBBLESTONE.get()));
    public static final RegistryObject<Item> SUNFLOWER_MOSSY_COBBLESTONE_ITEM = registerWithTab("sunflower_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.SUNFLOWER_MOSSY_COBBLESTONE.get()));
    public static final RegistryObject<Item> LILAC_MOSSY_COBBLESTONE_ITEM = registerWithTab("lilac_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.LILAC_MOSSY_COBBLESTONE.get()));
    public static final RegistryObject<Item> ROSE_BUSH_MOSSY_COBBLESTONE_ITEM = registerWithTab("rose_bush_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.ROSE_BUSH_MOSSY_COBBLESTONE.get()));
    public static final RegistryObject<Item> PEONY_MOSSY_COBBLESTONE_ITEM = registerWithTab("peony_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.PEONY_MOSSY_COBBLESTONE.get()));
    //Bush
    public static final RegistryObject<Item> ALLIUM_BUSH_ITEM = registerWithTab("allium_bush", () -> new BlockItemBase(ModBlocks.ALLIUM_BUSH.get()));
    public static final RegistryObject<Item> AZURE_BLUET_BUSH_ITEM = registerWithTab("azure_bluet_bush", () -> new BlockItemBase(ModBlocks.AZURE_BLUET_BUSH.get()));
    public static final RegistryObject<Item> BLUE_ORCHID_BUSH_ITEM = registerWithTab("blue_orchid_bush", () -> new BlockItemBase(ModBlocks.BLUE_ORCHID_BUSH.get()));
    public static final RegistryObject<Item> CORNFLOWER_BUSH_ITEM = registerWithTab("cornflower_bush", () -> new BlockItemBase(ModBlocks.CORNFLOWER_BUSH.get()));
    public static final RegistryObject<Item> DANDELION_BUSH_ITEM = registerWithTab("dandelion_bush", () -> new BlockItemBase(ModBlocks.DANDELION_BUSH.get()));
    public static final RegistryObject<Item> LILAC_BUSH_ITEM = registerWithTab("lilac_bush", () -> new BlockItemBase(ModBlocks.LILAC_BUSH.get()));
    public static final RegistryObject<Item> LILY_OF_THE_VALLEY_BUSH_ITEM = registerWithTab("lily_of_the_valley_bush", () -> new BlockItemBase(ModBlocks.LILY_OF_THE_VALLEY_BUSH.get()));
    public static final RegistryObject<Item> ORANGE_TULIP_BUSH_ITEM = registerWithTab("orange_tulip_bush", () -> new BlockItemBase(ModBlocks.ORANGE_TULIP_BUSH.get()));
    public static final RegistryObject<Item> OXEYE_DAISY_BUSH_ITEM = registerWithTab("oxeye_daisy_bush", () -> new BlockItemBase(ModBlocks.OXEYE_DAISY_BUSH.get()));
    public static final RegistryObject<Item> PEONY_BUSH_ITEM = registerWithTab("peony_bush", () -> new BlockItemBase(ModBlocks.PEONY_BUSH.get()));
    public static final RegistryObject<Item> PINK_TULIP_BUSH_ITEM = registerWithTab("pink_tulip_bush", () -> new BlockItemBase(ModBlocks.PINK_TULIP_BUSH.get()));
    public static final RegistryObject<Item> POPPY_BUSH_ITEM = registerWithTab("poppy_bush", () -> new BlockItemBase(ModBlocks.POPPY_BUSH.get()));
    public static final RegistryObject<Item> RED_TULIP_BUSH_ITEM = registerWithTab("red_tulip_bush", () -> new BlockItemBase(ModBlocks.RED_TULIP_BUSH.get()));
    public static final RegistryObject<Item> ROSE_BUSH_BUSH_ITEM = registerWithTab("rose_bush_bush", () -> new BlockItemBase(ModBlocks.ROSE_BUSH_BUSH.get()));
    public static final RegistryObject<Item> SUNFLOWER_BUSH_ITEM = registerWithTab("sunflower_bush", () -> new BlockItemBase(ModBlocks.SUNFLOWER_BUSH.get()));
    public static final RegistryObject<Item> WHITE_TULIP_BUSH_ITEM = registerWithTab("white_tulip_bush", () -> new BlockItemBase(ModBlocks.WHITE_TULIP_BUSH.get()));
    public static final RegistryObject<Item> WITHER_ROSE_BUSH_ITEM = registerWithTab("wither_rose_bush", () -> new BlockItemBase(ModBlocks.WITHER_ROSE_BUSH.get()));
    //Corona Flowers
    public static final RegistryObject<Item> RED_CROWN = registerWithTab("red_crown", () -> new ArmorItem(ModArmorMaterial.RED, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_CROWN = registerWithTab("yellow_crown", () -> new ArmorItem(ModArmorMaterial.YELLOW, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BLUE_CROWN = registerWithTab("blue_crown", () -> new ArmorItem(ModArmorMaterial.BLUE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CROWN = registerWithTab("white_crown", () -> new ArmorItem(ModArmorMaterial.WHITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PINK_CROWN = registerWithTab("pink_crown", () -> new ArmorItem(ModArmorMaterial.PINK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BLACK_CROWN = registerWithTab("black_crown", () -> new ArmorItem(ModArmorMaterial.BLACK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> TULIPS_CROWN = registerWithTab("tulips_crown", () -> new ArmorItem(ModArmorMaterial.TULIP, ArmorItem.Type.HELMET, new Item.Properties()));
    //Mossy Stone Brick
    public static final RegistryObject<Item> DANDELION_MOSSY_STONE_BRICK_ITEM = registerWithTab("dandelion_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.DANDELION_MOSSY_STONE_BRICK.get()));
    public static final RegistryObject<Item> POPPY_MOSSY_STONE_BRICK_ITEM = registerWithTab("poppy_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.POPPY_MOSSY_STONE_BRICK.get()));
    public static final RegistryObject<Item> BLUE_ORCHID_MOSSY_STONE_BRICK_ITEM = registerWithTab("blue_orchid_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.BLUE_ORCHID_MOSSY_STONE_BRICK.get()));
    public static final RegistryObject<Item> ALLIUM_MOSSY_STONE_BRICK_ITEM = registerWithTab("allium_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.ALLIUM_MOSSY_STONE_BRICK.get()));
    public static final RegistryObject<Item> AZURE_BLUET_MOSSY_STONE_BRICK_ITEM = registerWithTab("azure_bluet_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.AZURE_BLUET_MOSSY_STONE_BRICK.get()));
    public static final RegistryObject<Item> RED_TULIP_MOSSY_STONE_BRICK_ITEM = registerWithTab("red_tulip_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.RED_TULIP_MOSSY_STONE_BRICK.get()));
    public static final RegistryObject<Item> ORANGE_TULIP_MOSSY_STONE_BRICK_ITEM = registerWithTab("orange_tulip_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.ORANGE_TULIP_MOSSY_STONE_BRICK.get()));
    public static final RegistryObject<Item> WHITE_TULIP_MOSSY_STONE_BRICK_ITEM = registerWithTab("white_tulip_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.WHITE_TULIP_MOSSY_STONE_BRICK.get()));
    public static final RegistryObject<Item> PINK_TULIP_MOSSY_STONE_BRICK_ITEM = registerWithTab("pink_tulip_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.PINK_TULIP_MOSSY_STONE_BRICK.get()));
    public static final RegistryObject<Item> OXEYE_DAISY_MOSSY_STONE_BRICK_ITEM = registerWithTab("oxeye_daisy_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.OXEYE_DAISY_MOSSY_STONE_BRICK.get()));
    public static final RegistryObject<Item> CORNFLOWER_MOSSY_STONE_BRICK_ITEM = registerWithTab("cornflower_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.CORNFLOWER_MOSSY_STONE_BRICK.get()));
    public static final RegistryObject<Item> LILY_OF_THE_VALLEY_MOSSY_STONE_BRICK_ITEM = registerWithTab("lily_of_the_valley_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.LILY_OF_THE_VALLEY_MOSSY_STONE_BRICK.get()));
    public static final RegistryObject<Item> WITHER_ROSE_MOSSY_STONE_BRICK_ITEM = registerWithTab("wither_rose_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.WITHER_ROSE_MOSSY_STONE_BRICK.get()));
    public static final RegistryObject<Item> SUNFLOWER_MOSSY_STONE_BRICK_ITEM = registerWithTab("sunflower_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.SUNFLOWER_MOSSY_STONE_BRICK.get()));
    public static final RegistryObject<Item> LILAC_MOSSY_STONE_BRICK_ITEM = registerWithTab("lilac_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.LILAC_MOSSY_STONE_BRICK.get()));
    public static final RegistryObject<Item> ROSE_BUSH_MOSSY_STONE_BRICK_ITEM = registerWithTab("rose_bush_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.ROSE_BUSH_MOSSY_STONE_BRICK.get()));
    public static final RegistryObject<Item> PEONY_MOSSY_STONE_BRICK_ITEM = registerWithTab("peony_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.PEONY_MOSSY_STONE_BRICK.get()));
    //Large Pots
    public static final RegistryObject<Item> LARGE_POT = registerWithTab("large_pot", () -> new BlockItemBase(ModBlocks.LARGE_POT.get()));
    public static final RegistryObject<Item> LARGE_DANDELION_POT = registerWithTab("large_dandelion_pot", () -> new BlockItemBase(ModBlocks.LARGE_DANDELION_POT.get()));
    public static final RegistryObject<Item> LARGE_POPPY_POT = registerWithTab("large_poppy_pot", () -> new BlockItemBase(ModBlocks.LARGE_POPPY_POT.get()));
    public static final RegistryObject<Item> LARGE_BLUE_ORCHID_POT = registerWithTab("large_blue_orchid_pot", () -> new BlockItemBase(ModBlocks.LARGE_BLUE_ORCHID_POT.get()));
    public static final RegistryObject<Item> LARGE_ALLIUM_POT = registerWithTab("large_allium_pot", () -> new BlockItemBase(ModBlocks.LARGE_ALLIUM_POT.get()));
    public static final RegistryObject<Item> LARGE_AZURE_BLUET_POT = registerWithTab("large_azure_bluet_pot", () -> new BlockItemBase(ModBlocks.LARGE_AZURE_BLUET_POT.get()));
    public static final RegistryObject<Item> LARGE_RED_TULIP_POT = registerWithTab("large_red_tulip_pot", () -> new BlockItemBase(ModBlocks.LARGE_RED_TULIP_POT.get()));
    public static final RegistryObject<Item> LARGE_ORANGE_TULIP_POT = registerWithTab("large_orange_tulip_pot", () -> new BlockItemBase(ModBlocks.LARGE_ORANGE_TULIP_POT.get()));
    public static final RegistryObject<Item> LARGE_WHITE_TULIP_POT = registerWithTab("large_white_tulip_pot", () -> new BlockItemBase(ModBlocks.LARGE_WHITE_TULIP_POT.get()));
    public static final RegistryObject<Item> LARGE_PINK_TULIP_POT = registerWithTab("large_pink_tulip_pot", () -> new BlockItemBase(ModBlocks.LARGE_PINK_TULIP_POT.get()));
    public static final RegistryObject<Item> LARGE_OXEYE_DAISY_POT = registerWithTab("large_oxeye_daisy_pot", () -> new BlockItemBase(ModBlocks.LARGE_OXEYE_DAISY_POT.get()));
    public static final RegistryObject<Item> LARGE_CORNFLOWER_POT = registerWithTab("large_cornflower_pot", () -> new BlockItemBase(ModBlocks.LARGE_CORNFLOWER_POT.get()));
    public static final RegistryObject<Item> LARGE_LILY_OF_THE_VALLEY_POT = registerWithTab("large_lily_of_the_valley_pot", () -> new BlockItemBase(ModBlocks.LARGE_LILY_OF_THE_VALLEY_POT.get()));
    public static final RegistryObject<Item> LARGE_WITHER_ROSE_POT = registerWithTab("large_wither_rose_pot", () -> new BlockItemBase(ModBlocks.LARGE_WITHER_ROSE_POT.get()));
    public static final RegistryObject<Item> LARGE_SUNFLOWER_POT = registerWithTab("large_sunflower_pot", () -> new BlockItemBase(ModBlocks.LARGE_SUNFLOWER_POT.get()));
    public static final RegistryObject<Item> LARGE_LILAC_POT = registerWithTab("large_lilac_pot", () -> new BlockItemBase(ModBlocks.LARGE_LILAC_POT.get()));
    public static final RegistryObject<Item> LARGE_ROSE_BUSH_POT = registerWithTab("large_rose_bush_pot", () -> new BlockItemBase(ModBlocks.LARGE_ROSE_BUSH_POT.get()));
    public static final RegistryObject<Item> LARGE_PEONY_POT = registerWithTab("large_peony_pot", () -> new BlockItemBase(ModBlocks.LARGE_PEONY_POT.get()));
    //Large Double Pot
    public static final RegistryObject<Item> LARGE_DOUBLE_DANDELION_POT = registerWithTab("large_double_dandelion_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_DANDELION_POT.get()));
    public static final RegistryObject<Item> LARGE_DOUBLE_POPPY_POT = registerWithTab("large_double_poppy_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_POPPY_POT.get()));
    public static final RegistryObject<Item> LARGE_DOUBLE_BLUE_ORCHID_POT = registerWithTab("large_double_blue_orchid_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_BLUE_ORCHID_POT.get()));
    public static final RegistryObject<Item> LARGE_DOUBLE_ALLIUM_POT = registerWithTab("large_double_allium_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_ALLIUM_POT.get()));
    public static final RegistryObject<Item> LARGE_DOUBLE_AZURE_BLUET_POT = registerWithTab("large_double_azure_bluet_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_AZURE_BLUET_POT.get()));
    public static final RegistryObject<Item> LARGE_DOUBLE_RED_TULIP_POT = registerWithTab("large_double_red_tulip_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_RED_TULIP_POT.get()));
    public static final RegistryObject<Item> LARGE_DOUBLE_ORANGE_TULIP_POT = registerWithTab("large_double_orange_tulip_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_ORANGE_TULIP_POT.get()));
    public static final RegistryObject<Item> LARGE_DOUBLE_WHITE_TULIP_POT = registerWithTab("large_double_white_tulip_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_WHITE_TULIP_POT.get()));
    public static final RegistryObject<Item> LARGE_DOUBLE_PINK_TULIP_POT = registerWithTab("large_double_pink_tulip_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_PINK_TULIP_POT.get()));
    public static final RegistryObject<Item> LARGE_DOUBLE_OXEYE_DAISY_POT = registerWithTab("large_double_oxeye_daisy_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_OXEYE_DAISY_POT.get()));
    public static final RegistryObject<Item> LARGE_DOUBLE_CORNFLOWER_POT = registerWithTab("large_double_cornflower_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_CORNFLOWER_POT.get()));
    public static final RegistryObject<Item> LARGE_DOUBLE_LILY_OF_THE_VALLEY_POT = registerWithTab("large_double_lily_of_the_valley_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_LILY_OF_THE_VALLEY_POT.get()));
    public static final RegistryObject<Item> LARGE_DOUBLE_WITHER_ROSE_POT = registerWithTab("large_double_wither_rose_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_WITHER_ROSE_POT.get()));
    //Special
    public static final RegistryObject<Item> DANCING_SUNFLOWER = registerWithTab("dancing_sunflower", () -> new BlockItemBase(ModBlocks.DANCING_SUNFLOWER.get()));
    //Floral Baskets
    public static final RegistryObject<Item> FLORAL_BASKET = registerWithTab("floral_basket", () -> new BlockItemBase(ModBlocks.FLORAL_BASKET.get()));
    public static final RegistryObject<Item> DANDELION_BASKET = registerWithTab("dandelion_basket", () -> new BasketBase(ModBlocks.DANDELION_BASKET.get()));
    public static final RegistryObject<Item> POPPY_BASKET = registerWithTab("poppy_basket", () -> new BasketBase(ModBlocks.POPPY_BASKET.get()));
    public static final RegistryObject<Item> BLUE_ORCHID_BASKET = registerWithTab("blue_orchid_basket", () -> new BasketBase(ModBlocks.BLUE_ORCHID_BASKET.get()));
    public static final RegistryObject<Item> ALLIUM_BASKET = registerWithTab("allium_basket", () -> new BasketBase(ModBlocks.ALLIUM_BASKET.get()));
    public static final RegistryObject<Item> AZURE_BLUET_BASKET = registerWithTab("azure_bluet_basket", () -> new BasketBase(ModBlocks.AZURE_BLUET_BASKET.get()));
    public static final RegistryObject<Item> RED_TULIP_BASKET = registerWithTab("red_tulip_basket", () -> new BasketBase(ModBlocks.RED_TULIP_BASKET.get()));
    public static final RegistryObject<Item> ORANGE_TULIP_BASKET = registerWithTab("orange_tulip_basket", () -> new BasketBase(ModBlocks.ORANGE_TULIP_BASKET.get()));
    public static final RegistryObject<Item> WHITE_TULIP_BASKET = registerWithTab("white_tulip_basket", () -> new BasketBase(ModBlocks.WHITE_TULIP_BASKET.get()));
    public static final RegistryObject<Item> PINK_TULIP_BASKET = registerWithTab("pink_tulip_basket", () -> new BasketBase(ModBlocks.PINK_TULIP_BASKET.get()));
    public static final RegistryObject<Item> OXEYE_DAISY_BASKET = registerWithTab("oxeye_daisy_basket", () -> new BasketBase(ModBlocks.OXEYE_DAISY_BASKET.get()));
    public static final RegistryObject<Item> CORNFLOWER_BASKET = registerWithTab("cornflower_basket", () -> new BasketBase(ModBlocks.CORNFLOWER_BASKET.get()));
    public static final RegistryObject<Item> LILY_OF_THE_VALLEY_BASKET = registerWithTab("lily_of_the_valley_basket", () -> new BasketBase(ModBlocks.LILY_OF_THE_VALLEY_BASKET.get()));
    public static final RegistryObject<Item> WITHER_ROSE_BASKET = registerWithTab("wither_rose_basket", () -> new BasketBase(ModBlocks.WITHER_ROSE_BASKET.get()));

    public static RegistryObject<Item> registerWithTab(final String name, final Supplier<? extends Item> supplier) {
        RegistryObject<Item> item = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(item);
        return item;
    }

    public static void loadClass() {
    }

}


