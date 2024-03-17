package com.cozary.floralench;


import com.cozary.floralench.init.ModTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(FloralEnchantment.MOD_ID)
public class FloralEnchantmentNeoForge {

    public FloralEnchantmentNeoForge(IEventBus eventBus) {

        FloralEnchantment.LOG.info("Hello NeoForge world!");
        FloralEnchantment.init();
        ModTabs.init(eventBus);

    }
}