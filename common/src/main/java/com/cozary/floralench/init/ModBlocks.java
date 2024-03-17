package com.cozary.floralench.init;

import com.cozary.floralench.FloralEnchantment;
import com.cozary.floralench.blocks.base.*;
import com.cozary.floralench.blocks.bush.*;
import com.cozary.floralench.blocks.pots.*;
import com.cozary.floralench.blocks.pots.double_pots.*;
import com.cozary.floralench.blocks.pots.special.DancingSunflower;
import com.cozary.floralench.blocks.wither_variant.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;

public class ModBlocks {
    public static final RegistrationProvider<Block> BLOCKS = RegistrationProvider.get(Registries.BLOCK, FloralEnchantment.MOD_ID);

    //Vines
    public static final RegistryObject<Block> DANDELION_VINE = BLOCKS.register("dandelion_vine", VineBaseBlock::new);
    public static final RegistryObject<Block> POPPY_VINE = BLOCKS.register("poppy_vine", VineBaseBlock::new);
    public static final RegistryObject<Block> BLUE_ORCHID_VINE = BLOCKS.register("blue_orchid_vine", VineBaseBlock::new);
    public static final RegistryObject<Block> ALLIUM_VINE = BLOCKS.register("allium_vine", VineBaseBlock::new);
    public static final RegistryObject<Block> AZURE_BLUET_VINE = BLOCKS.register("azure_bluet_vine", VineBaseBlock::new);
    public static final RegistryObject<Block> RED_TULIP_VINE = BLOCKS.register("red_tulip_vine", VineBaseBlock::new);
    public static final RegistryObject<Block> ORANGE_TULIP_VINE = BLOCKS.register("orange_tulip_vine", VineBaseBlock::new);
    public static final RegistryObject<Block> WHITE_TULIP_VINE = BLOCKS.register("white_tulip_vine", VineBaseBlock::new);
    public static final RegistryObject<Block> PINK_TULIP_VINE = BLOCKS.register("pink_tulip_vine", VineBaseBlock::new);
    public static final RegistryObject<Block> OXEYE_DAISY_VINE = BLOCKS.register("oxeye_daisy_vine", VineBaseBlock::new);
    public static final RegistryObject<Block> CORNFLOWER_VINE = BLOCKS.register("cornflower_vine", VineBaseBlock::new);
    public static final RegistryObject<Block> LILY_OF_THE_VALLEY_VINE = BLOCKS.register("lily_of_the_valley_vine", VineBaseBlock::new);
    public static final RegistryObject<Block> WITHER_ROSE_VINE = BLOCKS.register("wither_rose_vine", WitherVineBaseBlock::new);
    public static final RegistryObject<Block> SUNFLOWER_VINE = BLOCKS.register("sunflower_vine", VineBaseBlock::new);
    public static final RegistryObject<Block> LILAC_VINE = BLOCKS.register("lilac_vine", VineBaseBlock::new);
    public static final RegistryObject<Block> ROSE_BUSH_VINE = BLOCKS.register("rose_bush_vine", VineBaseBlock::new);
    public static final RegistryObject<Block> PEONY_VINE = BLOCKS.register("peony_vine", VineBaseBlock::new);

    //Mossy Cobblestone
    public static final RegistryObject<Block> DANDELION_MOSSY_COBBLESTONE = BLOCKS.register("dandelion_mossy_cobblestone", MossyBlock::new);
    public static final RegistryObject<Block> POPPY_MOSSY_COBBLESTONE = BLOCKS.register("poppy_mossy_cobblestone", MossyBlock::new);
    public static final RegistryObject<Block> BLUE_ORCHID_MOSSY_COBBLESTONE = BLOCKS.register("blue_orchid_mossy_cobblestone", MossyBlock::new);
    public static final RegistryObject<Block> ALLIUM_MOSSY_COBBLESTONE = BLOCKS.register("allium_mossy_cobblestone", MossyBlock::new);
    public static final RegistryObject<Block> AZURE_BLUET_MOSSY_COBBLESTONE = BLOCKS.register("azure_bluet_mossy_cobblestone", MossyBlock::new);
    public static final RegistryObject<Block> RED_TULIP_MOSSY_COBBLESTONE = BLOCKS.register("red_tulip_mossy_cobblestone", MossyBlock::new);
    public static final RegistryObject<Block> ORANGE_TULIP_MOSSY_COBBLESTONE = BLOCKS.register("orange_tulip_mossy_cobblestone", MossyBlock::new);
    public static final RegistryObject<Block> WHITE_TULIP_MOSSY_COBBLESTONE = BLOCKS.register("white_tulip_mossy_cobblestone", MossyBlock::new);
    public static final RegistryObject<Block> PINK_TULIP_MOSSY_COBBLESTONE = BLOCKS.register("pink_tulip_mossy_cobblestone", MossyBlock::new);
    public static final RegistryObject<Block> OXEYE_DAISY_MOSSY_COBBLESTONE = BLOCKS.register("oxeye_daisy_mossy_cobblestone", MossyBlock::new);
    public static final RegistryObject<Block> CORNFLOWER_MOSSY_COBBLESTONE = BLOCKS.register("cornflower_mossy_cobblestone", MossyBlock::new);
    public static final RegistryObject<Block> LILY_OF_THE_VALLEY_MOSSY_COBBLESTONE = BLOCKS.register("lily_of_the_valley_mossy_cobblestone", MossyBlock::new);
    public static final RegistryObject<Block> WITHER_ROSE_MOSSY_COBBLESTONE = BLOCKS.register("wither_rose_mossy_cobblestone", WitherMossyBlock::new);
    public static final RegistryObject<Block> SUNFLOWER_MOSSY_COBBLESTONE = BLOCKS.register("sunflower_mossy_cobblestone", MossyBlock::new);
    public static final RegistryObject<Block> LILAC_MOSSY_COBBLESTONE = BLOCKS.register("lilac_mossy_cobblestone", MossyBlock::new);
    public static final RegistryObject<Block> ROSE_BUSH_MOSSY_COBBLESTONE = BLOCKS.register("rose_bush_mossy_cobblestone", MossyBlock::new);
    public static final RegistryObject<Block> PEONY_MOSSY_COBBLESTONE = BLOCKS.register("peony_mossy_cobblestone", MossyBlock::new);

    //Bush
    public static final RegistryObject<AlliumVineBushBlock> ALLIUM_BUSH = BLOCKS.register("allium_bush", AlliumVineBushBlock::new);
    public static final RegistryObject<AzureBluetVineBushBlock> AZURE_BLUET_BUSH = BLOCKS.register("azure_bluet_bush", AzureBluetVineBushBlock::new);
    public static final RegistryObject<BlueOrchidVineBushBlock> BLUE_ORCHID_BUSH = BLOCKS.register("blue_orchid_bush", BlueOrchidVineBushBlock::new);
    public static final RegistryObject<CornflowerVineBushBlock> CORNFLOWER_BUSH = BLOCKS.register("cornflower_bush", CornflowerVineBushBlock::new);
    public static final RegistryObject<DandelionVineBushBlock> DANDELION_BUSH = BLOCKS.register("dandelion_bush", DandelionVineBushBlock::new);
    public static final RegistryObject<LilacVineBushBlock> LILAC_BUSH = BLOCKS.register("lilac_bush", LilacVineBushBlock::new);
    public static final RegistryObject<LilyOfTheValleyVineBushBlock> LILY_OF_THE_VALLEY_BUSH = BLOCKS.register("lily_of_the_valley_bush", LilyOfTheValleyVineBushBlock::new);
    public static final RegistryObject<OrangeTulipVineBushBlock> ORANGE_TULIP_BUSH = BLOCKS.register("orange_tulip_bush", OrangeTulipVineBushBlock::new);
    public static final RegistryObject<OxeyeDaisyVineBushBlock> OXEYE_DAISY_BUSH = BLOCKS.register("oxeye_daisy_bush", OxeyeDaisyVineBushBlock::new);
    public static final RegistryObject<PeonyVineBushBlock> PEONY_BUSH = BLOCKS.register("peony_bush", PeonyVineBushBlock::new);
    public static final RegistryObject<PinkTulipVineBushBlock> PINK_TULIP_BUSH = BLOCKS.register("pink_tulip_bush", PinkTulipVineBushBlock::new);
    public static final RegistryObject<PoppyVineBushBlock> POPPY_BUSH = BLOCKS.register("poppy_bush", PoppyVineBushBlock::new);
    public static final RegistryObject<RedTulipVineBushBlock> RED_TULIP_BUSH = BLOCKS.register("red_tulip_bush", RedTulipVineBushBlock::new);
    public static final RegistryObject<RoseBushVineBushBlock> ROSE_BUSH_BUSH = BLOCKS.register("rose_bush_bush", RoseBushVineBushBlock::new);
    public static final RegistryObject<SunflowerVineBushBlock> SUNFLOWER_BUSH = BLOCKS.register("sunflower_bush", SunflowerVineBushBlock::new);
    public static final RegistryObject<WhiteTulipVineBushBlock> WHITE_TULIP_BUSH = BLOCKS.register("white_tulip_bush", WhiteTulipVineBushBlock::new);
    public static final RegistryObject<WitherVineBushBlock> WITHER_ROSE_BUSH = BLOCKS.register("wither_rose_bush", WitherVineBushBlock::new);

    //Mossy Stone Brick
    public static final RegistryObject<Block> DANDELION_MOSSY_STONE_BRICK = BLOCKS.register("dandelion_mossy_stone_brick", MossyStoneBrickBlock::new);
    public static final RegistryObject<Block> POPPY_MOSSY_STONE_BRICK = BLOCKS.register("poppy_mossy_stone_brick", MossyStoneBrickBlock::new);
    public static final RegistryObject<Block> BLUE_ORCHID_MOSSY_STONE_BRICK = BLOCKS.register("blue_orchid_mossy_stone_brick", MossyStoneBrickBlock::new);
    public static final RegistryObject<Block> ALLIUM_MOSSY_STONE_BRICK = BLOCKS.register("allium_mossy_stone_brick", MossyStoneBrickBlock::new);
    public static final RegistryObject<Block> AZURE_BLUET_MOSSY_STONE_BRICK = BLOCKS.register("azure_bluet_mossy_stone_brick", MossyStoneBrickBlock::new);
    public static final RegistryObject<Block> RED_TULIP_MOSSY_STONE_BRICK = BLOCKS.register("red_tulip_mossy_stone_brick", MossyStoneBrickBlock::new);
    public static final RegistryObject<Block> ORANGE_TULIP_MOSSY_STONE_BRICK = BLOCKS.register("orange_tulip_mossy_stone_brick", MossyStoneBrickBlock::new);
    public static final RegistryObject<Block> WHITE_TULIP_MOSSY_STONE_BRICK = BLOCKS.register("white_tulip_mossy_stone_brick", MossyStoneBrickBlock::new);
    public static final RegistryObject<Block> PINK_TULIP_MOSSY_STONE_BRICK = BLOCKS.register("pink_tulip_mossy_stone_brick", MossyStoneBrickBlock::new);
    public static final RegistryObject<Block> OXEYE_DAISY_MOSSY_STONE_BRICK = BLOCKS.register("oxeye_daisy_mossy_stone_brick", MossyStoneBrickBlock::new);
    public static final RegistryObject<Block> CORNFLOWER_MOSSY_STONE_BRICK = BLOCKS.register("cornflower_mossy_stone_brick", MossyStoneBrickBlock::new);
    public static final RegistryObject<Block> LILY_OF_THE_VALLEY_MOSSY_STONE_BRICK = BLOCKS.register("lily_of_the_valley_mossy_stone_brick", MossyStoneBrickBlock::new);
    public static final RegistryObject<Block> WITHER_ROSE_MOSSY_STONE_BRICK = BLOCKS.register("wither_rose_mossy_stone_brick", WitherMossyStoneBrickBlock::new);
    public static final RegistryObject<Block> SUNFLOWER_MOSSY_STONE_BRICK = BLOCKS.register("sunflower_mossy_stone_brick", MossyStoneBrickBlock::new);
    public static final RegistryObject<Block> LILAC_MOSSY_STONE_BRICK = BLOCKS.register("lilac_mossy_stone_brick", MossyStoneBrickBlock::new);
    public static final RegistryObject<Block> ROSE_BUSH_MOSSY_STONE_BRICK = BLOCKS.register("rose_bush_mossy_stone_brick", MossyStoneBrickBlock::new);
    public static final RegistryObject<Block> PEONY_MOSSY_STONE_BRICK = BLOCKS.register("peony_mossy_stone_brick", MossyStoneBrickBlock::new);

    //Large Pot
    public static final RegistryObject<Block> LARGE_POT = BLOCKS.register("large_pot", LargePot::new);
    public static final RegistryObject<Block> LARGE_DANDELION_POT = BLOCKS.register("large_dandelion_pot", LargeDandelionPot::new);
    public static final RegistryObject<Block> LARGE_POPPY_POT = BLOCKS.register("large_poppy_pot", LargePoppyPot::new);
    public static final RegistryObject<Block> LARGE_BLUE_ORCHID_POT = BLOCKS.register("large_blue_orchid_pot", LargeBlueOrchidPot::new);
    public static final RegistryObject<Block> LARGE_ALLIUM_POT = BLOCKS.register("large_allium_pot", LargeAlliumPot::new);
    public static final RegistryObject<Block> LARGE_AZURE_BLUET_POT = BLOCKS.register("large_azure_bluet_pot", LargeAzureBluetPot::new);
    public static final RegistryObject<Block> LARGE_RED_TULIP_POT = BLOCKS.register("large_red_tulip_pot", LargeRedTulipPot::new);
    public static final RegistryObject<Block> LARGE_ORANGE_TULIP_POT = BLOCKS.register("large_orange_tulip_pot", LargeOrangeTulipPot::new);
    public static final RegistryObject<Block> LARGE_WHITE_TULIP_POT = BLOCKS.register("large_white_tulip_pot", LargeWhiteTulipPot::new);
    public static final RegistryObject<Block> LARGE_PINK_TULIP_POT = BLOCKS.register("large_pink_tulip_pot", LargePinkTulipPot::new);
    public static final RegistryObject<Block> LARGE_OXEYE_DAISY_POT = BLOCKS.register("large_oxeye_daisy_pot", LargeOxeyeDaisyPot::new);
    public static final RegistryObject<Block> LARGE_CORNFLOWER_POT = BLOCKS.register("large_cornflower_pot", LargeCornflowerPot::new);
    public static final RegistryObject<Block> LARGE_LILY_OF_THE_VALLEY_POT = BLOCKS.register("large_lily_of_the_valley_pot", LargeLilyOfTheValleyPot::new);
    public static final RegistryObject<Block> LARGE_WITHER_ROSE_POT = BLOCKS.register("large_wither_rose_pot", LargeWitherRosePot::new);
    public static final RegistryObject<Block> LARGE_SUNFLOWER_POT = BLOCKS.register("large_sunflower_pot", LargeSunflowerPot::new);
    public static final RegistryObject<Block> LARGE_LILAC_POT = BLOCKS.register("large_lilac_pot", LargeLilacPot::new);
    public static final RegistryObject<Block> LARGE_ROSE_BUSH_POT = BLOCKS.register("large_rose_bush_pot", LargeRoseBushPot::new);
    public static final RegistryObject<Block> LARGE_PEONY_POT = BLOCKS.register("large_peony_pot", LargePeonyPot::new);

    //Big Double Pot
    public static final RegistryObject<Block> LARGE_DOUBLE_DANDELION_POT = BLOCKS.register("large_double_dandelion_pot", LargeDoubleDandelionPot::new);
    public static final RegistryObject<Block> LARGE_DOUBLE_POPPY_POT = BLOCKS.register("large_double_poppy_pot", LargeDoublePoppyPot::new);
    public static final RegistryObject<Block> LARGE_DOUBLE_BLUE_ORCHID_POT = BLOCKS.register("large_double_blue_orchid_pot", LargeDoubleBlueOrchidPot::new);
    public static final RegistryObject<Block> LARGE_DOUBLE_ALLIUM_POT = BLOCKS.register("large_double_allium_pot", LargeDoubleAlliumPot::new);
    public static final RegistryObject<Block> LARGE_DOUBLE_AZURE_BLUET_POT = BLOCKS.register("large_double_azure_bluet_pot", LargeDoubleAzureBluetPot::new);
    public static final RegistryObject<Block> LARGE_DOUBLE_RED_TULIP_POT = BLOCKS.register("large_double_red_tulip_pot", LargeDoubleRedTulipPot::new);
    public static final RegistryObject<Block> LARGE_DOUBLE_ORANGE_TULIP_POT = BLOCKS.register("large_double_orange_tulip_pot", LargeDoubleOrangeTulipPot::new);
    public static final RegistryObject<Block> LARGE_DOUBLE_WHITE_TULIP_POT = BLOCKS.register("large_double_white_tulip_pot", LargeDoubleWhiteTulipPot::new);
    public static final RegistryObject<Block> LARGE_DOUBLE_PINK_TULIP_POT = BLOCKS.register("large_double_pink_tulip_pot", LargeDoublePinkTulipPot::new);
    public static final RegistryObject<Block> LARGE_DOUBLE_OXEYE_DAISY_POT = BLOCKS.register("large_double_oxeye_daisy_pot", LargeDoubleOxeyeDaisyPot::new);
    public static final RegistryObject<Block> LARGE_DOUBLE_CORNFLOWER_POT = BLOCKS.register("large_double_cornflower_pot", LargeDoubleCornflowerPot::new);
    public static final RegistryObject<Block> LARGE_DOUBLE_LILY_OF_THE_VALLEY_POT = BLOCKS.register("large_double_lily_of_the_valley_pot", LargeDoubleLilyOfTheValleyPot::new);
    public static final RegistryObject<Block> LARGE_DOUBLE_WITHER_ROSE_POT = BLOCKS.register("large_double_wither_rose_pot", LargeDoubleWitherRosePot::new);

    //Special
    public static final RegistryObject<Block> DANCING_SUNFLOWER = BLOCKS.register("dancing_sunflower", DancingSunflower::new);

    //Floral Baskets
    public static final RegistryObject<Block> FLORAL_BASKET = BLOCKS.register("floral_basket", FloralBasket::new);
    public static final RegistryObject<Block> DANDELION_BASKET = BLOCKS.register("dandelion_basket", FloralBasket::new);
    public static final RegistryObject<Block> POPPY_BASKET = BLOCKS.register("poppy_basket", FloralBasket::new);
    public static final RegistryObject<Block> BLUE_ORCHID_BASKET = BLOCKS.register("blue_orchid_basket", FloralBasket::new);
    public static final RegistryObject<Block> ALLIUM_BASKET = BLOCKS.register("allium_basket", FloralBasket::new);
    public static final RegistryObject<Block> AZURE_BLUET_BASKET = BLOCKS.register("azure_bluet_basket", FloralBasket::new);
    public static final RegistryObject<Block> RED_TULIP_BASKET = BLOCKS.register("red_tulip_basket", FloralBasket::new);
    public static final RegistryObject<Block> ORANGE_TULIP_BASKET = BLOCKS.register("orange_tulip_basket", FloralBasket::new);
    public static final RegistryObject<Block> WHITE_TULIP_BASKET = BLOCKS.register("white_tulip_basket", FloralBasket::new);
    public static final RegistryObject<Block> PINK_TULIP_BASKET = BLOCKS.register("pink_tulip_basket", FloralBasket::new);
    public static final RegistryObject<Block> OXEYE_DAISY_BASKET = BLOCKS.register("oxeye_daisy_basket", FloralBasket::new);
    public static final RegistryObject<Block> CORNFLOWER_BASKET = BLOCKS.register("cornflower_basket", FloralBasket::new);
    public static final RegistryObject<Block> LILY_OF_THE_VALLEY_BASKET = BLOCKS.register("lily_of_the_valley_basket", FloralBasket::new);
    public static final RegistryObject<Block> WITHER_ROSE_BASKET = BLOCKS.register("wither_rose_basket", WitherFloralBasket::new);

    public static void loadClass() {
    }
}
