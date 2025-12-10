package com.cozary.floralench.init;

import com.cozary.floralench.FloralEnchantment;
import com.cozary.floralench.blocks.bush.*;
import com.cozary.floralench.blocks.eyeblossom_variant.EyeblossomFloralBasket;
import com.cozary.floralench.blocks.eyeblossom_variant.EyeblossomMossyBlock;
import com.cozary.floralench.blocks.eyeblossom_variant.EyeblossomMossyStoneBrickBlock;
import com.cozary.floralench.blocks.eyeblossom_variant.EyeblossomVineBaseBlock;
import com.cozary.floralench.blocks.factory.FloralBasketFactory;
import com.cozary.floralench.blocks.factory.MossyBlockFactory;
import com.cozary.floralench.blocks.factory.MossyStoneBricksBlockFactory;
import com.cozary.floralench.blocks.factory.VineBlockFactory;
import com.cozary.floralench.blocks.pots.*;
import com.cozary.floralench.blocks.pots.double_pots.*;
import com.cozary.floralench.blocks.pots.special.DancingSunflower;
import com.cozary.floralench.blocks.pots.special.LargePot;
import com.cozary.floralench.blocks.wither_variant.LargeDoubleWitherRosePot;
import com.cozary.floralench.blocks.wither_variant.LargeWitherRosePot;
import com.cozary.floralench.blocks.wither_variant.WitherVineBushBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;

public class ModBlocks {
    public static final RegistrationProvider<Block> BLOCKS = RegistrationProvider.get(Registries.BLOCK, FloralEnchantment.MOD_ID);

    //Vines
    public static final RegistryObject<Block> DANDELION_VINE = BLOCKS.register("dandelion_vine", () -> VineBlockFactory.create("dandelion_vine"));
    public static final RegistryObject<Block> POPPY_VINE = BLOCKS.register("poppy_vine", () -> VineBlockFactory.create("poppy_vine"));
    public static final RegistryObject<Block> BLUE_ORCHID_VINE = BLOCKS.register("blue_orchid_vine", () -> VineBlockFactory.create("blue_orchid_vine"));
    public static final RegistryObject<Block> ALLIUM_VINE = BLOCKS.register("allium_vine", () -> VineBlockFactory.create("allium_vine"));
    public static final RegistryObject<Block> AZURE_BLUET_VINE = BLOCKS.register("azure_bluet_vine", () -> VineBlockFactory.create("azure_bluet_vine"));
    public static final RegistryObject<Block> RED_TULIP_VINE = BLOCKS.register("red_tulip_vine", () -> VineBlockFactory.create("red_tulip_vine"));
    public static final RegistryObject<Block> ORANGE_TULIP_VINE = BLOCKS.register("orange_tulip_vine", () -> VineBlockFactory.create("orange_tulip_vine"));
    public static final RegistryObject<Block> WHITE_TULIP_VINE = BLOCKS.register("white_tulip_vine", () -> VineBlockFactory.create("white_tulip_vine"));
    public static final RegistryObject<Block> PINK_TULIP_VINE = BLOCKS.register("pink_tulip_vine", () -> VineBlockFactory.create("pink_tulip_vine"));
    public static final RegistryObject<Block> OXEYE_DAISY_VINE = BLOCKS.register("oxeye_daisy_vine", () -> VineBlockFactory.create("oxeye_daisy_vine"));
    public static final RegistryObject<Block> CORNFLOWER_VINE = BLOCKS.register("cornflower_vine", () -> VineBlockFactory.create("cornflower_vine"));
    public static final RegistryObject<Block> LILY_OF_THE_VALLEY_VINE = BLOCKS.register("lily_of_the_valley_vine", () -> VineBlockFactory.create("lily_of_the_valley_vine"));
    public static final RegistryObject<Block> WITHER_ROSE_VINE = BLOCKS.register("wither_rose_vine", () -> VineBlockFactory.createWither("wither_rose_vine"));
    public static final RegistryObject<Block> SUNFLOWER_VINE = BLOCKS.register("sunflower_vine", () -> VineBlockFactory.create("sunflower_vine"));
    public static final RegistryObject<Block> LILAC_VINE = BLOCKS.register("lilac_vine", () -> VineBlockFactory.create("lilac_vine"));
    public static final RegistryObject<Block> ROSE_BUSH_VINE = BLOCKS.register("rose_bush_vine", () -> VineBlockFactory.create("rose_bush_vine"));
    public static final RegistryObject<Block> PEONY_VINE = BLOCKS.register("peony_vine", () -> VineBlockFactory.create("peony_vine"));
    public static final RegistryObject<Block> TORCHFLOWER_VINE = BLOCKS.register("torchflower_vine", () -> VineBlockFactory.create("torchflower_vine"));
    public static final RegistryObject<Block> PITCHER_PLANT_VINE = BLOCKS.register("pitcher_plant_vine", () -> VineBlockFactory.create("pitcher_plant_vine"));
    public static final RegistryObject<Block> CHORUS_FLOWER_VINE = BLOCKS.register("chorus_flower_vine", () -> VineBlockFactory.create("chorus_flower_vine"));
    public static final RegistryObject<Block> AZALEA_VINE = BLOCKS.register("azalea_vine", () -> VineBlockFactory.create("azalea_vine"));
    public static final RegistryObject<Block> PINK_PETALS_VINE = BLOCKS.register("pink_petals_vine", () -> VineBlockFactory.create("pink_petals_vine"));
    public static final RegistryObject<Block> SPORE_BLOSSOM_VINE = BLOCKS.register("spore_blossom_vine", () -> VineBlockFactory.create("spore_blossom_vine"));
    public static final RegistryObject<Block> OPEN_EYEBLOSSOM_VINE = BLOCKS.register("open_eyeblossom_vine", () -> VineBlockFactory.createEyeblossom("open_eyeblossom_vine", EyeblossomVineBaseBlock.Type.OPEN));
    public static final RegistryObject<Block> CLOSED_EYEBLOSSOM_VINE = BLOCKS.register("closed_eyeblossom_vine", () -> VineBlockFactory.createEyeblossom("closed_eyeblossom_vine", EyeblossomVineBaseBlock.Type.CLOSED));
    public static final RegistryObject<Block> WILDFLOWERS_VINE = BLOCKS.register("wildflowers_vine", () -> VineBlockFactory.create("wildflowers_vine"));


    //Mossy Cobblestone
    public static final RegistryObject<Block> DANDELION_MOSSY_COBBLESTONE = BLOCKS.register("dandelion_mossy_cobblestone", () -> MossyBlockFactory.create("dandelion_mossy_cobblestone"));
    public static final RegistryObject<Block> POPPY_MOSSY_COBBLESTONE = BLOCKS.register("poppy_mossy_cobblestone", () -> MossyBlockFactory.create("poppy_mossy_cobblestone"));
    public static final RegistryObject<Block> BLUE_ORCHID_MOSSY_COBBLESTONE = BLOCKS.register("blue_orchid_mossy_cobblestone", () -> MossyBlockFactory.create("blue_orchid_mossy_cobblestone"));
    public static final RegistryObject<Block> ALLIUM_MOSSY_COBBLESTONE = BLOCKS.register("allium_mossy_cobblestone", () -> MossyBlockFactory.create("allium_mossy_cobblestone"));
    public static final RegistryObject<Block> AZURE_BLUET_MOSSY_COBBLESTONE = BLOCKS.register("azure_bluet_mossy_cobblestone", () -> MossyBlockFactory.create("azure_bluet_mossy_cobblestone"));
    public static final RegistryObject<Block> RED_TULIP_MOSSY_COBBLESTONE = BLOCKS.register("red_tulip_mossy_cobblestone", () -> MossyBlockFactory.create("red_tulip_mossy_cobblestone"));
    public static final RegistryObject<Block> ORANGE_TULIP_MOSSY_COBBLESTONE = BLOCKS.register("orange_tulip_mossy_cobblestone", () -> MossyBlockFactory.create("orange_tulip_mossy_cobblestone"));
    public static final RegistryObject<Block> WHITE_TULIP_MOSSY_COBBLESTONE = BLOCKS.register("white_tulip_mossy_cobblestone", () -> MossyBlockFactory.create("white_tulip_mossy_cobblestone"));
    public static final RegistryObject<Block> PINK_TULIP_MOSSY_COBBLESTONE = BLOCKS.register("pink_tulip_mossy_cobblestone", () -> MossyBlockFactory.create("pink_tulip_mossy_cobblestone"));
    public static final RegistryObject<Block> OXEYE_DAISY_MOSSY_COBBLESTONE = BLOCKS.register("oxeye_daisy_mossy_cobblestone", () -> MossyBlockFactory.create("oxeye_daisy_mossy_cobblestone"));
    public static final RegistryObject<Block> CORNFLOWER_MOSSY_COBBLESTONE = BLOCKS.register("cornflower_mossy_cobblestone", () -> MossyBlockFactory.create("cornflower_mossy_cobblestone"));
    public static final RegistryObject<Block> LILY_OF_THE_VALLEY_MOSSY_COBBLESTONE = BLOCKS.register("lily_of_the_valley_mossy_cobblestone", () -> MossyBlockFactory.create("lily_of_the_valley_mossy_cobblestone"));
    public static final RegistryObject<Block> WITHER_ROSE_MOSSY_COBBLESTONE = BLOCKS.register("wither_rose_mossy_cobblestone", () -> MossyBlockFactory.createWither("wither_rose_mossy_cobblestone"));
    public static final RegistryObject<Block> SUNFLOWER_MOSSY_COBBLESTONE = BLOCKS.register("sunflower_mossy_cobblestone", () -> MossyBlockFactory.create("sunflower_mossy_cobblestone"));
    public static final RegistryObject<Block> LILAC_MOSSY_COBBLESTONE = BLOCKS.register("lilac_mossy_cobblestone", () -> MossyBlockFactory.create("lilac_mossy_cobblestone"));
    public static final RegistryObject<Block> ROSE_BUSH_MOSSY_COBBLESTONE = BLOCKS.register("rose_bush_mossy_cobblestone", () -> MossyBlockFactory.create("rose_bush_mossy_cobblestone"));
    public static final RegistryObject<Block> PEONY_MOSSY_COBBLESTONE = BLOCKS.register("peony_mossy_cobblestone", () -> MossyBlockFactory.create("peony_mossy_cobblestone"));
    public static final RegistryObject<Block> TORCHFLOWER_MOSSY_COBBLESTONE = BLOCKS.register("torchflower_mossy_cobblestone", () -> MossyBlockFactory.create("torchflower_mossy_cobblestone"));
    public static final RegistryObject<Block> PITCHER_PLANT_MOSSY_COBBLESTONE = BLOCKS.register("pitcher_plant_mossy_cobblestone", () -> MossyBlockFactory.create("pitcher_plant_mossy_cobblestone"));
    public static final RegistryObject<Block> CHORUS_FLOWER_MOSSY_COBBLESTONE = BLOCKS.register("chorus_flower_mossy_cobblestone", () -> MossyBlockFactory.create("chorus_flower_mossy_cobblestone"));
    public static final RegistryObject<Block> AZALEA_MOSSY_COBBLESTONE = BLOCKS.register("azalea_mossy_cobblestone", () -> MossyBlockFactory.create("azalea_mossy_cobblestone"));
    public static final RegistryObject<Block> PINK_PETALS_MOSSY_COBBLESTONE = BLOCKS.register("pink_petals_mossy_cobblestone", () -> MossyBlockFactory.create("pink_petals_mossy_cobblestone"));
    public static final RegistryObject<Block> SPORE_BLOSSOM_MOSSY_COBBLESTONE = BLOCKS.register("spore_blossom_mossy_cobblestone", () -> MossyBlockFactory.create("spore_blossom_mossy_cobblestone"));
    public static final RegistryObject<Block> OPEN_EYEBLOSSOM_MOSSY_COBBLESTONE = BLOCKS.register("open_eyeblossom_mossy_cobblestone", () -> MossyBlockFactory.createEyeblossom("open_eyeblossom_mossy_cobblestone", EyeblossomMossyBlock.Type.OPEN));
    public static final RegistryObject<Block> CLOSED_EYEBLOSSOM_MOSSY_COBBLESTONE = BLOCKS.register("closed_eyeblossom_mossy_cobblestone", () -> MossyBlockFactory.createEyeblossom("closed_eyeblossom_mossy_cobblestone", EyeblossomMossyBlock.Type.CLOSED));
    public static final RegistryObject<Block> WILDFLOWERS_MOSSY_COBBLESTONE = BLOCKS.register("wildflowers_mossy_cobblestone", () -> MossyBlockFactory.create("wildflowers_mossy_cobblestone"));

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
    public static final RegistryObject<TorchflowerVineBushBlock> TORCHFLOWER_BUSH = BLOCKS.register("torchflower_bush", TorchflowerVineBushBlock::new);
    public static final RegistryObject<PitcherPlantVineBushBlock> PITCHER_PLANT_BUSH = BLOCKS.register("pitcher_plant_bush", PitcherPlantVineBushBlock::new);
    public static final RegistryObject<ChorusFlowerVineBushBlock> CHORUS_FLOWER_BUSH = BLOCKS.register("chorus_flower_bush", ChorusFlowerVineBushBlock::new);
    public static final RegistryObject<AzaleaVineBushBlock> AZALEA_BUSH = BLOCKS.register("azalea_bush", AzaleaVineBushBlock::new);
    public static final RegistryObject<PinkPetalsVineBushBlock> PINK_PETALS_BUSH = BLOCKS.register("pink_petals_bush", PinkPetalsVineBushBlock::new);
    public static final RegistryObject<SporeBlossomVineBushBlock> SPORE_BLOSSOM_BUSH = BLOCKS.register("spore_blossom_bush", SporeBlossomVineBushBlock::new);
    public static final RegistryObject<EyeblossomVineBushBlock> OPEN_EYEBLOSSOM_BUSH = BLOCKS.register("open_eyeblossom_bush", () -> new EyeblossomVineBushBlock(EyeblossomVineBushBlock.Type.OPEN));
    public static final RegistryObject<EyeblossomVineBushBlock> CLOSED_EYEBLOSSOM_BUSH = BLOCKS.register("closed_eyeblossom_bush", () -> new EyeblossomVineBushBlock(EyeblossomVineBushBlock.Type.CLOSED));
    public static final RegistryObject<WildflowersVineBushBlock> WILDFLOWERS_BUSH = BLOCKS.register("wildflowers_bush", WildflowersVineBushBlock::new);

    //Mossy Stone Brick
    public static final RegistryObject<Block> DANDELION_MOSSY_STONE_BRICK = BLOCKS.register("dandelion_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("dandelion_mossy_stone_brick"));
    public static final RegistryObject<Block> POPPY_MOSSY_STONE_BRICK = BLOCKS.register("poppy_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("poppy_mossy_stone_brick"));
    public static final RegistryObject<Block> BLUE_ORCHID_MOSSY_STONE_BRICK = BLOCKS.register("blue_orchid_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("blue_orchid_mossy_stone_brick"));
    public static final RegistryObject<Block> ALLIUM_MOSSY_STONE_BRICK = BLOCKS.register("allium_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("allium_mossy_stone_brick"));
    public static final RegistryObject<Block> AZURE_BLUET_MOSSY_STONE_BRICK = BLOCKS.register("azure_bluet_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("azure_bluet_mossy_stone_brick"));
    public static final RegistryObject<Block> RED_TULIP_MOSSY_STONE_BRICK = BLOCKS.register("red_tulip_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("red_tulip_mossy_stone_brick"));
    public static final RegistryObject<Block> ORANGE_TULIP_MOSSY_STONE_BRICK = BLOCKS.register("orange_tulip_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("orange_tulip_mossy_stone_brick"));
    public static final RegistryObject<Block> WHITE_TULIP_MOSSY_STONE_BRICK = BLOCKS.register("white_tulip_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("white_tulip_mossy_stone_brick"));
    public static final RegistryObject<Block> PINK_TULIP_MOSSY_STONE_BRICK = BLOCKS.register("pink_tulip_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("pink_tulip_mossy_stone_brick"));
    public static final RegistryObject<Block> OXEYE_DAISY_MOSSY_STONE_BRICK = BLOCKS.register("oxeye_daisy_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("oxeye_daisy_mossy_stone_brick"));
    public static final RegistryObject<Block> CORNFLOWER_MOSSY_STONE_BRICK = BLOCKS.register("cornflower_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("cornflower_mossy_stone_brick"));
    public static final RegistryObject<Block> LILY_OF_THE_VALLEY_MOSSY_STONE_BRICK = BLOCKS.register("lily_of_the_valley_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("lily_of_the_valley_mossy_stone_brick"));
    public static final RegistryObject<Block> WITHER_ROSE_MOSSY_STONE_BRICK = BLOCKS.register("wither_rose_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.createWither("wither_rose_mossy_stone_brick"));
    public static final RegistryObject<Block> SUNFLOWER_MOSSY_STONE_BRICK = BLOCKS.register("sunflower_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("sunflower_mossy_stone_brick"));
    public static final RegistryObject<Block> LILAC_MOSSY_STONE_BRICK = BLOCKS.register("lilac_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("lilac_mossy_stone_brick"));
    public static final RegistryObject<Block> ROSE_BUSH_MOSSY_STONE_BRICK = BLOCKS.register("rose_bush_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("rose_bush_mossy_stone_brick"));
    public static final RegistryObject<Block> PEONY_MOSSY_STONE_BRICK = BLOCKS.register("peony_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("peony_mossy_stone_brick"));
    public static final RegistryObject<Block> TORCHFLOWER_MOSSY_STONE_BRICK = BLOCKS.register("torchflower_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("torchflower_mossy_stone_brick"));
    public static final RegistryObject<Block> PITCHER_PLANT_MOSSY_STONE_BRICK = BLOCKS.register("pitcher_plant_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("pitcher_plant_mossy_stone_brick"));
    public static final RegistryObject<Block> CHORUS_FLOWER_MOSSY_STONE_BRICK = BLOCKS.register("chorus_flower_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("chorus_flower_mossy_stone_brick"));
    public static final RegistryObject<Block> AZALEA_MOSSY_STONE_BRICK = BLOCKS.register("azalea_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("azalea_mossy_stone_brick"));
    public static final RegistryObject<Block> PINK_PETALS_MOSSY_STONE_BRICK = BLOCKS.register("pink_petals_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("pink_petals_mossy_stone_brick"));
    public static final RegistryObject<Block> SPORE_BLOSSOM_MOSSY_STONE_BRICK = BLOCKS.register("spore_blossom_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("spore_blossom_mossy_stone_brick"));
    public static final RegistryObject<Block> OPEN_EYEBLOSSOM_MOSSY_STONE_BRICK = BLOCKS.register("open_eyeblossom_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.createEyeblossom("open_eyeblossom_mossy_stone_brick", EyeblossomMossyStoneBrickBlock.Type.OPEN));
    public static final RegistryObject<Block> CLOSED_EYEBLOSSOM_MOSSY_STONE_BRICK = BLOCKS.register("closed_eyeblossom_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.createEyeblossom("closed_eyeblossom_mossy_stone_brick", EyeblossomMossyStoneBrickBlock.Type.CLOSED));
    public static final RegistryObject<Block> WILDFLOWERS_MOSSY_STONE_BRICK = BLOCKS.register("wildflowers_mossy_stone_brick", () -> MossyStoneBricksBlockFactory.create("wildflowers_mossy_stone_brick"));

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
    public static final RegistryObject<Block> LARGE_TORCHFLOWER_POT = BLOCKS.register("large_torchflower_pot", LargeTorchflowerPot::new);
    public static final RegistryObject<Block> LARGE_PITCHER_PLANT_POT = BLOCKS.register("large_pitcher_plant_pot", LargePitcherPlantPot::new);
    public static final RegistryObject<Block> LARGE_AZALEA_POT = BLOCKS.register("large_azalea_pot", LargeAzaleaPot::new);
    public static final RegistryObject<Block> LARGE_SPORE_BLOSSOM_POT = BLOCKS.register("large_spore_blossom_pot", LargeSporeBlossomPot::new);
    public static final RegistryObject<Block> LARGE_OPEN_EYEBLOSSOM_POT = BLOCKS.register("large_open_eyeblossom_pot", () -> new LargeEyeblossomPot(LargeEyeblossomPot.Type.OPEN));
    public static final RegistryObject<Block> LARGE_CLOSED_EYEBLOSSOM_POT = BLOCKS.register("large_closed_eyeblossom_pot", () -> new LargeEyeblossomPot(LargeEyeblossomPot.Type.CLOSED));

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
    public static final RegistryObject<Block> LARGE_DOUBLE_TORCHFLOWER_POT = BLOCKS.register("large_double_torchflower_pot", LargeDoubleTorchflowerPot::new);
    public static final RegistryObject<Block> LARGE_DOUBLE_PITCHER_PLANT_POT = BLOCKS.register("large_double_pitcher_plant_pot", LargeDoublePitcherPlantPot::new);
    public static final RegistryObject<Block> LARGE_DOUBLE_AZALEA_POT = BLOCKS.register("large_double_azalea_pot", LargeDoubleAzaleaPot::new);
    public static final RegistryObject<Block> LARGE_DOUBLE_SPORE_BLOSSOM_POT = BLOCKS.register("large_double_spore_blossom_pot", LargeDoubleSporeBlossomPot::new);
    public static final RegistryObject<Block> LARGE_DOUBLE_OPEN_EYEBLOSSOM_POT = BLOCKS.register("large_double_open_eyeblossom_pot", () -> new LargeDoubleEyeblossomPot(LargeDoubleEyeblossomPot.Type.OPEN));
    public static final RegistryObject<Block> LARGE_DOUBLE_CLOSED_EYEBLOSSOM_POT = BLOCKS.register("large_double_closed_eyeblossom_pot", () -> new LargeDoubleEyeblossomPot(LargeDoubleEyeblossomPot.Type.CLOSED));

    //Special
    public static final RegistryObject<Block> DANCING_SUNFLOWER = BLOCKS.register("dancing_sunflower", DancingSunflower::new);

    //Floral Baskets
    public static final RegistryObject<Block> FLORAL_BASKET = BLOCKS.register("floral_basket", () -> FloralBasketFactory.create("floral_basket"));
    public static final RegistryObject<Block> DANDELION_BASKET = BLOCKS.register("dandelion_basket", () -> FloralBasketFactory.create("dandelion_basket"));
    public static final RegistryObject<Block> POPPY_BASKET = BLOCKS.register("poppy_basket", () -> FloralBasketFactory.create("poppy_basket"));
    public static final RegistryObject<Block> BLUE_ORCHID_BASKET = BLOCKS.register("blue_orchid_basket", () -> FloralBasketFactory.create("blue_orchid_basket"));
    public static final RegistryObject<Block> ALLIUM_BASKET = BLOCKS.register("allium_basket", () -> FloralBasketFactory.create("allium_basket"));
    public static final RegistryObject<Block> AZURE_BLUET_BASKET = BLOCKS.register("azure_bluet_basket", () -> FloralBasketFactory.create("azure_bluet_basket"));
    public static final RegistryObject<Block> RED_TULIP_BASKET = BLOCKS.register("red_tulip_basket", () -> FloralBasketFactory.create("red_tulip_basket"));
    public static final RegistryObject<Block> ORANGE_TULIP_BASKET = BLOCKS.register("orange_tulip_basket", () -> FloralBasketFactory.create("orange_tulip_basket"));
    public static final RegistryObject<Block> WHITE_TULIP_BASKET = BLOCKS.register("white_tulip_basket", () -> FloralBasketFactory.create("white_tulip_basket"));
    public static final RegistryObject<Block> PINK_TULIP_BASKET = BLOCKS.register("pink_tulip_basket", () -> FloralBasketFactory.create("pink_tulip_basket"));
    public static final RegistryObject<Block> OXEYE_DAISY_BASKET = BLOCKS.register("oxeye_daisy_basket", () -> FloralBasketFactory.create("oxeye_daisy_basket"));
    public static final RegistryObject<Block> CORNFLOWER_BASKET = BLOCKS.register("cornflower_basket", () -> FloralBasketFactory.create("cornflower_basket"));
    public static final RegistryObject<Block> LILY_OF_THE_VALLEY_BASKET = BLOCKS.register("lily_of_the_valley_basket", () -> FloralBasketFactory.create("lily_of_the_valley_basket"));
    public static final RegistryObject<Block> WITHER_ROSE_BASKET = BLOCKS.register("wither_rose_basket", () -> FloralBasketFactory.createWither("wither_rose_basket"));
    public static final RegistryObject<Block> TORCHFLOWER_BASKET = BLOCKS.register("torchflower_basket", () -> FloralBasketFactory.create("torchflower_basket"));
    public static final RegistryObject<Block> PITCHER_PLANT_BASKET = BLOCKS.register("pitcher_plant_basket", () -> FloralBasketFactory.create("pitcher_plant_basket"));
    public static final RegistryObject<Block> AZALEA_BASKET = BLOCKS.register("azalea_basket", () -> FloralBasketFactory.create("azalea_basket"));
    public static final RegistryObject<Block> SPORE_BLOSSOM_BASKET = BLOCKS.register("spore_blossom_basket", () -> FloralBasketFactory.create("spore_blossom_basket"));
    public static final RegistryObject<Block> OPEN_EYEBLOSSOM_BASKET = BLOCKS.register("open_eyeblossom_basket", () -> FloralBasketFactory.createEyeblossom("open_eyeblossom_basket", EyeblossomFloralBasket.Type.OPEN));
    public static final RegistryObject<Block> CLOSED_EYEBLOSSOM_BASKET = BLOCKS.register("closed_eyeblossom_basket", () -> FloralBasketFactory.createEyeblossom("closed_eyeblossom_basket", EyeblossomFloralBasket.Type.CLOSED));

    public static void loadClass() {
    }
}
