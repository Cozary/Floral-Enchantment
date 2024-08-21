package com.cozary.floralench.init;

import com.cozary.floralench.FloralEnchantment;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public final class ModArmorMaterials {

    public static final Holder<ArmorMaterial> RED;
    public static final Holder<ArmorMaterial> YELLOW;
    public static final Holder<ArmorMaterial> BLUE;
    public static final Holder<ArmorMaterial> WHITE;
    public static final Holder<ArmorMaterial> PINK;
    public static final Holder<ArmorMaterial> BLACK;
    public static final Holder<ArmorMaterial> TULIP;

    static {
        RED = register("red", Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.BOOTS, 1);
            map.put(ArmorItem.Type.LEGGINGS, 4);
            map.put(ArmorItem.Type.CHESTPLATE, 5);
            map.put(ArmorItem.Type.HELMET, 2);
        }), 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.POPPY, Items.ROSE_BUSH), List.of(new ArmorMaterial.Layer(new ResourceLocation(FloralEnchantment.MOD_ID, "red"))));
        YELLOW = register("yellow", Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.BOOTS, 1);
            map.put(ArmorItem.Type.LEGGINGS, 4);
            map.put(ArmorItem.Type.CHESTPLATE, 5);
            map.put(ArmorItem.Type.HELMET, 2);
        }), 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.DANDELION, Items.SUNFLOWER), List.of(new ArmorMaterial.Layer(new ResourceLocation(FloralEnchantment.MOD_ID, "yellow"))));
        BLUE = register("blue", Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.BOOTS, 1);
            map.put(ArmorItem.Type.LEGGINGS, 4);
            map.put(ArmorItem.Type.CHESTPLATE, 5);
            map.put(ArmorItem.Type.HELMET, 2);
        }), 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.BLUE_ORCHID, Items.CORNFLOWER), List.of(new ArmorMaterial.Layer(new ResourceLocation(FloralEnchantment.MOD_ID, "blue"))));
        WHITE = register("white", Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.BOOTS, 1);
            map.put(ArmorItem.Type.LEGGINGS, 4);
            map.put(ArmorItem.Type.CHESTPLATE, 5);
            map.put(ArmorItem.Type.HELMET, 2);
        }), 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.AZURE_BLUET, Items.OXEYE_DAISY, Items.LILY_OF_THE_VALLEY), List.of(new ArmorMaterial.Layer(new ResourceLocation(FloralEnchantment.MOD_ID, "white"))));
        PINK = register("pink", Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.BOOTS, 1);
            map.put(ArmorItem.Type.LEGGINGS, 4);
            map.put(ArmorItem.Type.CHESTPLATE, 5);
            map.put(ArmorItem.Type.HELMET, 2);
        }), 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.ALLIUM, Items.LILAC, Items.PEONY), List.of(new ArmorMaterial.Layer(new ResourceLocation(FloralEnchantment.MOD_ID, "pink"))));
        BLACK = register("black", Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.BOOTS, 1);
            map.put(ArmorItem.Type.LEGGINGS, 4);
            map.put(ArmorItem.Type.CHESTPLATE, 5);
            map.put(ArmorItem.Type.HELMET, 2);
        }), 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.WITHER_ROSE), List.of(new ArmorMaterial.Layer(new ResourceLocation(FloralEnchantment.MOD_ID, "black"))));
        TULIP = register("tulip", Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.BOOTS, 1);
            map.put(ArmorItem.Type.LEGGINGS, 4);
            map.put(ArmorItem.Type.CHESTPLATE, 5);
            map.put(ArmorItem.Type.HELMET, 2);
        }), 15, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(Items.ORANGE_TULIP, Items.RED_TULIP, Items.PINK_TULIP, Items.WHITE_TULIP), List.of(new ArmorMaterial.Layer(new ResourceLocation(FloralEnchantment.MOD_ID, "tulip"))));
    }

    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> defense, int enchantmentValue, Holder<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient, List<ArmorMaterial.Layer> layers) {
        ResourceLocation loc = new ResourceLocation(FloralEnchantment.MOD_ID, name);
        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, loc, new ArmorMaterial(defense, enchantmentValue, equipSound, repairIngredient, layers, toughness, knockbackResistance));
    }
}
