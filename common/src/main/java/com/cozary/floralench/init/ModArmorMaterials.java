package com.cozary.floralench.init;

import com.cozary.floralench.FloralEnchantment;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.EnumMap;
import java.util.Map;

public final class ModArmorMaterials {

    public static final ArmorMaterial RED = createArmorMaterial(
            15,
            Map.of(
                    ArmorType.BOOTS, 1,
                    ArmorType.LEGGINGS, 4,
                    ArmorType.CHESTPLATE, 5,
                    ArmorType.HELMET, 2
            ),
            SoundEvents.ARMOR_EQUIP_GENERIC,
            0.0F,
            0.0F,
            null,
            ResourceLocation.fromNamespaceAndPath(FloralEnchantment.MOD_ID, "red")
    );

    public static final ArmorMaterial YELLOW = createArmorMaterial(
            15,
            Map.of(
                    ArmorType.BOOTS, 1,
                    ArmorType.LEGGINGS, 4,
                    ArmorType.CHESTPLATE, 5,
                    ArmorType.HELMET, 2
            ),
            SoundEvents.ARMOR_EQUIP_GENERIC,
            0.0F,
            0.0F,
            null,
            ResourceLocation.fromNamespaceAndPath(FloralEnchantment.MOD_ID, "yellow")
    );

    public static final ArmorMaterial BLUE = createArmorMaterial(
            15,
            Map.of(
                    ArmorType.BOOTS, 1,
                    ArmorType.LEGGINGS, 4,
                    ArmorType.CHESTPLATE, 5,
                    ArmorType.HELMET, 2
            ),
            SoundEvents.ARMOR_EQUIP_GENERIC,
            0.0F,
            0.0F,
            null,
            ResourceLocation.fromNamespaceAndPath(FloralEnchantment.MOD_ID, "blue")
    );

    public static final ArmorMaterial WHITE = createArmorMaterial(
            15,
            Map.of(
                    ArmorType.BOOTS, 1,
                    ArmorType.LEGGINGS, 4,
                    ArmorType.CHESTPLATE, 5,
                    ArmorType.HELMET, 2
            ),
            SoundEvents.ARMOR_EQUIP_GENERIC,
            0.0F,
            0.0F,
            null,
            ResourceLocation.fromNamespaceAndPath(FloralEnchantment.MOD_ID, "white")
    );

    public static final ArmorMaterial PINK = createArmorMaterial(
            15,
            Map.of(
                    ArmorType.BOOTS, 1,
                    ArmorType.LEGGINGS, 4,
                    ArmorType.CHESTPLATE, 5,
                    ArmorType.HELMET, 2
            ),
            SoundEvents.ARMOR_EQUIP_GENERIC,
            0.0F,
            0.0F,
            null,
            ResourceLocation.fromNamespaceAndPath(FloralEnchantment.MOD_ID, "pink")
    );

    public static final ArmorMaterial BLACK = createArmorMaterial(
            15,
            Map.of(
                    ArmorType.BOOTS, 1,
                    ArmorType.LEGGINGS, 4,
                    ArmorType.CHESTPLATE, 5,
                    ArmorType.HELMET, 2
            ),
            SoundEvents.ARMOR_EQUIP_GENERIC,
            0.0F,
            0.0F,
            null,
            ResourceLocation.fromNamespaceAndPath(FloralEnchantment.MOD_ID, "black")
    );

    public static final ArmorMaterial TULIP = createArmorMaterial(
            15,
            Map.of(
                    ArmorType.BOOTS, 1,
                    ArmorType.LEGGINGS, 4,
                    ArmorType.CHESTPLATE, 5,
                    ArmorType.HELMET, 2
            ),
            SoundEvents.ARMOR_EQUIP_GENERIC,
            0.0F,
            0.0F,
            null,
            ResourceLocation.fromNamespaceAndPath(FloralEnchantment.MOD_ID, "tulip")
    );

    private static ArmorMaterial createArmorMaterial(
            int durabilityScalar,
            Map<ArmorType, Integer> defense,
            Holder<SoundEvent> equipSound,
            float toughness,
            float knockbackResistance,
            TagKey<Item> repairTag,
            ResourceLocation modelId
    ) {
        EnumMap<ArmorType, Integer> armorMap = new EnumMap<>(ArmorType.class);
        armorMap.putAll(defense);
        return new ArmorMaterial(
                durabilityScalar,
                armorMap,
                15,
                equipSound,
                toughness,
                knockbackResistance,
                repairTag,
                modelId
        );
    }
}
