package com.cozary.floralench;

import com.cozary.floralench.init.ModTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.cozary.floralench.FloralEnchantment.MOD_ID;

@Mod(MOD_ID)
public class FloralEnchantmentForge {

    public FloralEnchantmentForge(FMLJavaModLoadingContext context) {
        var eventBus = context.getModBusGroup();

        FloralEnchantment.LOG.info("Hello Forge world!");
        FloralEnchantment.init();
        ModTabs.CREATIVE_MODE_TABS.register(eventBus);
    }


}