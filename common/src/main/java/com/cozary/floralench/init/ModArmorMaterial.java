package com.cozary.floralench.init;

import com.cozary.floralench.FloralEnchantment;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {

    RED(FloralEnchantment.MOD_ID + ":red", 15, new int[]{2, 5, 4, 1}, 11, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, () -> {
        return Ingredient.of(Items.POPPY, Items.ROSE_BUSH);
    }, 0.0F),
    YELLOW(FloralEnchantment.MOD_ID + ":yellow", 15, new int[]{2, 5, 4, 1}, 11, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, () -> {
        return Ingredient.of(Items.DANDELION, Items.SUNFLOWER);
    }, 0.0F),
    BLUE(FloralEnchantment.MOD_ID + ":blue", 15, new int[]{2, 5, 4, 1}, 11, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, () -> {
        return Ingredient.of(Items.BLUE_ORCHID, Items.CORNFLOWER);
    }, 0.0F),
    WHITE(FloralEnchantment.MOD_ID + ":white", 15, new int[]{2, 5, 4, 1}, 11, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, () -> {
        return Ingredient.of(Items.AZURE_BLUET, Items.OXEYE_DAISY, Items.LILY_OF_THE_VALLEY);
    }, 0.0F),
    PINK(FloralEnchantment.MOD_ID + ":pink", 15, new int[]{2, 5, 4, 1}, 11, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, () -> {
        return Ingredient.of(Items.ALLIUM, Items.LILAC, Items.PEONY);
    }, 0.0F),
    BLACK(FloralEnchantment.MOD_ID + ":black", 15, new int[]{2, 5, 4, 1}, 11, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, () -> {
        return Ingredient.of(Items.WITHER_ROSE);
    }, 0.0F),
    TULIP(FloralEnchantment.MOD_ID + ":tulip", 15, new int[]{2, 5, 4, 1}, 11, SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, () -> {
        return Ingredient.of(Items.ORANGE_TULIP, Items.RED_TULIP, Items.PINK_TULIP, Items.WHITE_TULIP);
    }, 0.0F);

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{7, 11, 10, 9};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float thougness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance;

    ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float thougness, Supplier<Ingredient> repairMaterial, float knockbackResistance) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.thougness = thougness;
        this.repairMaterial = repairMaterial;
        this.knockbackResistance = knockbackResistance;

    }

    @Override
    public int getDurabilityForType(ArmorItem.Type slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getSlot().getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type slotIn) {
        return this.damageReductionArray[slotIn.getSlot().getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.thougness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

}
