package com.cozary.floralench.init;

import com.cozary.floralench.FloralEnchantment;
import com.cozary.floralench.blocks.base.BasketBase;
import com.cozary.floralench.blocks.base.BlockItemBase;
import com.google.common.collect.Sets;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

public class ModItems {

    //OPEN_EYEBLOSSOM
    //CLOSED_EYEBLOSSOM
    //open_eyeblossom
    //closed_eyeblossom

    public static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(Registries.ITEM, FloralEnchantment.MOD_ID);

    public static LinkedHashSet<RegistryObject<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();
    //Vines
    public static final RegistryObject<Item> DANDELION_VINE_ITEM = registerWithTab("dandelion_vine", () -> new BlockItemBase(ModBlocks.DANDELION_VINE.get(), "dandelion_vine"));
    public static final RegistryObject<Item> POPPY_VINE_ITEM = registerWithTab("poppy_vine", () -> new BlockItemBase(ModBlocks.POPPY_VINE.get(), "poppy_vine"));
    public static final RegistryObject<Item> BLUE_ORCHID_VINE_ITEM = registerWithTab("blue_orchid_vine", () -> new BlockItemBase(ModBlocks.BLUE_ORCHID_VINE.get(), "blue_orchid_vine"));
    public static final RegistryObject<Item> ALLIUM_VINE_ITEM = registerWithTab("allium_vine", () -> new BlockItemBase(ModBlocks.ALLIUM_VINE.get(), "allium_vine"));
    public static final RegistryObject<Item> AZURE_BLUET_VINE_ITEM = registerWithTab("azure_bluet_vine", () -> new BlockItemBase(ModBlocks.AZURE_BLUET_VINE.get(), "azure_bluet_vine"));
    public static final RegistryObject<Item> RED_TULIP_VINE_ITEM = registerWithTab("red_tulip_vine", () -> new BlockItemBase(ModBlocks.RED_TULIP_VINE.get(), "red_tulip_vine"));
    public static final RegistryObject<Item> ORANGE_TULIP_VINE_ITEM = registerWithTab("orange_tulip_vine", () -> new BlockItemBase(ModBlocks.ORANGE_TULIP_VINE.get(), "orange_tulip_vine"));
    public static final RegistryObject<Item> WHITE_TULIP_VINE_ITEM = registerWithTab("white_tulip_vine", () -> new BlockItemBase(ModBlocks.WHITE_TULIP_VINE.get(), "white_tulip_vine"));
    public static final RegistryObject<Item> PINK_TULIP_VINE_ITEM = registerWithTab("pink_tulip_vine", () -> new BlockItemBase(ModBlocks.PINK_TULIP_VINE.get(), "pink_tulip_vine"));
    public static final RegistryObject<Item> OXEYE_DAISY_VINE_ITEM = registerWithTab("oxeye_daisy_vine", () -> new BlockItemBase(ModBlocks.OXEYE_DAISY_VINE.get(), "oxeye_daisy_vine"));
    public static final RegistryObject<Item> CORNFLOWER_VINE_ITEM = registerWithTab("cornflower_vine", () -> new BlockItemBase(ModBlocks.CORNFLOWER_VINE.get(), "cornflower_vine"));
    public static final RegistryObject<Item> LILY_OF_THE_VALLEY_VINE_ITEM = registerWithTab("lily_of_the_valley_vine", () -> new BlockItemBase(ModBlocks.LILY_OF_THE_VALLEY_VINE.get(), "lily_of_the_valley_vine"));
    public static final RegistryObject<Item> WITHER_ROSE_VINE_ITEM = registerWithTab("wither_rose_vine", () -> new BlockItemBase(ModBlocks.WITHER_ROSE_VINE.get(), "wither_rose_vine"));
    public static final RegistryObject<Item> SUNFLOWER_VINE_ITEM = registerWithTab("sunflower_vine", () -> new BlockItemBase(ModBlocks.SUNFLOWER_VINE.get(), "sunflower_vine"));
    public static final RegistryObject<Item> LILAC_VINE_ITEM = registerWithTab("lilac_vine", () -> new BlockItemBase(ModBlocks.LILAC_VINE.get(), "lilac_vine"));
    public static final RegistryObject<Item> ROSE_BUSH_VINE_ITEM = registerWithTab("rose_bush_vine", () -> new BlockItemBase(ModBlocks.ROSE_BUSH_VINE.get(), "rose_bush_vine"));
    public static final RegistryObject<Item> PEONY_VINE_ITEM = registerWithTab("peony_vine", () -> new BlockItemBase(ModBlocks.PEONY_VINE.get(), "peony_vine"));
    public static final RegistryObject<Item> TORCHFLOWER_VINE_ITEM = registerWithTab("torchflower_vine", () -> new BlockItemBase(ModBlocks.TORCHFLOWER_VINE.get(), "torchflower_vine"));
    public static final RegistryObject<Item> PITCHER_PLANT_VINE_ITEM = registerWithTab("pitcher_plant_vine", () -> new BlockItemBase(ModBlocks.PITCHER_PLANT_VINE.get(), "pitcher_plant_vine"));
    public static final RegistryObject<Item> CHORUS_FLOWER_VINE_ITEM = registerWithTab("chorus_flower_vine", () -> new BlockItemBase(ModBlocks.CHORUS_FLOWER_VINE.get(), "chorus_flower_vine"));
    public static final RegistryObject<Item> AZALEA_VINE_ITEM = registerWithTab("azalea_vine", () -> new BlockItemBase(ModBlocks.AZALEA_VINE.get(), "azalea_vine"));
    public static final RegistryObject<Item> PINK_PETALS_VINE_ITEM = registerWithTab("pink_petals_vine", () -> new BlockItemBase(ModBlocks.PINK_PETALS_VINE.get(), "pink_petals_vine"));
    public static final RegistryObject<Item> SPORE_BLOSSOM_VINE_ITEM = registerWithTab("spore_blossom_vine", () -> new BlockItemBase(ModBlocks.SPORE_BLOSSOM_VINE.get(), "spore_blossom_vine"));
    public static final RegistryObject<Item> OPEN_EYEBLOSSOM_VINE_ITEM = registerWithTab("open_eyeblossom_vine", () -> new BlockItemBase(ModBlocks.OPEN_EYEBLOSSOM_VINE.get(), "open_eyeblossom_vine"));
    public static final RegistryObject<Item> CLOSED_EYEBLOSSOM_VINE_ITEM = registerWithTab("closed_eyeblossom_vine", () -> new BlockItemBase(ModBlocks.CLOSED_EYEBLOSSOM_VINE.get(), "closed_eyeblossom_vine"));
    //Mossy Cobblestone
    public static final RegistryObject<Item> DANDELION_MOSSY_COBBLESTONE_ITEM = registerWithTab("dandelion_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.DANDELION_MOSSY_COBBLESTONE.get(), "dandelion_mossy_cobblestone"));
    public static final RegistryObject<Item> POPPY_MOSSY_COBBLESTONE_ITEM = registerWithTab("poppy_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.POPPY_MOSSY_COBBLESTONE.get(), "poppy_mossy_cobblestone"));
    public static final RegistryObject<Item> BLUE_ORCHID_MOSSY_COBBLESTONE_ITEM = registerWithTab("blue_orchid_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.BLUE_ORCHID_MOSSY_COBBLESTONE.get(), "blue_orchid_mossy_cobblestone"));
    public static final RegistryObject<Item> ALLIUM_MOSSY_COBBLESTONE_ITEM = registerWithTab("allium_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.ALLIUM_MOSSY_COBBLESTONE.get(), "allium_mossy_cobblestone"));
    public static final RegistryObject<Item> AZURE_BLUET_MOSSY_COBBLESTONE_ITEM = registerWithTab("azure_bluet_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.AZURE_BLUET_MOSSY_COBBLESTONE.get(), "azure_bluet_mossy_cobblestone"));
    public static final RegistryObject<Item> RED_TULIP_MOSSY_COBBLESTONE_ITEM = registerWithTab("red_tulip_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.RED_TULIP_MOSSY_COBBLESTONE.get(), "red_tulip_mossy_cobblestone"));
    public static final RegistryObject<Item> ORANGE_TULIP_MOSSY_COBBLESTONE_ITEM = registerWithTab("orange_tulip_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.ORANGE_TULIP_MOSSY_COBBLESTONE.get(), "orange_tulip_mossy_cobblestone"));
    public static final RegistryObject<Item> WHITE_TULIP_MOSSY_COBBLESTONE_ITEM = registerWithTab("white_tulip_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.WHITE_TULIP_MOSSY_COBBLESTONE.get(), "white_tulip_mossy_cobblestone"));
    public static final RegistryObject<Item> PINK_TULIP_MOSSY_COBBLESTONE_ITEM = registerWithTab("pink_tulip_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.PINK_TULIP_MOSSY_COBBLESTONE.get(), "pink_tulip_mossy_cobblestone"));
    public static final RegistryObject<Item> OXEYE_DAISY_MOSSY_COBBLESTONE_ITEM = registerWithTab("oxeye_daisy_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.OXEYE_DAISY_MOSSY_COBBLESTONE.get(), "oxeye_daisy_mossy_cobblestone"));
    public static final RegistryObject<Item> CORNFLOWER_MOSSY_COBBLESTONE_ITEM = registerWithTab("cornflower_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.CORNFLOWER_MOSSY_COBBLESTONE.get(), "cornflower_mossy_cobblestone"));
    public static final RegistryObject<Item> LILY_OF_THE_VALLEY_MOSSY_COBBLESTONE_ITEM = registerWithTab("lily_of_the_valley_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.LILY_OF_THE_VALLEY_MOSSY_COBBLESTONE.get(), "lily_of_the_valley_mossy_cobblestone"));
    public static final RegistryObject<Item> WITHER_ROSE_MOSSY_COBBLESTONE_ITEM = registerWithTab("wither_rose_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.WITHER_ROSE_MOSSY_COBBLESTONE.get(), "wither_rose_mossy_cobblestone"));
    public static final RegistryObject<Item> SUNFLOWER_MOSSY_COBBLESTONE_ITEM = registerWithTab("sunflower_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.SUNFLOWER_MOSSY_COBBLESTONE.get(), "sunflower_mossy_cobblestone"));
    public static final RegistryObject<Item> LILAC_MOSSY_COBBLESTONE_ITEM = registerWithTab("lilac_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.LILAC_MOSSY_COBBLESTONE.get(), "lilac_mossy_cobblestone"));
    public static final RegistryObject<Item> ROSE_BUSH_MOSSY_COBBLESTONE_ITEM = registerWithTab("rose_bush_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.ROSE_BUSH_MOSSY_COBBLESTONE.get(), "rose_bush_mossy_cobblestone"));
    public static final RegistryObject<Item> PEONY_MOSSY_COBBLESTONE_ITEM = registerWithTab("peony_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.PEONY_MOSSY_COBBLESTONE.get(), "peony_mossy_cobblestone"));
    public static final RegistryObject<Item> TORCHFLOWER_MOSSY_COBBLESTONE_ITEM = registerWithTab("torchflower_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.TORCHFLOWER_MOSSY_COBBLESTONE.get(), "torchflower_mossy_cobblestone"));
    public static final RegistryObject<Item> PITCHER_PLANT_MOSSY_COBBLESTONE_ITEM = registerWithTab("pitcher_plant_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.PITCHER_PLANT_MOSSY_COBBLESTONE.get(), "pitcher_plant_mossy_cobblestone"));
    public static final RegistryObject<Item> CHORUS_FLOWER_MOSSY_COBBLESTONE_ITEM = registerWithTab("chorus_flower_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.CHORUS_FLOWER_MOSSY_COBBLESTONE.get(), "chorus_flower_mossy_cobblestone"));
    public static final RegistryObject<Item> AZALEA_MOSSY_COBBLESTONE_ITEM = registerWithTab("azalea_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.AZALEA_MOSSY_COBBLESTONE.get(), "azalea_mossy_cobblestone"));
    public static final RegistryObject<Item> PINK_PETALS_MOSSY_COBBLESTONE_ITEM = registerWithTab("pink_petals_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.PINK_PETALS_MOSSY_COBBLESTONE.get(), "pink_petals_mossy_cobblestone"));
    public static final RegistryObject<Item> SPORE_BLOSSOM_MOSSY_COBBLESTONE_ITEM = registerWithTab("spore_blossom_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.SPORE_BLOSSOM_MOSSY_COBBLESTONE.get(), "spore_blossom_mossy_cobblestone"));
    public static final RegistryObject<Item> OPEN_EYEBLOSSOM_MOSSY_COBBLESTONE_ITEM = registerWithTab("open_eyeblossom_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.OPEN_EYEBLOSSOM_MOSSY_COBBLESTONE.get(), "open_eyeblossom_mossy_cobblestone"));
    public static final RegistryObject<Item> CLOSED_EYEBLOSSOM_MOSSY_COBBLESTONE_ITEM = registerWithTab("closed_eyeblossom_mossy_cobblestone", () -> new BlockItemBase(ModBlocks.CLOSED_EYEBLOSSOM_MOSSY_COBBLESTONE.get(), "closed_eyeblossom_mossy_cobblestone"));

    //Bush
    public static final RegistryObject<Item> ALLIUM_BUSH_ITEM = registerWithTab("allium_bush", () -> new BlockItemBase(ModBlocks.ALLIUM_BUSH.get(), "allium_bush"));
    public static final RegistryObject<Item> AZURE_BLUET_BUSH_ITEM = registerWithTab("azure_bluet_bush", () -> new BlockItemBase(ModBlocks.AZURE_BLUET_BUSH.get(), "azure_bluet_bush"));
    public static final RegistryObject<Item> BLUE_ORCHID_BUSH_ITEM = registerWithTab("blue_orchid_bush", () -> new BlockItemBase(ModBlocks.BLUE_ORCHID_BUSH.get(), "blue_orchid_bush"));
    public static final RegistryObject<Item> CORNFLOWER_BUSH_ITEM = registerWithTab("cornflower_bush", () -> new BlockItemBase(ModBlocks.CORNFLOWER_BUSH.get(), "cornflower_bush"));
    public static final RegistryObject<Item> DANDELION_BUSH_ITEM = registerWithTab("dandelion_bush", () -> new BlockItemBase(ModBlocks.DANDELION_BUSH.get(), "dandelion_bush"));
    public static final RegistryObject<Item> LILAC_BUSH_ITEM = registerWithTab("lilac_bush", () -> new BlockItemBase(ModBlocks.LILAC_BUSH.get(), "lilac_bush"));
    public static final RegistryObject<Item> LILY_OF_THE_VALLEY_BUSH_ITEM = registerWithTab("lily_of_the_valley_bush", () -> new BlockItemBase(ModBlocks.LILY_OF_THE_VALLEY_BUSH.get(), "lily_of_the_valley_bush"));
    public static final RegistryObject<Item> ORANGE_TULIP_BUSH_ITEM = registerWithTab("orange_tulip_bush", () -> new BlockItemBase(ModBlocks.ORANGE_TULIP_BUSH.get(), "orange_tulip_bush"));
    public static final RegistryObject<Item> OXEYE_DAISY_BUSH_ITEM = registerWithTab("oxeye_daisy_bush", () -> new BlockItemBase(ModBlocks.OXEYE_DAISY_BUSH.get(), "oxeye_daisy_bush"));
    public static final RegistryObject<Item> PEONY_BUSH_ITEM = registerWithTab("peony_bush", () -> new BlockItemBase(ModBlocks.PEONY_BUSH.get(), "peony_bush"));
    public static final RegistryObject<Item> PINK_TULIP_BUSH_ITEM = registerWithTab("pink_tulip_bush", () -> new BlockItemBase(ModBlocks.PINK_TULIP_BUSH.get(), "pink_tulip_bush"));
    public static final RegistryObject<Item> POPPY_BUSH_ITEM = registerWithTab("poppy_bush", () -> new BlockItemBase(ModBlocks.POPPY_BUSH.get(), "poppy_bush"));
    public static final RegistryObject<Item> RED_TULIP_BUSH_ITEM = registerWithTab("red_tulip_bush", () -> new BlockItemBase(ModBlocks.RED_TULIP_BUSH.get(), "red_tulip_bush"));
    public static final RegistryObject<Item> ROSE_BUSH_BUSH_ITEM = registerWithTab("rose_bush_bush", () -> new BlockItemBase(ModBlocks.ROSE_BUSH_BUSH.get(), "rose_bush_bush"));
    public static final RegistryObject<Item> SUNFLOWER_BUSH_ITEM = registerWithTab("sunflower_bush", () -> new BlockItemBase(ModBlocks.SUNFLOWER_BUSH.get(), "sunflower_bush"));
    public static final RegistryObject<Item> WHITE_TULIP_BUSH_ITEM = registerWithTab("white_tulip_bush", () -> new BlockItemBase(ModBlocks.WHITE_TULIP_BUSH.get(), "white_tulip_bush"));
    public static final RegistryObject<Item> WITHER_ROSE_BUSH_ITEM = registerWithTab("wither_rose_bush", () -> new BlockItemBase(ModBlocks.WITHER_ROSE_BUSH.get(), "wither_rose_bush"));
    public static final RegistryObject<Item> TORCHFLOWER_BUSH_ITEM = registerWithTab("torchflower_bush", () -> new BlockItemBase(ModBlocks.TORCHFLOWER_BUSH.get(), "torchflower_bush"));
    public static final RegistryObject<Item> PITCHER_PLANT_BUSH_ITEM = registerWithTab("pitcher_plant_bush", () -> new BlockItemBase(ModBlocks.PITCHER_PLANT_BUSH.get(), "pitcher_plant_bush"));
    public static final RegistryObject<Item> CHORUS_FLOWER_BUSH_ITEM = registerWithTab("chorus_flower_bush", () -> new BlockItemBase(ModBlocks.CHORUS_FLOWER_BUSH.get(), "chorus_flower_bush"));
    public static final RegistryObject<Item> AZALEA_BUSH_ITEM = registerWithTab("azalea_bush", () -> new BlockItemBase(ModBlocks.AZALEA_BUSH.get(), "azalea_bush"));
    public static final RegistryObject<Item> PINK_PETALS_BUSH_ITEM = registerWithTab("pink_petals_bush", () -> new BlockItemBase(ModBlocks.PINK_PETALS_BUSH.get(), "pink_petals_bush"));
    public static final RegistryObject<Item> SPORE_BLOSSOM_BUSH_ITEM = registerWithTab("spore_blossom_bush", () -> new BlockItemBase(ModBlocks.SPORE_BLOSSOM_BUSH.get(), "spore_blossom_bush"));
    public static final RegistryObject<Item> OPEN_EYEBLOSSOM_BUSH_ITEM = registerWithTab("open_eyeblossom_bush", () -> new BlockItemBase(ModBlocks.OPEN_EYEBLOSSOM_BUSH.get(), "open_eyeblossom_bush"));
    public static final RegistryObject<Item> CLOSED_EYEBLOSSOM_BUSH_ITEM = registerWithTab("closed_eyeblossom_bush", () -> new BlockItemBase(ModBlocks.CLOSED_EYEBLOSSOM_BUSH.get(), "closed_eyeblossom_bush"));
    //Corona Flowers
    public static final RegistryObject<Item> RED_CROWN = registerWithTab("red_crown", () -> new ArmorItem(ModArmorMaterials.RED, ArmorType.HELMET, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(FloralEnchantment.MOD_ID, "red_crown")))));
    public static final RegistryObject<Item> YELLOW_CROWN = registerWithTab("yellow_crown", () -> new ArmorItem(ModArmorMaterials.YELLOW, ArmorType.HELMET, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(FloralEnchantment.MOD_ID, "yellow_crown")))));
    public static final RegistryObject<Item> BLUE_CROWN = registerWithTab("blue_crown", () -> new ArmorItem(ModArmorMaterials.BLUE, ArmorType.HELMET, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(FloralEnchantment.MOD_ID, "blue_crown")))));
    public static final RegistryObject<Item> WHITE_CROWN = registerWithTab("white_crown", () -> new ArmorItem(ModArmorMaterials.WHITE, ArmorType.HELMET, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(FloralEnchantment.MOD_ID, "white_crown")))));
    public static final RegistryObject<Item> PINK_CROWN = registerWithTab("pink_crown", () -> new ArmorItem(ModArmorMaterials.PINK, ArmorType.HELMET, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(FloralEnchantment.MOD_ID, "pink_crown")))));
    public static final RegistryObject<Item> BLACK_CROWN = registerWithTab("black_crown", () -> new ArmorItem(ModArmorMaterials.BLACK, ArmorType.HELMET, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(FloralEnchantment.MOD_ID, "black_crown")))));
    public static final RegistryObject<Item> TULIPS_CROWN = registerWithTab("tulips_crown", () -> new ArmorItem(ModArmorMaterials.TULIP, ArmorType.HELMET, new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(FloralEnchantment.MOD_ID, "tulips_crown")))));
    //Mossy Stone Brick
    public static final RegistryObject<Item> DANDELION_MOSSY_STONE_BRICK_ITEM = registerWithTab("dandelion_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.DANDELION_MOSSY_STONE_BRICK.get(), "dandelion_mossy_stone_brick"));
    public static final RegistryObject<Item> POPPY_MOSSY_STONE_BRICK_ITEM = registerWithTab("poppy_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.POPPY_MOSSY_STONE_BRICK.get(), "poppy_mossy_stone_brick"));
    public static final RegistryObject<Item> BLUE_ORCHID_MOSSY_STONE_BRICK_ITEM = registerWithTab("blue_orchid_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.BLUE_ORCHID_MOSSY_STONE_BRICK.get(), "blue_orchid_mossy_stone_brick"));
    public static final RegistryObject<Item> ALLIUM_MOSSY_STONE_BRICK_ITEM = registerWithTab("allium_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.ALLIUM_MOSSY_STONE_BRICK.get(), "allium_mossy_stone_brick"));
    public static final RegistryObject<Item> AZURE_BLUET_MOSSY_STONE_BRICK_ITEM = registerWithTab("azure_bluet_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.AZURE_BLUET_MOSSY_STONE_BRICK.get(), "azure_bluet_mossy_stone_brick"));
    public static final RegistryObject<Item> RED_TULIP_MOSSY_STONE_BRICK_ITEM = registerWithTab("red_tulip_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.RED_TULIP_MOSSY_STONE_BRICK.get(), "red_tulip_mossy_stone_brick"));
    public static final RegistryObject<Item> ORANGE_TULIP_MOSSY_STONE_BRICK_ITEM = registerWithTab("orange_tulip_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.ORANGE_TULIP_MOSSY_STONE_BRICK.get(), "orange_tulip_mossy_stone_brick"));
    public static final RegistryObject<Item> WHITE_TULIP_MOSSY_STONE_BRICK_ITEM = registerWithTab("white_tulip_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.WHITE_TULIP_MOSSY_STONE_BRICK.get(), "white_tulip_mossy_stone_brick"));
    public static final RegistryObject<Item> PINK_TULIP_MOSSY_STONE_BRICK_ITEM = registerWithTab("pink_tulip_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.PINK_TULIP_MOSSY_STONE_BRICK.get(), "pink_tulip_mossy_stone_brick"));
    public static final RegistryObject<Item> OXEYE_DAISY_MOSSY_STONE_BRICK_ITEM = registerWithTab("oxeye_daisy_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.OXEYE_DAISY_MOSSY_STONE_BRICK.get(), "oxeye_daisy_mossy_stone_brick"));
    public static final RegistryObject<Item> CORNFLOWER_MOSSY_STONE_BRICK_ITEM = registerWithTab("cornflower_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.CORNFLOWER_MOSSY_STONE_BRICK.get(), "cornflower_mossy_stone_brick"));
    public static final RegistryObject<Item> LILY_OF_THE_VALLEY_MOSSY_STONE_BRICK_ITEM = registerWithTab("lily_of_the_valley_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.LILY_OF_THE_VALLEY_MOSSY_STONE_BRICK.get(), "lily_of_the_valley_mossy_stone_brick"));
    public static final RegistryObject<Item> WITHER_ROSE_MOSSY_STONE_BRICK_ITEM = registerWithTab("wither_rose_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.WITHER_ROSE_MOSSY_STONE_BRICK.get(), "wither_rose_mossy_stone_brick"));
    public static final RegistryObject<Item> SUNFLOWER_MOSSY_STONE_BRICK_ITEM = registerWithTab("sunflower_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.SUNFLOWER_MOSSY_STONE_BRICK.get(), "sunflower_mossy_stone_brick"));
    public static final RegistryObject<Item> LILAC_MOSSY_STONE_BRICK_ITEM = registerWithTab("lilac_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.LILAC_MOSSY_STONE_BRICK.get(), "lilac_mossy_stone_brick"));
    public static final RegistryObject<Item> ROSE_BUSH_MOSSY_STONE_BRICK_ITEM = registerWithTab("rose_bush_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.ROSE_BUSH_MOSSY_STONE_BRICK.get(), "rose_bush_mossy_stone_brick"));
    public static final RegistryObject<Item> PEONY_MOSSY_STONE_BRICK_ITEM = registerWithTab("peony_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.PEONY_MOSSY_STONE_BRICK.get(), "peony_mossy_stone_brick"));
    public static final RegistryObject<Item> TORCHFLOWER_MOSSY_STONE_BRICK_ITEM = registerWithTab("torchflower_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.TORCHFLOWER_MOSSY_STONE_BRICK.get(), "torchflower_mossy_stone_brick"));
    public static final RegistryObject<Item> PITCHER_PLANT_MOSSY_STONE_BRICK_ITEM = registerWithTab("pitcher_plant_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.PITCHER_PLANT_MOSSY_STONE_BRICK.get(), "pitcher_plant_mossy_stone_brick"));
    public static final RegistryObject<Item> CHORUS_FLOWER_MOSSY_STONE_BRICK_ITEM = registerWithTab("chorus_flower_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.CHORUS_FLOWER_MOSSY_STONE_BRICK.get(), "chorus_flower_mossy_stone_brick"));
    public static final RegistryObject<Item> AZALEA_MOSSY_STONE_BRICK_ITEM = registerWithTab("azalea_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.AZALEA_MOSSY_STONE_BRICK.get(), "azalea_mossy_stone_brick"));
    public static final RegistryObject<Item> PINK_PETALS_MOSSY_STONE_BRICK_ITEM = registerWithTab("pink_petals_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.PINK_PETALS_MOSSY_STONE_BRICK.get(), "pink_petals_mossy_stone_brick"));
    public static final RegistryObject<Item> SPORE_BLOSSOM_MOSSY_STONE_BRICK_ITEM = registerWithTab("spore_blossom_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.SPORE_BLOSSOM_MOSSY_STONE_BRICK.get(), "spore_blossom_mossy_stone_brick"));
    public static final RegistryObject<Item> OPEN_EYEBLOSSOM_MOSSY_STONE_BRICK_ITEM = registerWithTab("open_eyeblossom_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.OPEN_EYEBLOSSOM_MOSSY_STONE_BRICK.get(), "open_eyeblossom_mossy_stone_brick"));
    public static final RegistryObject<Item> CLOSED_EYEBLOSSOM_MOSSY_STONE_BRICK_ITEM = registerWithTab("closed_eyeblossom_mossy_stone_brick", () -> new BlockItemBase(ModBlocks.CLOSED_EYEBLOSSOM_MOSSY_STONE_BRICK.get(), "closed_eyeblossom_mossy_stone_brick"));
    //Large Pots
    public static final RegistryObject<Item> LARGE_POT = registerWithTab("large_pot", () -> new BlockItemBase(ModBlocks.LARGE_POT.get(), "large_pot"));
    public static final RegistryObject<Item> LARGE_DANDELION_POT = registerWithTab("large_dandelion_pot", () -> new BlockItemBase(ModBlocks.LARGE_DANDELION_POT.get(), "large_dandelion_pot"));
    public static final RegistryObject<Item> LARGE_POPPY_POT = registerWithTab("large_poppy_pot", () -> new BlockItemBase(ModBlocks.LARGE_POPPY_POT.get(), "large_poppy_pot"));
    public static final RegistryObject<Item> LARGE_BLUE_ORCHID_POT = registerWithTab("large_blue_orchid_pot", () -> new BlockItemBase(ModBlocks.LARGE_BLUE_ORCHID_POT.get(), "large_blue_orchid_pot"));
    public static final RegistryObject<Item> LARGE_ALLIUM_POT = registerWithTab("large_allium_pot", () -> new BlockItemBase(ModBlocks.LARGE_ALLIUM_POT.get(), "large_allium_pot"));
    public static final RegistryObject<Item> LARGE_AZURE_BLUET_POT = registerWithTab("large_azure_bluet_pot", () -> new BlockItemBase(ModBlocks.LARGE_AZURE_BLUET_POT.get(), "large_azure_bluet_pot"));
    public static final RegistryObject<Item> LARGE_RED_TULIP_POT = registerWithTab("large_red_tulip_pot", () -> new BlockItemBase(ModBlocks.LARGE_RED_TULIP_POT.get(), "large_red_tulip_pot"));
    public static final RegistryObject<Item> LARGE_ORANGE_TULIP_POT = registerWithTab("large_orange_tulip_pot", () -> new BlockItemBase(ModBlocks.LARGE_ORANGE_TULIP_POT.get(), "large_orange_tulip_pot"));
    public static final RegistryObject<Item> LARGE_WHITE_TULIP_POT = registerWithTab("large_white_tulip_pot", () -> new BlockItemBase(ModBlocks.LARGE_WHITE_TULIP_POT.get(), "large_white_tulip_pot"));
    public static final RegistryObject<Item> LARGE_PINK_TULIP_POT = registerWithTab("large_pink_tulip_pot", () -> new BlockItemBase(ModBlocks.LARGE_PINK_TULIP_POT.get(), "large_pink_tulip_pot"));
    public static final RegistryObject<Item> LARGE_OXEYE_DAISY_POT = registerWithTab("large_oxeye_daisy_pot", () -> new BlockItemBase(ModBlocks.LARGE_OXEYE_DAISY_POT.get(), "large_oxeye_daisy_pot"));
    public static final RegistryObject<Item> LARGE_CORNFLOWER_POT = registerWithTab("large_cornflower_pot", () -> new BlockItemBase(ModBlocks.LARGE_CORNFLOWER_POT.get(), "large_cornflower_pot"));
    public static final RegistryObject<Item> LARGE_LILY_OF_THE_VALLEY_POT = registerWithTab("large_lily_of_the_valley_pot", () -> new BlockItemBase(ModBlocks.LARGE_LILY_OF_THE_VALLEY_POT.get(), "large_lily_of_the_valley_pot"));
    public static final RegistryObject<Item> LARGE_WITHER_ROSE_POT = registerWithTab("large_wither_rose_pot", () -> new BlockItemBase(ModBlocks.LARGE_WITHER_ROSE_POT.get(), "large_wither_rose_pot"));
    public static final RegistryObject<Item> LARGE_SUNFLOWER_POT = registerWithTab("large_sunflower_pot", () -> new BlockItemBase(ModBlocks.LARGE_SUNFLOWER_POT.get(), "large_sunflower_pot"));
    public static final RegistryObject<Item> LARGE_LILAC_POT = registerWithTab("large_lilac_pot", () -> new BlockItemBase(ModBlocks.LARGE_LILAC_POT.get(), "large_lilac_pot"));
    public static final RegistryObject<Item> LARGE_ROSE_BUSH_POT = registerWithTab("large_rose_bush_pot", () -> new BlockItemBase(ModBlocks.LARGE_ROSE_BUSH_POT.get(), "large_rose_bush_pot"));
    public static final RegistryObject<Item> LARGE_PEONY_POT = registerWithTab("large_peony_pot", () -> new BlockItemBase(ModBlocks.LARGE_PEONY_POT.get(), "large_peony_pot"));
    public static final RegistryObject<Item> LARGE_TORCHFLOWER_POT = registerWithTab("large_torchflower_pot", () -> new BlockItemBase(ModBlocks.LARGE_TORCHFLOWER_POT.get(), "large_torchflower_pot"));
    public static final RegistryObject<Item> LARGE_PITCHER_PLANT_POT = registerWithTab("large_pitcher_plant_pot", () -> new BlockItemBase(ModBlocks.LARGE_PITCHER_PLANT_POT.get(), "large_pitcher_plant_pot"));
    public static final RegistryObject<Item> LARGE_AZALEA_POT = registerWithTab("large_azalea_pot", () -> new BlockItemBase(ModBlocks.LARGE_AZALEA_POT.get(), "large_azalea_pot"));
    public static final RegistryObject<Item> LARGE_SPORE_BLOSSOM_POT = registerWithTab("large_spore_blossom_pot", () -> new BlockItemBase(ModBlocks.LARGE_SPORE_BLOSSOM_POT.get(), "large_spore_blossom_pot"));
    public static final RegistryObject<Item> LARGE_OPEN_EYEBLOSSOM_POT = registerWithTab("large_open_eyeblossom_pot", () -> new BlockItemBase(ModBlocks.LARGE_OPEN_EYEBLOSSOM_POT.get(), "large_open_eyeblossom_pot"));
    public static final RegistryObject<Item> LARGE_CLOSED_EYEBLOSSOM_POT = registerWithTab("large_closed_eyeblossom_pot", () -> new BlockItemBase(ModBlocks.LARGE_CLOSED_EYEBLOSSOM_POT.get(), "large_closed_eyeblossom_pot"));
    //Large Double Pot
    public static final RegistryObject<Item> LARGE_DOUBLE_DANDELION_POT = registerWithTab("large_double_dandelion_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_DANDELION_POT.get(), "large_double_dandelion_pot"));
    public static final RegistryObject<Item> LARGE_DOUBLE_POPPY_POT = registerWithTab("large_double_poppy_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_POPPY_POT.get(), "large_double_poppy_pot"));
    public static final RegistryObject<Item> LARGE_DOUBLE_BLUE_ORCHID_POT = registerWithTab("large_double_blue_orchid_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_BLUE_ORCHID_POT.get(), "large_double_blue_orchid_pot"));
    public static final RegistryObject<Item> LARGE_DOUBLE_ALLIUM_POT = registerWithTab("large_double_allium_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_ALLIUM_POT.get(), "large_double_allium_pot"));
    public static final RegistryObject<Item> LARGE_DOUBLE_AZURE_BLUET_POT = registerWithTab("large_double_azure_bluet_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_AZURE_BLUET_POT.get(), "large_double_azure_bluet_pot"));
    public static final RegistryObject<Item> LARGE_DOUBLE_RED_TULIP_POT = registerWithTab("large_double_red_tulip_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_RED_TULIP_POT.get(), "large_double_red_tulip_pot"));
    public static final RegistryObject<Item> LARGE_DOUBLE_ORANGE_TULIP_POT = registerWithTab("large_double_orange_tulip_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_ORANGE_TULIP_POT.get(), "large_double_orange_tulip_pot"));
    public static final RegistryObject<Item> LARGE_DOUBLE_WHITE_TULIP_POT = registerWithTab("large_double_white_tulip_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_WHITE_TULIP_POT.get(), "large_double_white_tulip_pot"));
    public static final RegistryObject<Item> LARGE_DOUBLE_PINK_TULIP_POT = registerWithTab("large_double_pink_tulip_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_PINK_TULIP_POT.get(), "large_double_pink_tulip_pot"));
    public static final RegistryObject<Item> LARGE_DOUBLE_OXEYE_DAISY_POT = registerWithTab("large_double_oxeye_daisy_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_OXEYE_DAISY_POT.get(), "large_double_oxeye_daisy_pot"));
    public static final RegistryObject<Item> LARGE_DOUBLE_CORNFLOWER_POT = registerWithTab("large_double_cornflower_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_CORNFLOWER_POT.get(), "large_double_cornflower_pot"));
    public static final RegistryObject<Item> LARGE_DOUBLE_LILY_OF_THE_VALLEY_POT = registerWithTab("large_double_lily_of_the_valley_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_LILY_OF_THE_VALLEY_POT.get(), "large_double_lily_of_the_valley_pot"));
    public static final RegistryObject<Item> LARGE_DOUBLE_WITHER_ROSE_POT = registerWithTab("large_double_wither_rose_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_WITHER_ROSE_POT.get(), "large_double_wither_rose_pot"));
    public static final RegistryObject<Item> LARGE_DOUBLE_TORCHFLOWER_POT = registerWithTab("large_double_torchflower_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_TORCHFLOWER_POT.get(), "large_double_torchflower_pot"));
    public static final RegistryObject<Item> LARGE_DOUBLE_PITCHER_PLANT_POT = registerWithTab("large_double_pitcher_plant_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_PITCHER_PLANT_POT.get(), "large_double_pitcher_plant_pot"));
    public static final RegistryObject<Item> LARGE_DOUBLE_AZALEA_POT = registerWithTab("large_double_azalea_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_AZALEA_POT.get(), "large_double_azalea_pot"));
    public static final RegistryObject<Item> LARGE_DOUBLE_SPORE_BLOSSOM_POT = registerWithTab("large_double_spore_blossom_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_SPORE_BLOSSOM_POT.get(), "large_double_spore_blossom_pot"));
    public static final RegistryObject<Item> LARGE_DOUBLE_OPEN_EYEBLOSSOM_POT = registerWithTab("large_double_open_eyeblossom_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_OPEN_EYEBLOSSOM_POT.get(), "large_double_open_eyeblossom_pot"));
    public static final RegistryObject<Item> LARGE_DOUBLE_CLOSED_EYEBLOSSOM_POT = registerWithTab("large_double_closed_eyeblossom_pot", () -> new BlockItemBase(ModBlocks.LARGE_DOUBLE_CLOSED_EYEBLOSSOM_POT.get(), "large_double_closed_eyeblossom_pot"));
    //Special
    public static final RegistryObject<Item> DANCING_SUNFLOWER = registerWithTab("dancing_sunflower", () -> new BlockItemBase(ModBlocks.DANCING_SUNFLOWER.get(), "dancing_sunflower"));
    //Floral Baskets
    public static final RegistryObject<Item> FLORAL_BASKET = registerWithTab("floral_basket", () -> new BlockItemBase(ModBlocks.FLORAL_BASKET.get(), "floral_basket"));
    public static final RegistryObject<Item> DANDELION_BASKET = registerWithTab("dandelion_basket", () -> new BasketBase(ModBlocks.DANDELION_BASKET.get(), "dandelion_basket"));
    public static final RegistryObject<Item> POPPY_BASKET = registerWithTab("poppy_basket", () -> new BasketBase(ModBlocks.POPPY_BASKET.get(), "poppy_basket"));
    public static final RegistryObject<Item> BLUE_ORCHID_BASKET = registerWithTab("blue_orchid_basket", () -> new BasketBase(ModBlocks.BLUE_ORCHID_BASKET.get(), "blue_orchid_basket"));
    public static final RegistryObject<Item> ALLIUM_BASKET = registerWithTab("allium_basket", () -> new BasketBase(ModBlocks.ALLIUM_BASKET.get(), "allium_basket"));
    public static final RegistryObject<Item> AZURE_BLUET_BASKET = registerWithTab("azure_bluet_basket", () -> new BasketBase(ModBlocks.AZURE_BLUET_BASKET.get(), "azure_bluet_basket"));
    public static final RegistryObject<Item> RED_TULIP_BASKET = registerWithTab("red_tulip_basket", () -> new BasketBase(ModBlocks.RED_TULIP_BASKET.get(), "red_tulip_basket"));
    public static final RegistryObject<Item> ORANGE_TULIP_BASKET = registerWithTab("orange_tulip_basket", () -> new BasketBase(ModBlocks.ORANGE_TULIP_BASKET.get(), "orange_tulip_basket"));
    public static final RegistryObject<Item> WHITE_TULIP_BASKET = registerWithTab("white_tulip_basket", () -> new BasketBase(ModBlocks.WHITE_TULIP_BASKET.get(), "white_tulip_basket"));
    public static final RegistryObject<Item> PINK_TULIP_BASKET = registerWithTab("pink_tulip_basket", () -> new BasketBase(ModBlocks.PINK_TULIP_BASKET.get(), "pink_tulip_basket"));
    public static final RegistryObject<Item> OXEYE_DAISY_BASKET = registerWithTab("oxeye_daisy_basket", () -> new BasketBase(ModBlocks.OXEYE_DAISY_BASKET.get(), "oxeye_daisy_basket"));
    public static final RegistryObject<Item> CORNFLOWER_BASKET = registerWithTab("cornflower_basket", () -> new BasketBase(ModBlocks.CORNFLOWER_BASKET.get(), "cornflower_basket"));
    public static final RegistryObject<Item> LILY_OF_THE_VALLEY_BASKET = registerWithTab("lily_of_the_valley_basket", () -> new BasketBase(ModBlocks.LILY_OF_THE_VALLEY_BASKET.get(), "lily_of_the_valley_basket"));
    public static final RegistryObject<Item> WITHER_ROSE_BASKET = registerWithTab("wither_rose_basket", () -> new BasketBase(ModBlocks.WITHER_ROSE_BASKET.get(), "wither_rose_basket"));
    public static final RegistryObject<Item> TORCHFLOWER_BASKET = registerWithTab("torchflower_basket", () -> new BasketBase(ModBlocks.TORCHFLOWER_BASKET.get(), "torchflower_basket"));
    public static final RegistryObject<Item> PITCHER_PLANT_BASKET = registerWithTab("pitcher_plant_basket", () -> new BasketBase(ModBlocks.PITCHER_PLANT_BASKET.get(), "pitcher_plant_basket"));
    public static final RegistryObject<Item> AZALEA_BASKET = registerWithTab("azalea_basket", () -> new BasketBase(ModBlocks.AZALEA_BASKET.get(), "azalea_basket"));
    public static final RegistryObject<Item> SPORE_BLOSSOM_BASKET = registerWithTab("spore_blossom_basket", () -> new BasketBase(ModBlocks.SPORE_BLOSSOM_BASKET.get(), "spore_blossom_basket"));
    public static final RegistryObject<Item> OPEN_EYEBLOSSOM_BASKET = registerWithTab("open_eyeblossom_basket", () -> new BasketBase(ModBlocks.OPEN_EYEBLOSSOM_BASKET.get(), "open_eyeblossom_basket"));
    public static final RegistryObject<Item> CLOSED_EYEBLOSSOM_BASKET = registerWithTab("closed_eyeblossom_basket", () -> new BasketBase(ModBlocks.CLOSED_EYEBLOSSOM_BASKET.get(), "closed_eyeblossom_basket"));

    public static RegistryObject<Item> registerWithTab(final String name, final Supplier<? extends Item> supplier) {
        RegistryObject<Item> item = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(item);
        return item;
    }

    public static void loadClass() {
    }

}


