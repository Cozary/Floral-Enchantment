package com.cozary.floralench.init;

import com.cozary.floralench.FloralEnchantment;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.resources.ResourceLocation;

import java.util.EnumMap;
import java.util.List;

import static com.cozary.floralench.FloralEnchantment.MOD_ID;

public class ModArmorMaterial {

    public static final RegistrationProvider<ArmorMaterial> ARMOR_MATERIALS = RegistrationProvider.get(Registries.ARMOR_MATERIAL, MOD_ID);

    public static final Holder<ArmorMaterial> RED_ARMOR_MATERIAL =
            ARMOR_MATERIALS.register("red", () -> new ArmorMaterial(
                    // Determines the defense value of this armor material, depending on what armor piece it is.
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 1);
                        map.put(ArmorItem.Type.LEGGINGS, 4);
                        map.put(ArmorItem.Type.CHESTPLATE, 5);
                        map.put(ArmorItem.Type.HELMET, 2);
                    }),
                    // Determines the enchantability of the tier.
                    15,
                    // Determines the sound played when equipping this armor.
                    SoundEvents.ARMOR_EQUIP_GENERIC,
                    // Determines the repair item for this armor.
                    () -> Ingredient.of(Items.POPPY, Items.ROSE_BUSH),
                    List.of(
                            new ArmorMaterial.Layer(
                                    new ResourceLocation(MOD_ID, "red")
                            )
                    ),
                    // Returns the toughness value of the armor.
                    0.0F,
                    // Returns the knockback resistance value of the armor.
                    0.0F
            )).asHolder();

    public static final Holder<ArmorMaterial> YELLOW_ARMOR_MATERIAL =
            ARMOR_MATERIALS.register("yellow", () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 1);
                        map.put(ArmorItem.Type.LEGGINGS, 4);
                        map.put(ArmorItem.Type.CHESTPLATE, 5);
                        map.put(ArmorItem.Type.HELMET, 2);
                    }),
                    15,
                    SoundEvents.ARMOR_EQUIP_GENERIC,
                    () -> Ingredient.of(Items.DANDELION, Items.SUNFLOWER),
                    List.of(
                            new ArmorMaterial.Layer(
                                    new ResourceLocation(MOD_ID, "yellow")
                            )
                    ),
                    0.0F,
                    0.0F
            )).asHolder();

    public static final Holder<ArmorMaterial> BLUE_ARMOR_MATERIAL =
            ARMOR_MATERIALS.register("blue", () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 1);
                        map.put(ArmorItem.Type.LEGGINGS, 4);
                        map.put(ArmorItem.Type.CHESTPLATE, 5);
                        map.put(ArmorItem.Type.HELMET, 2);
                    }),
                    15,
                    SoundEvents.ARMOR_EQUIP_GENERIC,
                    () -> Ingredient.of(Items.BLUE_ORCHID, Items.CORNFLOWER),
                    List.of(
                            new ArmorMaterial.Layer(
                                    new ResourceLocation(MOD_ID, "blue")
                            )
                    ),
                    0.0F,
                    0.0F
            )).asHolder();

    public static final Holder<ArmorMaterial> WHITE_ARMOR_MATERIAL =
            ARMOR_MATERIALS.register("white", () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 1);
                        map.put(ArmorItem.Type.LEGGINGS, 4);
                        map.put(ArmorItem.Type.CHESTPLATE, 5);
                        map.put(ArmorItem.Type.HELMET, 2);
                    }),
                    15,
                    SoundEvents.ARMOR_EQUIP_GENERIC,
                    () -> Ingredient.of(Items.AZURE_BLUET, Items.OXEYE_DAISY, Items.LILY_OF_THE_VALLEY),
                    List.of(
                            new ArmorMaterial.Layer(
                                    new ResourceLocation(MOD_ID, "white")
                            )
                    ),
                    0.0F,
                    0.0F
            )).asHolder();

    public static final Holder<ArmorMaterial> PINK_ARMOR_MATERIAL =
            ARMOR_MATERIALS.register("pink", () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 1);
                        map.put(ArmorItem.Type.LEGGINGS, 4);
                        map.put(ArmorItem.Type.CHESTPLATE, 5);
                        map.put(ArmorItem.Type.HELMET, 2);
                    }),
                    15,
                    SoundEvents.ARMOR_EQUIP_GENERIC,
                    () -> Ingredient.of(Items.ALLIUM, Items.LILAC, Items.PEONY),
                    List.of(
                            new ArmorMaterial.Layer(
                                    new ResourceLocation(MOD_ID, "pink")
                            )
                    ),
                    0.0F,
                    0.0F
            )).asHolder();

    public static final Holder<ArmorMaterial> BLACK_ARMOR_MATERIAL =
            ARMOR_MATERIALS.register("black", () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 1);
                        map.put(ArmorItem.Type.LEGGINGS, 4);
                        map.put(ArmorItem.Type.CHESTPLATE, 5);
                        map.put(ArmorItem.Type.HELMET, 2);
                    }),
                    15,
                    SoundEvents.ARMOR_EQUIP_GENERIC,
                    () -> Ingredient.of(Items.WITHER_ROSE),
                    List.of(
                            new ArmorMaterial.Layer(
                                    new ResourceLocation(MOD_ID, "black")
                            )
                    ),
                    0.0F,
                    0.0F
            )).asHolder();

    public static final Holder<ArmorMaterial> TULIP_ARMOR_MATERIAL =
            ARMOR_MATERIALS.register("tulip", () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 1);
                        map.put(ArmorItem.Type.LEGGINGS, 4);
                        map.put(ArmorItem.Type.CHESTPLATE, 5);
                        map.put(ArmorItem.Type.HELMET, 2);
                    }),
                    15,
                    SoundEvents.ARMOR_EQUIP_GENERIC,
                    () -> Ingredient.of(Items.ORANGE_TULIP, Items.RED_TULIP, Items.PINK_TULIP, Items.WHITE_TULIP),
                    List.of(
                            new ArmorMaterial.Layer(
                                    new ResourceLocation(MOD_ID, "tulip")
                            )
                    ),
                    0.0F,
                    0.0F
            )).asHolder();

    public static void loadClass() {
    }
}
