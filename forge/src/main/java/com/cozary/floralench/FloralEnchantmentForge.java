package com.cozary.floralench;

import com.cozary.floralench.init.ModTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.cozary.floralench.FloralEnchantment.MOD_ID;

@Mod(MOD_ID)
@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FloralEnchantmentForge {

    public FloralEnchantmentForge() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        FloralEnchantment.LOG.info("Hello Forge world!");
        FloralEnchantment.init();
        ModTabs.CREATIVE_MODE_TABS.register(eventBus);
        MinecraftForge.EVENT_BUS.register(new EventHandler());

    }



}