package com.cozary.floralench.init;

import com.cozary.floralench.FloralEnchantment;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FloralEnchantment.MOD_ID);

    public static RegistryObject<CreativeModeTab> FLORANENCH_TAB = CREATIVE_MODE_TABS.register("floral_enchantment", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.DANDELION_MOSSY_COBBLESTONE_ITEM.get()))
            .title(Component.translatable("itemGroup.floralench"))
            .displayItems((parameters, output) -> ModItems.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(item.get())))
            .build());

}


