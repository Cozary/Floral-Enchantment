package com.cozary.floralench;

import com.cozary.floralench.init.ModBlocks;
import com.cozary.floralench.init.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FloralEnchantment {

    public static final String MOD_ID = "floralench";
    public static final String MOD_NAME = "floralench";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {

        ModBlocks.loadClass();
        ModItems.loadClass();
    }
}