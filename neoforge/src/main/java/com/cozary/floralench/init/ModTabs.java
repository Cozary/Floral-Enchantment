package com.cozary.floralench.init;

import com.cozary.floralench.FloralEnchantment;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FloralEnchantment.MOD_ID);

    public static final Supplier<CreativeModeTab> FLORANENCH_TAB = CREATIVE_MODE_TAB.register("floral_enchantment", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.floralench"))
            .icon(() -> new ItemStack(ModItems.DANDELION_MOSSY_COBBLESTONE_ITEM.get()))
            .displayItems((parameters, output) -> ModItems.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(item.get())))
            .build());

    public static void init(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
