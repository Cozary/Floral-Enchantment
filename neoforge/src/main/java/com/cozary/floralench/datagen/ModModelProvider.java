package com.cozary.floralench.datagen;

import com.cozary.floralench.FloralEnchantment;
import com.cozary.floralench.init.ModBlocks;
import com.cozary.floralench.init.ModItems;
import com.mojang.math.Quadrant;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.MultiPartGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.renderer.block.dispatch.VariantMutator;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.client.resources.model.UnbakedModel;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.client.model.generators.template.ExtendedModelTemplateBuilder;

import static net.minecraft.client.data.models.BlockModelGenerators.plainVariant;

public class ModModelProvider extends ModelProvider {

    public ModModelProvider(PackOutput output) {
        super(output, FloralEnchantment.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        itemModels.generateFlatItem(ModItems.RED_CROWN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.YELLOW_CROWN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BLUE_CROWN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.WHITE_CROWN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.PINK_CROWN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BLACK_CROWN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.TULIPS_CROWN.get(), ModelTemplates.FLAT_ITEM);

// Bushes
        createBushSmallModel(blockModels);
        createBushLargeModel(blockModels);

        createBush(blockModels, itemModels, ModBlocks.ALLIUM_BUSH.get(), ModItems.ALLIUM_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.AZURE_BLUET_BUSH.get(), ModItems.AZURE_BLUET_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.BLUE_ORCHID_BUSH.get(), ModItems.BLUE_ORCHID_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.CORNFLOWER_BUSH.get(), ModItems.CORNFLOWER_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.DANDELION_BUSH.get(), ModItems.DANDELION_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.LILAC_BUSH.get(), ModItems.LILAC_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.LILY_OF_THE_VALLEY_BUSH.get(), ModItems.LILY_OF_THE_VALLEY_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.ORANGE_TULIP_BUSH.get(), ModItems.ORANGE_TULIP_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.OXEYE_DAISY_BUSH.get(), ModItems.OXEYE_DAISY_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.PEONY_BUSH.get(), ModItems.PEONY_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.PINK_TULIP_BUSH.get(), ModItems.PINK_TULIP_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.POPPY_BUSH.get(), ModItems.POPPY_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.RED_TULIP_BUSH.get(), ModItems.RED_TULIP_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.ROSE_BUSH_BUSH.get(), ModItems.ROSE_BUSH_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.SUNFLOWER_BUSH.get(), ModItems.SUNFLOWER_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.WHITE_TULIP_BUSH.get(), ModItems.WHITE_TULIP_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.WITHER_ROSE_BUSH.get(), ModItems.WITHER_ROSE_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.TORCHFLOWER_BUSH.get(), ModItems.TORCHFLOWER_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.PITCHER_PLANT_BUSH.get(), ModItems.PITCHER_PLANT_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.CHORUS_FLOWER_BUSH.get(), ModItems.CHORUS_FLOWER_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.AZALEA_BUSH.get(), ModItems.AZALEA_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.PINK_PETALS_BUSH.get(), ModItems.PINK_PETALS_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.SPORE_BLOSSOM_BUSH.get(), ModItems.SPORE_BLOSSOM_BUSH_ITEM.get());
        createBushEmissive(blockModels, itemModels, ModBlocks.OPEN_EYEBLOSSOM_BUSH.get(), ModItems.OPEN_EYEBLOSSOM_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.CLOSED_EYEBLOSSOM_BUSH.get(), ModItems.CLOSED_EYEBLOSSOM_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.WILDFLOWERS_BUSH.get(), ModItems.WILDFLOWERS_BUSH_ITEM.get());
        createBush(blockModels, itemModels, ModBlocks.CACTUS_FLOWER_BUSH.get(), ModItems.CACTUS_FLOWER_BUSH_ITEM.get());

// Mossy Cobblestone
        createMossyCobblestoneParent(blockModels);

        createMossyCobblestone(blockModels, ModBlocks.ALLIUM_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.AZURE_BLUET_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.BLUE_ORCHID_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.CORNFLOWER_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.DANDELION_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.LILAC_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.LILY_OF_THE_VALLEY_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.ORANGE_TULIP_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.OXEYE_DAISY_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.PEONY_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.PINK_TULIP_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.POPPY_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.RED_TULIP_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.ROSE_BUSH_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.SUNFLOWER_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.WHITE_TULIP_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.WITHER_ROSE_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.TORCHFLOWER_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.PITCHER_PLANT_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.CHORUS_FLOWER_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.AZALEA_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.PINK_PETALS_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.SPORE_BLOSSOM_MOSSY_COBBLESTONE.get());
        createMossyCobblestoneEmissive(blockModels, ModBlocks.OPEN_EYEBLOSSOM_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.CLOSED_EYEBLOSSOM_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.WILDFLOWERS_MOSSY_COBBLESTONE.get());
        createMossyCobblestone(blockModels, ModBlocks.CACTUS_FLOWER_MOSSY_COBBLESTONE.get());

// Mossy Stone Brick
        createMossyStoneBrickParent(blockModels);

        createMossyStoneBrick(blockModels, ModBlocks.ALLIUM_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.AZURE_BLUET_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.BLUE_ORCHID_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.CORNFLOWER_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.DANDELION_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.LILAC_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.LILY_OF_THE_VALLEY_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.ORANGE_TULIP_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.OXEYE_DAISY_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.PEONY_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.PINK_TULIP_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.POPPY_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.RED_TULIP_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.ROSE_BUSH_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.SUNFLOWER_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.WHITE_TULIP_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.WITHER_ROSE_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.TORCHFLOWER_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.PITCHER_PLANT_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.CHORUS_FLOWER_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.AZALEA_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.PINK_PETALS_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.SPORE_BLOSSOM_MOSSY_STONE_BRICK.get());
        createMossyStoneBrickEmissive(blockModels, ModBlocks.OPEN_EYEBLOSSOM_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.CLOSED_EYEBLOSSOM_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.WILDFLOWERS_MOSSY_STONE_BRICK.get());
        createMossyStoneBrick(blockModels, ModBlocks.CACTUS_FLOWER_MOSSY_STONE_BRICK.get());

// Vines
        createVine(blockModels, ModBlocks.ALLIUM_VINE.get(), ModItems.ALLIUM_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.AZURE_BLUET_VINE.get(), ModItems.AZURE_BLUET_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.BLUE_ORCHID_VINE.get(), ModItems.BLUE_ORCHID_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.CORNFLOWER_VINE.get(), ModItems.CORNFLOWER_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.DANDELION_VINE.get(), ModItems.DANDELION_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.LILAC_VINE.get(), ModItems.LILAC_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.LILY_OF_THE_VALLEY_VINE.get(), ModItems.LILY_OF_THE_VALLEY_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.ORANGE_TULIP_VINE.get(), ModItems.ORANGE_TULIP_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.OXEYE_DAISY_VINE.get(), ModItems.OXEYE_DAISY_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.PEONY_VINE.get(), ModItems.PEONY_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.PINK_TULIP_VINE.get(), ModItems.PINK_TULIP_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.POPPY_VINE.get(), ModItems.POPPY_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.RED_TULIP_VINE.get(), ModItems.RED_TULIP_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.ROSE_BUSH_VINE.get(), ModItems.ROSE_BUSH_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.SUNFLOWER_VINE.get(), ModItems.SUNFLOWER_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.WHITE_TULIP_VINE.get(), ModItems.WHITE_TULIP_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.WITHER_ROSE_VINE.get(), ModItems.WITHER_ROSE_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.TORCHFLOWER_VINE.get(), ModItems.TORCHFLOWER_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.PITCHER_PLANT_VINE.get(), ModItems.PITCHER_PLANT_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.CHORUS_FLOWER_VINE.get(), ModItems.CHORUS_FLOWER_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.AZALEA_VINE.get(), ModItems.AZALEA_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.PINK_PETALS_VINE.get(), ModItems.PINK_PETALS_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.SPORE_BLOSSOM_VINE.get(), ModItems.SPORE_BLOSSOM_VINE_ITEM.get());
        createVineEmissive(blockModels, ModBlocks.OPEN_EYEBLOSSOM_VINE.get(), ModItems.OPEN_EYEBLOSSOM_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.CLOSED_EYEBLOSSOM_VINE.get(), ModItems.CLOSED_EYEBLOSSOM_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.WILDFLOWERS_VINE.get(), ModItems.WILDFLOWERS_VINE_ITEM.get());
        createVine(blockModels, ModBlocks.CACTUS_FLOWER_VINE.get(), ModItems.CACTUS_FLOWER_VINE_ITEM.get());

// Large pots
        createLargePot(blockModels, ModBlocks.LARGE_POT.get());

        createLargePotCrossSingle(blockModels, ModBlocks.LARGE_POT.get());
        createLargePotCrossTall(blockModels, ModBlocks.LARGE_POT.get());
        createLargePotCrossDouble(blockModels, ModBlocks.LARGE_POT.get());

        createLargePotVariants(blockModels, ModBlocks.LARGE_ALLIUM_POT.get(), Blocks.ALLIUM);
        createLargePotDoubleVariant(blockModels, ModBlocks.LARGE_DOUBLE_ALLIUM_POT.get(), Blocks.ALLIUM);

        createLargePotVariants(blockModels, ModBlocks.LARGE_AZURE_BLUET_POT.get(), Blocks.AZURE_BLUET);
        createLargePotDoubleVariant(blockModels, ModBlocks.LARGE_DOUBLE_AZURE_BLUET_POT.get(), Blocks.AZURE_BLUET);

        createLargePotVariants(blockModels, ModBlocks.LARGE_BLUE_ORCHID_POT.get(), Blocks.BLUE_ORCHID);
        createLargePotDoubleVariant(blockModels, ModBlocks.LARGE_DOUBLE_BLUE_ORCHID_POT.get(), Blocks.BLUE_ORCHID);

        createLargePotVariants(blockModels, ModBlocks.LARGE_CORNFLOWER_POT.get(), Blocks.CORNFLOWER);
        createLargePotDoubleVariant(blockModels, ModBlocks.LARGE_DOUBLE_CORNFLOWER_POT.get(), Blocks.CORNFLOWER);

        createLargePotVariants(blockModels, ModBlocks.LARGE_DANDELION_POT.get(), Blocks.DANDELION);
        createLargePotDoubleVariant(blockModels, ModBlocks.LARGE_DOUBLE_DANDELION_POT.get(), Blocks.DANDELION);

        createLargePotTall(blockModels, ModBlocks.LARGE_LILAC_POT.get(), "lilac_top", "lilac_bottom");

        createLargePotVariants(blockModels, ModBlocks.LARGE_LILY_OF_THE_VALLEY_POT.get(), Blocks.LILY_OF_THE_VALLEY);
        createLargePotDoubleVariant(blockModels, ModBlocks.LARGE_DOUBLE_LILY_OF_THE_VALLEY_POT.get(), Blocks.LILY_OF_THE_VALLEY);

        createLargePotVariants(blockModels, ModBlocks.LARGE_ORANGE_TULIP_POT.get(), Blocks.ORANGE_TULIP);
        createLargePotDoubleVariant(blockModels, ModBlocks.LARGE_DOUBLE_ORANGE_TULIP_POT.get(), Blocks.ORANGE_TULIP);

        createLargePotVariants(blockModels, ModBlocks.LARGE_OXEYE_DAISY_POT.get(), Blocks.OXEYE_DAISY);
        createLargePotDoubleVariant(blockModels, ModBlocks.LARGE_DOUBLE_OXEYE_DAISY_POT.get(), Blocks.OXEYE_DAISY);

        createLargePotTall(blockModels, ModBlocks.LARGE_PEONY_POT.get(), "peony_top", "peony_bottom");

        createLargePotVariants(blockModels, ModBlocks.LARGE_PINK_TULIP_POT.get(), Blocks.PINK_TULIP);
        createLargePotDoubleVariant(blockModels, ModBlocks.LARGE_DOUBLE_PINK_TULIP_POT.get(), Blocks.PINK_TULIP);

        createLargePotVariants(blockModels, ModBlocks.LARGE_POPPY_POT.get(), Blocks.POPPY);
        createLargePotDoubleVariant(blockModels, ModBlocks.LARGE_DOUBLE_POPPY_POT.get(), Blocks.POPPY);

        createLargePotVariants(blockModels, ModBlocks.LARGE_RED_TULIP_POT.get(), Blocks.RED_TULIP);
        createLargePotDoubleVariant(blockModels, ModBlocks.LARGE_DOUBLE_RED_TULIP_POT.get(), Blocks.RED_TULIP);

        createLargePotTall(blockModels, ModBlocks.LARGE_ROSE_BUSH_POT.get(), "rose_bush_top", "rose_bush_bottom");

        createLargePotSunflower(blockModels, ModBlocks.LARGE_SUNFLOWER_POT.get());
        createDancingSunflower(blockModels, ModBlocks.DANCING_SUNFLOWER.get());

        createLargePotVariants(blockModels, ModBlocks.LARGE_WHITE_TULIP_POT.get(), Blocks.WHITE_TULIP);
        createLargePotDoubleVariant(blockModels, ModBlocks.LARGE_DOUBLE_WHITE_TULIP_POT.get(), Blocks.WHITE_TULIP);

        createLargePotVariants(blockModels, ModBlocks.LARGE_WITHER_ROSE_POT.get(), Blocks.WITHER_ROSE);
        createLargePotDoubleVariant(blockModels, ModBlocks.LARGE_DOUBLE_WITHER_ROSE_POT.get(), Blocks.WITHER_ROSE);

        createLargePotVariants(blockModels, ModBlocks.LARGE_TORCHFLOWER_POT.get(), Blocks.TORCHFLOWER);
        createLargePotDoubleVariant(blockModels, ModBlocks.LARGE_DOUBLE_TORCHFLOWER_POT.get(), Blocks.TORCHFLOWER);

        createLargePotFromString(blockModels, ModBlocks.LARGE_PITCHER_PLANT_POT.get(), "pitcher_crop_top_stage_4");
        createLargePotFromStringDouble(blockModels, ModBlocks.LARGE_DOUBLE_PITCHER_PLANT_POT.get(), "pitcher_crop_top_stage_4");

        createLargePotVariants(blockModels, ModBlocks.LARGE_AZALEA_POT.get(), Blocks.FLOWERING_AZALEA_LEAVES);
        createLargePotDoubleVariant(blockModels, ModBlocks.LARGE_DOUBLE_AZALEA_POT.get(), Blocks.FLOWERING_AZALEA_LEAVES);

        createLargePotVariants(blockModels, ModBlocks.LARGE_SPORE_BLOSSOM_POT.get(), Blocks.SPORE_BLOSSOM);
        createLargePotDoubleVariant(blockModels, ModBlocks.LARGE_DOUBLE_SPORE_BLOSSOM_POT.get(), Blocks.SPORE_BLOSSOM);

        createLargePotEmissive(blockModels, ModBlocks.LARGE_OPEN_EYEBLOSSOM_POT.get(), Blocks.OPEN_EYEBLOSSOM);
        createLargePotEmissiveDouble(blockModels, ModBlocks.LARGE_DOUBLE_OPEN_EYEBLOSSOM_POT.get(), Blocks.OPEN_EYEBLOSSOM);

        createLargePotVariants(blockModels, ModBlocks.LARGE_CLOSED_EYEBLOSSOM_POT.get(), Blocks.CLOSED_EYEBLOSSOM);
        createLargePotDoubleVariant(blockModels, ModBlocks.LARGE_DOUBLE_CLOSED_EYEBLOSSOM_POT.get(), Blocks.CLOSED_EYEBLOSSOM);

        createLargePotVariants(blockModels, ModBlocks.LARGE_CACTUS_FLOWER_POT.get(), Blocks.CACTUS_FLOWER);
        createLargePotDoubleVariant(blockModels, ModBlocks.LARGE_DOUBLE_CACTUS_FLOWER_POT.get(), Blocks.CACTUS_FLOWER);

        //Baskets
        createFloralBasketCross(blockModels, ModBlocks.FLORAL_BASKET.get());
        createFloralBasket(blockModels, ModBlocks.FLORAL_BASKET.get());

        createFloralBasketVariants(blockModels, ModBlocks.ALLIUM_BASKET.get(), Blocks.ALLIUM);
        createFloralBasketVariants(blockModels, ModBlocks.AZURE_BLUET_BASKET.get(), Blocks.AZURE_BLUET);
        createFloralBasketVariants(blockModels, ModBlocks.BLUE_ORCHID_BASKET.get(), Blocks.BLUE_ORCHID);
        createFloralBasketVariants(blockModels, ModBlocks.CORNFLOWER_BASKET.get(), Blocks.CORNFLOWER);
        createFloralBasketVariants(blockModels, ModBlocks.DANDELION_BASKET.get(), Blocks.DANDELION);
        createFloralBasketVariants(blockModels, ModBlocks.LILY_OF_THE_VALLEY_BASKET.get(), Blocks.LILY_OF_THE_VALLEY);
        createFloralBasketVariants(blockModels, ModBlocks.ORANGE_TULIP_BASKET.get(), Blocks.ORANGE_TULIP);
        createFloralBasketVariants(blockModels, ModBlocks.OXEYE_DAISY_BASKET.get(), Blocks.OXEYE_DAISY);
        createFloralBasketVariants(blockModels, ModBlocks.PINK_TULIP_BASKET.get(), Blocks.PINK_TULIP);
        createFloralBasketVariants(blockModels, ModBlocks.POPPY_BASKET.get(), Blocks.POPPY);
        createFloralBasketVariants(blockModels, ModBlocks.RED_TULIP_BASKET.get(), Blocks.RED_TULIP);
        createFloralBasketVariants(blockModels, ModBlocks.WHITE_TULIP_BASKET.get(), Blocks.WHITE_TULIP);
        createFloralBasketVariants(blockModels, ModBlocks.WITHER_ROSE_BASKET.get(), Blocks.WITHER_ROSE);
        createFloralBasketVariants(blockModels, ModBlocks.TORCHFLOWER_BASKET.get(), Blocks.TORCHFLOWER);
        createFloralBasketFromString(blockModels, ModBlocks.PITCHER_PLANT_BASKET.get(), "pitcher_crop_top_stage_4");
        createFloralBasketVariants(blockModels, ModBlocks.AZALEA_BASKET.get(), Blocks.FLOWERING_AZALEA_LEAVES);
        createFloralBasketVariants(blockModels, ModBlocks.SPORE_BLOSSOM_BASKET.get(), Blocks.SPORE_BLOSSOM);
        createFloralBasketEmissive(blockModels, ModBlocks.OPEN_EYEBLOSSOM_BASKET.get(), Blocks.OPEN_EYEBLOSSOM);
        createFloralBasketVariants(blockModels, ModBlocks.CLOSED_EYEBLOSSOM_BASKET.get(), Blocks.CLOSED_EYEBLOSSOM);
        createFloralBasketVariants(blockModels, ModBlocks.CACTUS_FLOWER_BASKET.get(), Blocks.CACTUS_FLOWER);

    }

    //I hate some things in this world...

    /*-------VINES--------*/
    private void createVine(BlockModelGenerators blockModels, Block block, Item item) {
        String blockName = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier blockRL = this.modLocation("block/" + blockName);

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .ambientOcclusion(false)
                .requiredTextureSlot(TextureSlot.PARTICLE)
                .requiredTextureSlot(TextureSlot.TEXTURE)
                .element(element -> {
                    element.from(0, 0, 0.8f);
                    element.to(16, 16, 0.8f);
                    element.shade(false);
                    element.face(Direction.NORTH, face -> {
                        face.uvs(16, 0, 0, 16);
                        face.texture(TextureSlot.TEXTURE);
                        face.tintindex(0);
                    });
                    element.face(Direction.SOUTH, face -> {
                        face.uvs(0, 0, 16, 16);
                        face.texture(TextureSlot.TEXTURE);
                        face.tintindex(0);
                    });
                });

        ModelTemplate blockModelTemplate = builder.build();
        blockModelTemplate.create(
                blockRL,
                new TextureMapping()
                        .put(TextureSlot.PARTICLE, new Material(blockRL))
                        .put(TextureSlot.TEXTURE, new Material(blockRL)),
                blockModels.modelOutput
        );

        MultiVariant variant = plainVariant(blockRL).with(VariantMutator.UV_LOCK.withValue(true));

        blockModels.blockStateOutput.accept(
                MultiPartGenerator.multiPart(block)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.NORTH, true),
                                variant)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.EAST, true),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.SOUTH, true),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.WEST, true),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.UP, true),
                                variant.with(VariantMutator.X_ROT.withValue(Quadrant.R270)))
        );

        Identifier resourcelocation = blockModels.createFlatItemModelWithBlockTexture(item, block);
        blockModels.registerSimpleItemModel(block, resourcelocation);
    }

    private void createVineEmissive(BlockModelGenerators blockModels, Block block, Item item) {
        String blockName = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier blockRL = this.modLocation("block/" + blockName);

        Identifier blockTexture = this.modLocation("block/" + blockName);
        Identifier emissiveTexture = this.modLocation("block/open_eyeblossom_bush_stage2_emissive");

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .ambientOcclusion(false)
                .requiredTextureSlot(TextureSlot.PARTICLE)
                .requiredTextureSlot(TextureSlot.TEXTURE)
                .requiredTextureSlot(TextureSlot.CROSS_EMISSIVE);

        builder.element(element -> {
            element.from(0, 0, 0.8f);
            element.to(16, 16, 0.8f);
            element.shade(false);
            element.face(Direction.NORTH, face -> {
                face.uvs(16, 0, 0, 16);
                face.texture(TextureSlot.TEXTURE);
                face.tintindex(0);
            });
            element.face(Direction.SOUTH, face -> {
                face.uvs(0, 0, 16, 16);
                face.texture(TextureSlot.TEXTURE);
                face.tintindex(0);
            });
        });

        builder.element(element -> {
            element.from(0, 0, 0.8f);
            element.to(16, 16, 0.8f);
            element.shade(false);
            element.lightEmission(15);

            element.face(Direction.NORTH, face -> face.texture(TextureSlot.CROSS_EMISSIVE));
            element.face(Direction.EAST, face -> face.texture(TextureSlot.CROSS_EMISSIVE));
            element.face(Direction.SOUTH, face -> face.texture(TextureSlot.CROSS_EMISSIVE));
            element.face(Direction.WEST, face -> face.texture(TextureSlot.CROSS_EMISSIVE));
            element.face(Direction.UP, face -> face.texture(TextureSlot.CROSS_EMISSIVE));
            element.face(Direction.DOWN, face -> face.texture(TextureSlot.CROSS_EMISSIVE));

        });

        ModelTemplate blockModelTemplate = builder.build();

        blockModelTemplate.create(
                blockRL,
                new TextureMapping()
                        .put(TextureSlot.PARTICLE, new Material(blockTexture))
                        .put(TextureSlot.TEXTURE, new Material(blockTexture))
                        .put(TextureSlot.CROSS_EMISSIVE, new Material(emissiveTexture))
                ,
                blockModels.modelOutput
        );

        MultiVariant variant = plainVariant(blockRL).with(VariantMutator.UV_LOCK.withValue(true));

        blockModels.blockStateOutput.accept(
                MultiPartGenerator.multiPart(block)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.NORTH, true),
                                variant)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.EAST, true),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.SOUTH, true),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.WEST, true),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.UP, true),
                                variant.with(VariantMutator.X_ROT.withValue(Quadrant.R270)))
        );

        Identifier itemModelLocation = ModelLocationUtils.getModelLocation(item);
        ModelTemplates.TWO_LAYERED_ITEM.create(
                itemModelLocation,
                new TextureMapping()
                        .put(TextureSlot.LAYER0, new Material(blockTexture))
                        .put(TextureSlot.LAYER1, new Material(emissiveTexture)),
                blockModels.modelOutput
        );
        blockModels.registerSimpleItemModel(block, itemModelLocation);
    }

    /*-------MOSSY COBBLESTONE--------*/
    private void createMossyCobblestoneParent(BlockModelGenerators blockModels) {
        Identifier modelLocation = this.modLocation("block/mossy_cobblestone");

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .parent(this.mcLocation("block/block"))
                .requiredTextureSlot(TextureSlot.TEXTURE)
                .requiredTextureSlot(TextureSlot.PARTICLE)

                .element(element -> {
                    element.from(0, 0, 0);
                    element.to(16, 16, 16);
                    for (Direction dir : Direction.values()) {
                        element.face(dir, face -> {
                            face.uvs(0, 0, 16, 16);
                            face.texture(TextureSlot.TEXTURE);
                        });
                    }
                })

                .element(element -> {
                    element.from(0, 0, 0);
                    element.to(16, 16, 16);
                    for (Direction dir : Direction.values()) {
                        element.face(dir, face -> {
                            face.uvs(0, 0, 16, 16);
                            face.texture(TextureSlot.ALL);
                        });
                    }
                });

        ModelTemplate modelTemplate = builder.build();

        modelTemplate.create(
                modelLocation,
                new TextureMapping()
                        .put(TextureSlot.TEXTURE, new Material(this.mcLocation("block/cobblestone")))
                        .put(TextureSlot.PARTICLE, new Material(this.mcLocation("block/cobblestone"))),
                blockModels.modelOutput
        );
    }

    private void createMossyCobblestone(BlockModelGenerators blockModels, Block block) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier blockModelLocation = this.modLocation("block/" + name);

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .parent(this.modLocation("block/mossy_cobblestone"))
                .requiredTextureSlot(TextureSlot.ALL);

        ModelTemplate modelTemplate = builder.build();

        modelTemplate.create(
                blockModelLocation,
                new TextureMapping()
                        .put(TextureSlot.ALL, new Material(this.modLocation("block/" + name))),
                blockModels.modelOutput
        );

        MultiVariant variant = plainVariant(blockModelLocation);

        blockModels.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(
                        block,
                        variant
                )
        );
    }

    private void createMossyCobblestoneEmissive(BlockModelGenerators blockModels, Block block) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier blockTexture = this.mcLocation("block/cobblestone");
        Identifier blockModelLocation = this.modLocation("block/" + name);
        Identifier emissiveTexture = this.modLocation("block/open_eyeblossom_mossy_cobblestone_emissive");

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .parent(Identifier.parse("block/block"))
                .requiredTextureSlot(TextureSlot.TEXTURE)
                .requiredTextureSlot(TextureSlot.ALL)
                .requiredTextureSlot(TextureSlot.CROSS_EMISSIVE)
                .requiredTextureSlot(TextureSlot.PARTICLE);

        builder.element(element -> {
            element.from(0, 0, 0);
            element.to(16, 16, 16);

            element.face(Direction.DOWN, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.TEXTURE);
            });
            element.face(Direction.UP, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.TEXTURE);
            });
            element.face(Direction.NORTH, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.TEXTURE);
            });
            element.face(Direction.SOUTH, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.TEXTURE);
            });
            element.face(Direction.WEST, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.TEXTURE);
            });
            element.face(Direction.EAST, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.TEXTURE);
            });
        });

        builder.element(element -> {
            element.from(0, 0, 0);
            element.to(16, 16, 16);

            element.face(Direction.DOWN, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.ALL);
            });
            element.face(Direction.UP, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.ALL);
            });
            element.face(Direction.NORTH, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.ALL);
            });
            element.face(Direction.SOUTH, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.ALL);
            });
            element.face(Direction.WEST, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.ALL);
            });
            element.face(Direction.EAST, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.ALL);
            });
        });

        builder.element(element -> {
            element.from(0, 0, 0);
            element.to(16, 16, 16);
            element.shade(false);
            element.lightEmission(15);

            element.face(Direction.NORTH, f -> f.texture(TextureSlot.CROSS_EMISSIVE));
            element.face(Direction.EAST, f -> f.texture(TextureSlot.CROSS_EMISSIVE));
            element.face(Direction.SOUTH, f -> f.texture(TextureSlot.CROSS_EMISSIVE));
            element.face(Direction.WEST, f -> f.texture(TextureSlot.CROSS_EMISSIVE));
            element.face(Direction.UP, f -> f.texture(TextureSlot.CROSS_EMISSIVE));
            element.face(Direction.DOWN, f -> f.texture(TextureSlot.CROSS_EMISSIVE));
        });

        ModelTemplate modelTemplate = builder.build();

        modelTemplate.create(
                blockModelLocation,
                new TextureMapping()
                        .put(TextureSlot.TEXTURE, new Material(blockTexture))
                        .put(TextureSlot.ALL, new Material(this.modLocation("block/" + name)))
                        .put(TextureSlot.CROSS_EMISSIVE, new Material(emissiveTexture))
                        .put(TextureSlot.PARTICLE, new Material(blockTexture)),
                blockModels.modelOutput
        );


        MultiVariant variant = plainVariant(blockModelLocation);

        blockModels.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(
                        block,
                        variant
                )
        );
    }

    /*-------BUSHES--------*/
    private void createBushSmallModel(BlockModelGenerators blockModels) {

        Identifier plantTexture = this.modLocation("block/bush_small");

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .parent(this.mcLocation("item/generated"))
                .requiredTextureSlot(TextureSlot.PARTICLE)
                .requiredTextureSlot(TextureSlot.PLANT);

        builder.element(element -> {
            element.from(3, 0, 3);
            element.to(13, 10, 13);

            element.face(Direction.NORTH, f -> {
                f.uvs(3, 3, 13, 13);
                f.texture(TextureSlot.PLANT);
            });

            element.face(Direction.EAST, f -> {
                f.uvs(3, 3, 13, 13);
                f.texture(TextureSlot.PLANT);
            });

            element.face(Direction.SOUTH, f -> {
                f.uvs(3, 3, 13, 13);
                f.texture(TextureSlot.PLANT);
            });

            element.face(Direction.WEST, f -> {
                f.uvs(3, 3, 13, 13);
                f.texture(TextureSlot.PLANT);
            });

            element.face(Direction.UP, f -> {
                f.uvs(3, 3, 13, 13);
                f.texture(TextureSlot.PLANT);
            });

            element.face(Direction.DOWN, f -> {
                f.uvs(3, 3, 13, 13);
                f.texture(TextureSlot.PLANT);
                f.cullface(Direction.DOWN);
            });
        });

        ModelTemplate template = builder.build();

        template.create(
                this.modLocation("block/bush_small"),
                new TextureMapping()
                        .put(TextureSlot.PARTICLE, new Material(plantTexture))
                        .put(TextureSlot.PLANT, new Material(plantTexture)),
                blockModels.modelOutput
        );
    }

    private void createBushLargeModel(BlockModelGenerators blockModels) {

        Identifier plantTexture = this.modLocation("block/bush_large");

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .parent(this.mcLocation("item/generated"))
                .requiredTextureSlot(TextureSlot.PARTICLE)
                .requiredTextureSlot(TextureSlot.PLANT);

        builder.element(element -> {
            element.from(1, 0, 1);
            element.to(15, 14, 15);

            element.face(Direction.NORTH, f -> {
                f.uvs(1, 1, 15, 15);
                f.texture(TextureSlot.PLANT);
            });

            element.face(Direction.EAST, f -> {
                f.uvs(1, 1, 15, 15);
                f.texture(TextureSlot.PLANT);
            });

            element.face(Direction.SOUTH, f -> {
                f.uvs(1, 1, 15, 15);
                f.texture(TextureSlot.PLANT);
            });

            element.face(Direction.WEST, f -> {
                f.uvs(1, 1, 15, 15);
                f.texture(TextureSlot.PLANT);
            });

            element.face(Direction.UP, f -> {
                f.uvs(1, 1, 15, 15);
                f.texture(TextureSlot.PLANT);
            });

            element.face(Direction.DOWN, f -> {
                f.uvs(1, 1, 15, 15);
                f.texture(TextureSlot.PLANT);
                f.cullface(Direction.DOWN);
            });
        });

        ModelTemplate template = builder.build();

        template.create(
                this.modLocation("block/bush_large"),
                new TextureMapping()
                        .put(TextureSlot.PARTICLE, new Material(plantTexture))
                        .put(TextureSlot.PLANT, new Material(plantTexture)),
                blockModels.modelOutput
        );
    }

    private void createBush(BlockModelGenerators blockModels, ItemModelGenerators itemModels, Block block, Item item) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();

        Identifier stage0 = this.modLocation("block/" + name + "_stage0");
        Identifier stage1 = this.modLocation("block/" + name + "_stage1");
        Identifier stage2 = this.modLocation("block/" + name + "_stage2");
        Identifier stage3 = this.modLocation("block/" + name + "_stage3");

        ModelTemplate crossTemplate = ExtendedModelTemplateBuilder.builder()
                .parent(this.mcLocation("block/cross"))
                .requiredTextureSlot(TextureSlot.CROSS)
                .build();

        crossTemplate.create(
                this.modLocation("block/" + name + "_stage0"),
                new TextureMapping()
                        .put(TextureSlot.CROSS, new Material(stage0)),
                blockModels.modelOutput
        );

        ModelTemplate bushSmallTemplate = ExtendedModelTemplateBuilder.builder()
                .parent(this.modLocation("block/bush_small"))
                .requiredTextureSlot(TextureSlot.PLANT)
                .requiredTextureSlot(TextureSlot.PARTICLE)
                .build();

        bushSmallTemplate.create(
                this.modLocation("block/" + name + "_stage1"),
                new TextureMapping()
                        .put(TextureSlot.PLANT, new Material(stage1))
                        .put(TextureSlot.PARTICLE, new Material(stage1)),
                blockModels.modelOutput
        );

        bushSmallTemplate.create(
                this.modLocation("block/" + name + "_stage2"),
                new TextureMapping()
                        .put(TextureSlot.PLANT, new Material(stage2))
                        .put(TextureSlot.PARTICLE, new Material(stage2)),
                blockModels.modelOutput
        );

        ModelTemplate bushLargeTemplate = ExtendedModelTemplateBuilder.builder()
                .parent(this.modLocation("block/bush_large"))
                .requiredTextureSlot(TextureSlot.PLANT)
                .requiredTextureSlot(TextureSlot.PARTICLE)
                .build();

        bushLargeTemplate.create(
                this.modLocation("block/" + name + "_stage3"),
                new TextureMapping()
                        .put(TextureSlot.PLANT, new Material(stage3))
                        .put(TextureSlot.PARTICLE, new Material(stage3)),
                blockModels.modelOutput
        );

        blockModels.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(block)
                        .with(PropertyDispatch.initial(BlockStateProperties.AGE_3)
                                .generate(age -> plainVariant(
                                        this.modLocation("block/" + name + "_stage" + age)
                                )))
        );

        crossTemplate.create(
                ModelLocationUtils.getModelLocation(item),
                new TextureMapping().put(TextureSlot.CROSS, new Material(stage0)),
                itemModels.modelOutput
        );

        blockModels.registerSimpleItemModel(block, stage0);
    }

    private void createBushEmissive(BlockModelGenerators blockModels, ItemModelGenerators itemModels, Block block, Item item) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();

        Identifier stage0 = this.modLocation("block/" + name + "_stage0");
        Identifier stage1 = this.modLocation("block/" + name + "_stage1");
        Identifier stage2 = this.modLocation("block/" + name + "_stage2");
        Identifier stage3 = this.modLocation("block/" + name + "_stage3");

        Identifier emissiveTexture_stage2 = this.modLocation("block/" + name + "_stage2_emissive");
        Identifier emissiveTexture_stage3 = this.modLocation("block/" + name + "_stage3_emissive");

        ModelTemplate crossTemplate = ExtendedModelTemplateBuilder.builder()
                .parent(this.mcLocation("block/cross"))
                .requiredTextureSlot(TextureSlot.CROSS)
                .build();

        crossTemplate.create(
                this.modLocation("block/" + name + "_stage0"),
                new TextureMapping().put(TextureSlot.CROSS, new Material(stage0)),
                blockModels.modelOutput
        );

        ModelTemplate stage1Template = ExtendedModelTemplateBuilder.builder()
                .parent(this.modLocation("block/bush_small"))
                .requiredTextureSlot(TextureSlot.PLANT)
                .requiredTextureSlot(TextureSlot.PARTICLE)
                .build();

        stage1Template.create(
                this.modLocation("block/" + name + "_stage1"),
                new TextureMapping()
                        .put(TextureSlot.PLANT, new Material(stage1))
                        .put(TextureSlot.PARTICLE, new Material(stage1)),
                blockModels.modelOutput
        );


        ModelTemplate stage2Template = ExtendedModelTemplateBuilder.builder()
                .parent(this.mcLocation("item/generated"))
                .requiredTextureSlot(TextureSlot.PLANT)
                .requiredTextureSlot(TextureSlot.PARTICLE)
                .requiredTextureSlot(TextureSlot.CROSS_EMISSIVE)
                .element(e -> {

                    e.from(3, 0, 3);
                    e.to(13, 10, 13);

                    for (Direction dir : Direction.values()) {
                        e.face(dir, f -> {
                            if (dir == Direction.DOWN) f.cullface(Direction.DOWN);
                            f.uvs(3, 3, 13, 13);
                            f.texture(TextureSlot.PLANT);
                        });
                    }
                })
                .element(e -> {

                    e.from(3, 0, 3);
                    e.to(13, 10, 13);
                    e.shade(false);
                    e.lightEmission(15);

                    for (Direction dir : Direction.values()) {
                        e.face(dir, f -> f.texture(TextureSlot.CROSS_EMISSIVE));
                    }
                })
                .build();

        stage2Template.create(
                this.modLocation("block/" + name + "_stage2"),
                new TextureMapping()
                        .put(TextureSlot.PLANT, new Material(stage2))
                        .put(TextureSlot.PARTICLE, new Material(stage2))
                        .put(TextureSlot.CROSS_EMISSIVE, new Material(emissiveTexture_stage2)),
                blockModels.modelOutput
        );

        ModelTemplate stage3Template = ExtendedModelTemplateBuilder.builder()
                .parent(this.mcLocation("item/generated"))
                .requiredTextureSlot(TextureSlot.PLANT)
                .requiredTextureSlot(TextureSlot.PARTICLE)
                .requiredTextureSlot(TextureSlot.CROSS_EMISSIVE)
                .element(e -> {
                    e.from(1, 0, 1);
                    e.to(15, 14, 15);

                    for (Direction dir : Direction.values()) {
                        e.face(dir, f -> {
                            if (dir == Direction.DOWN) f.cullface(Direction.DOWN);
                            f.uvs(1, 1, 15, 15);
                            f.texture(TextureSlot.PLANT);
                        });
                    }
                })
                .element(e -> {
                    e.from(1, 0, 1);
                    e.to(15, 14, 15);
                    e.shade(false);
                    e.lightEmission(15);

                    for (Direction dir : Direction.values()) {
                        e.face(dir, f -> f.texture(TextureSlot.CROSS_EMISSIVE));
                    }
                })
                .build();

        stage3Template.create(
                this.modLocation("block/" + name + "_stage3"),
                new TextureMapping()
                        .put(TextureSlot.PLANT, new Material(stage3))
                        .put(TextureSlot.PARTICLE, new Material(stage3))
                        .put(TextureSlot.CROSS_EMISSIVE, new Material(emissiveTexture_stage3)),
                blockModels.modelOutput
        );

        blockModels.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(block)
                        .with(PropertyDispatch.initial(BlockStateProperties.AGE_3)
                                .generate(age -> plainVariant(
                                        this.modLocation("block/" + name + "_stage" + age)
                                )))
        );

        crossTemplate.create(
                ModelLocationUtils.getModelLocation(item),
                new TextureMapping().put(TextureSlot.CROSS, new Material(stage0)),
                itemModels.modelOutput
        );

        blockModels.registerSimpleItemModel(block, stage0);
    }

    /*-------MOSSY STONE BRICK--------*/
    private void createMossyStoneBrickParent(BlockModelGenerators blockModels) {
        Identifier modelLocation = this.modLocation("block/stone_bricks");

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .parent(this.mcLocation("block/block"))
                .requiredTextureSlot(TextureSlot.TEXTURE)
                .requiredTextureSlot(TextureSlot.PARTICLE)

                .element(element -> {
                    element.from(0, 0, 0);
                    element.to(16, 16, 16);
                    for (Direction dir : Direction.values()) {
                        element.face(dir, face -> {
                            face.uvs(0, 0, 16, 16);
                            face.texture(TextureSlot.TEXTURE);
                        });
                    }
                })

                .element(element -> {
                    element.from(0, 0, 0);
                    element.to(16, 16, 16);
                    for (Direction dir : Direction.values()) {
                        element.face(dir, face -> {
                            face.uvs(0, 0, 16, 16);
                            face.texture(TextureSlot.ALL);
                        });
                    }
                });

        ModelTemplate modelTemplate = builder.build();

        modelTemplate.create(
                modelLocation,
                new TextureMapping()
                        .put(TextureSlot.TEXTURE, new Material(this.mcLocation("block/stone_bricks")))
                        .put(TextureSlot.PARTICLE, new Material(this.mcLocation("block/stone_bricks"))),
                blockModels.modelOutput
        );
    }

    private void createMossyStoneBrick(BlockModelGenerators blockModels, Block block) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier blockModelLocation = this.modLocation("block/" + name);

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .parent(this.modLocation("block/stone_bricks"))
                .requiredTextureSlot(TextureSlot.ALL);

        ModelTemplate modelTemplate = builder.build();

        modelTemplate.create(
                blockModelLocation,
                new TextureMapping()
                        .put(TextureSlot.ALL, new Material(this.modLocation("block/" + name))),
                blockModels.modelOutput
        );

        MultiVariant variant = plainVariant(blockModelLocation);

        blockModels.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(
                        block,
                        variant
                )
        );
    }

    private void createMossyStoneBrickEmissive(BlockModelGenerators blockModels, Block block) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier blockTexture = this.mcLocation("block/stone_bricks");
        Identifier blockModelLocation = this.modLocation("block/" + name);
        Identifier emissiveTexture = this.modLocation("block/open_eyeblossom_mossy_stone_brick_emissive");

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .parent(Identifier.parse("block/block"))
                .requiredTextureSlot(TextureSlot.TEXTURE)
                .requiredTextureSlot(TextureSlot.ALL)
                .requiredTextureSlot(TextureSlot.CROSS_EMISSIVE)
                .requiredTextureSlot(TextureSlot.PARTICLE);

        builder.element(element -> {
            element.from(0, 0, 0);
            element.to(16, 16, 16);

            element.face(Direction.DOWN, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.TEXTURE);
            });
            element.face(Direction.UP, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.TEXTURE);
            });
            element.face(Direction.NORTH, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.TEXTURE);
            });
            element.face(Direction.SOUTH, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.TEXTURE);
            });
            element.face(Direction.WEST, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.TEXTURE);
            });
            element.face(Direction.EAST, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.TEXTURE);
            });
        });

        builder.element(element -> {
            element.from(0, 0, 0);
            element.to(16, 16, 16);

            element.face(Direction.DOWN, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.ALL);
            });
            element.face(Direction.UP, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.ALL);
            });
            element.face(Direction.NORTH, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.ALL);
            });
            element.face(Direction.SOUTH, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.ALL);
            });
            element.face(Direction.WEST, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.ALL);
            });
            element.face(Direction.EAST, f -> {
                f.uvs(0, 0, 16, 16);
                f.texture(TextureSlot.ALL);
            });
        });

        builder.element(element -> {
            element.from(0, 0, 0);
            element.to(16, 16, 16);
            element.shade(false);
            element.lightEmission(15);

            element.face(Direction.NORTH, f -> f.texture(TextureSlot.CROSS_EMISSIVE));
            element.face(Direction.EAST, f -> f.texture(TextureSlot.CROSS_EMISSIVE));
            element.face(Direction.SOUTH, f -> f.texture(TextureSlot.CROSS_EMISSIVE));
            element.face(Direction.WEST, f -> f.texture(TextureSlot.CROSS_EMISSIVE));
            element.face(Direction.UP, f -> f.texture(TextureSlot.CROSS_EMISSIVE));
            element.face(Direction.DOWN, f -> f.texture(TextureSlot.CROSS_EMISSIVE));
        });

        ModelTemplate modelTemplate = builder.build();

        modelTemplate.create(
                blockModelLocation,
                new TextureMapping()
                        .put(TextureSlot.TEXTURE, new Material(blockTexture))
                        .put(TextureSlot.ALL, new Material(this.modLocation("block/" + name)))
                        .put(TextureSlot.CROSS_EMISSIVE, new Material(emissiveTexture))
                        .put(TextureSlot.PARTICLE, new Material(blockTexture)),
                blockModels.modelOutput
        );


        MultiVariant variant = plainVariant(blockModelLocation);

        blockModels.blockStateOutput.accept(
                MultiVariantGenerator.dispatch(
                        block,
                        variant
                )
        );
    }

    /*-------LARGE POT--------*/
    private void createLargePotCrossSingle(BlockModelGenerators blockModels, Block block) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier modelLocation = this.modLocation("block/" + "large_flower_pot_cross_single");
        Identifier textureDirt = this.mcLocation("block/dirt");
        Identifier texture = this.modLocation("block/" + name);

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .ambientOcclusion(false)
                .guiLight(UnbakedModel.GuiLight.FRONT)
                .requiredTextureSlot(TextureSlot.DIRT)
                .requiredTextureSlot(TextureSlot.PARTICLE)
                .requiredTextureSlot(TextureSlot.TEXTURE)

                .element(e -> {
                    e.from(2.6F, 6F, 8F).to(13.4F, 18F, 8F);
                    e.rotation(rot -> rot.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
                    e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
                    e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
                })

                .element(e -> {
                    e.from(8F, 6F, 2.6F).to(8F, 18F, 13.4F);
                    e.rotation(rot -> rot.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
                    e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
                    e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
                })

                .element(e -> {
                    e.from(0, 0, 4).to(16, 8, 5);
                    e.rotation(rot -> rot.origin(16, 0, 0).singleAxis(Direction.Axis.Y, 0));
                    e.face(Direction.NORTH, f -> f.uvs(16, 8, 0, 16).texture(TextureSlot.TEXTURE));
                    e.face(Direction.EAST, f -> f.uvs(16, 8, 15, 16).texture(TextureSlot.TEXTURE).cullface(Direction.EAST));
                    e.face(Direction.SOUTH, f -> f.uvs(0, 8, 16, 16).texture(TextureSlot.TEXTURE));
                    e.face(Direction.WEST, f -> f.uvs(1, 8, 0, 16).texture(TextureSlot.TEXTURE).cullface(Direction.WEST));
                    e.face(Direction.UP, f -> f.uvs(16, 9, 0, 8).texture(TextureSlot.TEXTURE));
                    e.face(Direction.DOWN, f -> f.uvs(0, 15, 16, 16).texture(TextureSlot.TEXTURE).cullface(Direction.DOWN));
                })

                .element(e -> {
                    e.from(0, 0, 5).to(1, 8, 11);
                    e.rotation(rot -> rot.origin(16, 0, 0).singleAxis(Direction.Axis.Y, 0));
                    e.face(Direction.EAST, f -> f.uvs(1, 0, 7, 8).texture(TextureSlot.TEXTURE));
                    e.face(Direction.WEST, f -> f.uvs(7, 0, 1, 8).texture(TextureSlot.TEXTURE).cullface(Direction.WEST));
                    e.face(Direction.UP, f -> f.uvs(7, 0, 1, 1).texture(TextureSlot.TEXTURE).rotation(Quadrant.R90));
                    e.face(Direction.DOWN, f -> f.uvs(1, 7, 7, 8).texture(TextureSlot.TEXTURE).rotation(Quadrant.R90).cullface(Direction.DOWN));
                })

                .element(e -> {
                    e.from(1, 0, 5).to(15, 6, 11);
                    e.face(Direction.UP, f -> f.uvs(1, 5, 15, 11).texture(TextureSlot.DIRT));
                    e.face(Direction.DOWN, f -> f.uvs(1, 9, 15, 15).texture(TextureSlot.TEXTURE).cullface(Direction.DOWN));
                })

                .element(e -> {
                    e.from(15, 0, 5).to(16, 8, 11);
                    e.face(Direction.EAST, f -> f.uvs(1, 0, 7, 8).texture(TextureSlot.TEXTURE).cullface(Direction.EAST));
                    e.face(Direction.WEST, f -> f.uvs(7, 0, 1, 8).texture(TextureSlot.TEXTURE));
                    e.face(Direction.UP, f -> f.uvs(7, 1, 1, 0).texture(TextureSlot.TEXTURE).rotation(Quadrant.R90));
                    e.face(Direction.DOWN, f -> f.uvs(1, 8, 7, 7).texture(TextureSlot.TEXTURE).rotation(Quadrant.R90).cullface(Direction.DOWN));
                })

                .element(e -> {
                    e.from(0, 0, 11).to(16, 8, 12);
                    e.rotation(rot -> rot.origin(0, 0, 16).singleAxis(Direction.Axis.Y, 0));
                    e.face(Direction.NORTH, f -> f.uvs(16, 8, 0, 16).texture(TextureSlot.TEXTURE));
                    e.face(Direction.EAST, f -> f.uvs(1, 8, 0, 16).texture(TextureSlot.TEXTURE).cullface(Direction.EAST));
                    e.face(Direction.SOUTH, f -> f.uvs(0, 8, 16, 16).texture(TextureSlot.TEXTURE));
                    e.face(Direction.WEST, f -> f.uvs(16, 8, 15, 16).texture(TextureSlot.TEXTURE).cullface(Direction.WEST));
                    e.face(Direction.UP, f -> f.uvs(0, 8, 16, 9).texture(TextureSlot.TEXTURE));
                    e.face(Direction.DOWN, f -> f.uvs(16, 16, 0, 15).texture(TextureSlot.TEXTURE).cullface(Direction.DOWN));
                })

                .transform(ItemDisplayContext.GUI, t -> t.rotation(34.75F, -43F, 0F).translation(0, 1, 0).scale(0.75F, 0.75F, 0.75F))
                .transform(ItemDisplayContext.GROUND, t -> t.translation(0, 3.5F, 0).scale(0.6F, 0.6F, 0.6F))
                .transform(ItemDisplayContext.FIXED, t -> t.translation(0, 0, -3.25F))
                .transform(ItemDisplayContext.HEAD, t -> t.translation(0, 10.5F, 0))
                .transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND, t -> t.rotation(70, 0, 0).translation(-6, 4.5F, 3.5F))
                .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND, t -> t.rotation(70, 0, 0).translation(-6, 4.5F, 3.5F))
                .transform(ItemDisplayContext.FIRST_PERSON_RIGHT_HAND, t -> t.translation(-9, 1, 0))
                .transform(ItemDisplayContext.FIRST_PERSON_LEFT_HAND, t -> t.translation(-9, 1, 0));

        ModelTemplate modelTemplate = builder.build();

        modelTemplate.create(
                modelLocation,
                new TextureMapping()
                        .put(TextureSlot.DIRT, new Material(textureDirt))
                        .put(TextureSlot.PARTICLE, new Material(texture))
                        .put(TextureSlot.TEXTURE, new Material(texture)),
                blockModels.modelOutput
        );
    }

    private void createLargePotCrossTall(BlockModelGenerators blockModels, Block block) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier modelLocation = this.modLocation("block/" + "large_flower_pot_cross_tall");
        Identifier textureDirt = this.mcLocation("block/dirt");
        Identifier texturePlantBottom = this.modLocation("block/" + name);
        Identifier texturePlantTop = this.modLocation("block/" + name);
        Identifier texturePot = this.modLocation("block/" + name);

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .ambientOcclusion(false)
                .guiLight(UnbakedModel.GuiLight.FRONT)
                .requiredTextureSlot(TextureSlot.PARTICLE)
                .requiredTextureSlot(TextureSlot.TEXTURE)
                .requiredTextureSlot(TextureSlot.DIRT)
                .requiredTextureSlot(TextureSlot.TOP)
                .requiredTextureSlot(TextureSlot.BOTTOM);

        builder.element(e -> {
            e.from(0f, 6f, 8f).to(16f, 19f, 8f);
            e.shade(false);
            e.rotation(r -> r.origin(8, 19, 8).singleAxis(Direction.Axis.Y, 45));
            e.face(Direction.NORTH, f -> f.texture(TextureSlot.BOTTOM).uvs(0, 0, 16, 16));
            e.face(Direction.SOUTH, f -> f.texture(TextureSlot.BOTTOM).uvs(0, 0, 16, 16));
        });

        builder.element(e -> {
            e.from(0f, 19f, 8f).to(16f, 32f, 8f);
            e.shade(false);
            e.rotation(r -> r.origin(8, 19, 8).singleAxis(Direction.Axis.Y, 45));
            e.face(Direction.NORTH, f -> f.texture(TextureSlot.TOP).uvs(0, 0, 16, 16));
            e.face(Direction.SOUTH, f -> f.texture(TextureSlot.TOP).uvs(0, 0, 16, 16));
        });

        builder.element(e -> {
            e.from(0f, 6f, 8f).to(16f, 19f, 8f);
            e.shade(false);
            e.rotation(r -> r.origin(8, 19, 8).singleAxis(Direction.Axis.Y, -45));
            e.face(Direction.NORTH, f -> f.texture(TextureSlot.BOTTOM).uvs(0, 0, 16, 16));
            e.face(Direction.SOUTH, f -> f.texture(TextureSlot.BOTTOM).uvs(0, 0, 16, 16));
        });

        builder.element(e -> {
            e.from(0f, 19f, 8f).to(16f, 32f, 8f);
            e.shade(false);
            e.rotation(r -> r.origin(8, 19, 8).singleAxis(Direction.Axis.Y, -45));
            e.face(Direction.NORTH, f -> f.texture(TextureSlot.TOP).uvs(0, 0, 16, 16));
            e.face(Direction.SOUTH, f -> f.texture(TextureSlot.TOP).uvs(0, 0, 16, 16));
        });

        builder.element(e -> {
            e.from(0f, 0f, 4f).to(16f, 8f, 5f);
            e.rotation(r -> r.origin(16, 0, 0).singleAxis(Direction.Axis.Y, 0));
            e.face(Direction.NORTH, f -> f.texture(TextureSlot.TEXTURE).uvs(0, 8, 16, 16));
            e.face(Direction.EAST, f -> f.texture(TextureSlot.TEXTURE).uvs(16, 8, 15, 16).cullface(Direction.EAST));
            e.face(Direction.SOUTH, f -> f.texture(TextureSlot.TEXTURE).uvs(16, 8, 0, 16));
            e.face(Direction.WEST, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 8, 0, 16).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.texture(TextureSlot.TEXTURE).uvs(16, 9, 0, 8));
            e.face(Direction.DOWN, f -> f.texture(TextureSlot.TEXTURE).uvs(0, 15, 16, 16).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(0f, 0f, 5f).to(1f, 8f, 11f);
            e.rotation(r -> r.origin(16, 0, 0).singleAxis(Direction.Axis.Y, 0));
            e.face(Direction.EAST, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 0, 7, 8));
            e.face(Direction.WEST, f -> f.texture(TextureSlot.TEXTURE).uvs(7, 0, 1, 8).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.texture(TextureSlot.TEXTURE).uvs(7, 0, 1, 1).rotation(Quadrant.R90));
            e.face(Direction.DOWN, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 7, 7, 8).rotation(Quadrant.R90).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(1f, 0f, 5f).to(15f, 6f, 11f);
            e.face(Direction.UP, f -> f.texture(TextureSlot.DIRT).uvs(1, 5, 15, 11));
            e.face(Direction.DOWN, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 9, 15, 15).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(0f, 0f, 11f).to(16f, 8f, 12f);
            e.rotation(r -> r.origin(0, 0, 16).singleAxis(Direction.Axis.Y, 0));
            e.face(Direction.NORTH, f -> f.texture(TextureSlot.TEXTURE).uvs(16, 8, 0, 16));
            e.face(Direction.EAST, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 8, 0, 16).cullface(Direction.EAST));
            e.face(Direction.SOUTH, f -> f.texture(TextureSlot.TEXTURE).uvs(0, 8, 16, 16));
            e.face(Direction.WEST, f -> f.texture(TextureSlot.TEXTURE).uvs(16, 8, 15, 16).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.texture(TextureSlot.TEXTURE).uvs(0, 8, 16, 9));
            e.face(Direction.DOWN, f -> f.texture(TextureSlot.TEXTURE).uvs(16, 16, 0, 15).cullface(Direction.DOWN));
        });

        builder.element(e -> {
                    e.from(15f, 0f, 5f).to(16f, 8f, 11f);
                    e.face(Direction.EAST, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 0, 7, 8).cullface(Direction.EAST));
                    e.face(Direction.WEST, f -> f.texture(TextureSlot.TEXTURE).uvs(7, 0, 1, 8));
                    e.face(Direction.UP, f -> f.texture(TextureSlot.TEXTURE).uvs(7, 1, 1, 0).rotation(Quadrant.R90));
                    e.face(Direction.DOWN, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 8, 7, 7).rotation(Quadrant.R90).cullface(Direction.DOWN));
                })

                .transform(ItemDisplayContext.GUI, t -> t.rotation(34.75F, -43F, 0F).translation(0, 1, 0).scale(0.75F, 0.75F, 0.75F))
                .transform(ItemDisplayContext.GROUND, t -> t.translation(0, 3.5F, 0).scale(0.6F, 0.6F, 0.6F))
                .transform(ItemDisplayContext.FIXED, t -> t.translation(0, 0, -3.25F))
                .transform(ItemDisplayContext.HEAD, t -> t.translation(0, 10.5F, 0))
                .transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND, t -> t.rotation(70, 0, 0).translation(-6, 4.5F, 3.5F))
                .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND, t -> t.rotation(70, 0, 0).translation(-6, 4.5F, 3.5F))
                .transform(ItemDisplayContext.FIRST_PERSON_RIGHT_HAND, t -> t.translation(-9, 1, 0))
                .transform(ItemDisplayContext.FIRST_PERSON_LEFT_HAND, t -> t.translation(-9, 1, 0));

        ModelTemplate template = builder.build();

        template.create(
                modelLocation,
                new TextureMapping()
                        .put(TextureSlot.TEXTURE, new Material(texturePot))
                        .put(TextureSlot.DIRT, new Material(textureDirt))
                        .put(TextureSlot.PARTICLE, new Material(texturePot))
                        .put(TextureSlot.BOTTOM, new Material(texturePlantBottom))
                        .put(TextureSlot.TOP, new Material(texturePlantTop)),
                blockModels.modelOutput
        );
    }

    private void createLargePot(BlockModelGenerators blockModels, Block block) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier modelLocation = this.modLocation("block/" + name);
        Identifier texture1 = this.mcLocation("block/dirt");
        Identifier texture2 = this.modLocation("block/" + name);

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .ambientOcclusion(false)
                .guiLight(UnbakedModel.GuiLight.FRONT)
                .requiredTextureSlot(TextureSlot.DIRT)
                .requiredTextureSlot(TextureSlot.TEXTURE)
                .requiredTextureSlot(TextureSlot.PARTICLE)

                .element(e -> {
                    e.from(1, 0, 5).to(15, 6, 11);
                    e.face(Direction.UP, f -> f.uvs(1, 5, 15, 11).texture(TextureSlot.DIRT));
                    e.face(Direction.DOWN, f -> f.uvs(1, 9, 15, 15).texture(TextureSlot.TEXTURE).cullface(Direction.DOWN));
                })

                .element(e -> {
                    e.from(0, 0, 11).to(16, 8, 12)
                            .rotation(rot -> rot.origin(0, 0, 16).singleAxis(Direction.Axis.Y, 0));
                    e.face(Direction.NORTH, f -> f.uvs(16, 8, 0, 16).texture(TextureSlot.TEXTURE));
                    e.face(Direction.EAST, f -> f.uvs(1, 8, 0, 16).texture(TextureSlot.TEXTURE).cullface(Direction.EAST));
                    e.face(Direction.SOUTH, f -> f.uvs(0, 8, 16, 16).texture(TextureSlot.TEXTURE));
                    e.face(Direction.WEST, f -> f.uvs(16, 8, 15, 16).texture(TextureSlot.TEXTURE).cullface(Direction.WEST));
                    e.face(Direction.UP, f -> f.uvs(0, 8, 16, 9).texture(TextureSlot.TEXTURE));
                    e.face(Direction.DOWN, f -> f.uvs(16, 16, 0, 15).texture(TextureSlot.TEXTURE).cullface(Direction.DOWN));
                })

                .element(e -> {
                    e.from(0, 0, 4).to(16, 8, 5)
                            .rotation(rot -> rot.origin(16, 0, 0).singleAxis(Direction.Axis.Y, 0));
                    e.face(Direction.NORTH, f -> f.uvs(0, 8, 16, 16).texture(TextureSlot.TEXTURE));
                    e.face(Direction.EAST, f -> f.uvs(16, 8, 15, 16).texture(TextureSlot.TEXTURE).cullface(Direction.EAST));
                    e.face(Direction.SOUTH, f -> f.uvs(16, 8, 0, 16).texture(TextureSlot.TEXTURE));
                    e.face(Direction.WEST, f -> f.uvs(1, 8, 0, 16).texture(TextureSlot.TEXTURE).cullface(Direction.WEST));
                    e.face(Direction.UP, f -> f.uvs(16, 9, 0, 8).texture(TextureSlot.TEXTURE));
                    e.face(Direction.DOWN, f -> f.uvs(0, 15, 16, 16).texture(TextureSlot.TEXTURE).cullface(Direction.DOWN));
                })

                .element(e -> {
                    e.from(15, 0, 5).to(16, 8, 11);
                    e.face(Direction.EAST, f -> f.uvs(1, 0, 7, 8).texture(TextureSlot.TEXTURE).cullface(Direction.EAST));
                    e.face(Direction.WEST, f -> f.uvs(7, 0, 1, 8).texture(TextureSlot.TEXTURE));
                    e.face(Direction.UP, f -> f.uvs(7, 1, 1, 0).texture(TextureSlot.TEXTURE).rotation(Quadrant.R90));
                    e.face(Direction.DOWN, f -> f.uvs(1, 8, 7, 7).texture(TextureSlot.TEXTURE).rotation(Quadrant.R90).cullface(Direction.DOWN));
                })

                .element(e -> {
                    e.from(0, 0, 5).to(1, 8, 11)
                            .rotation(rot -> rot.origin(16, 0, 0).singleAxis(Direction.Axis.Y, 0));
                    e.face(Direction.EAST, f -> f.uvs(1, 0, 7, 8).texture(TextureSlot.TEXTURE));
                    e.face(Direction.WEST, f -> f.uvs(7, 0, 1, 8).texture(TextureSlot.TEXTURE).cullface(Direction.WEST));
                    e.face(Direction.UP, f -> f.uvs(7, 0, 1, 1).texture(TextureSlot.TEXTURE).rotation(Quadrant.R90));
                    e.face(Direction.DOWN, f -> f.uvs(1, 7, 7, 8).texture(TextureSlot.TEXTURE).rotation(Quadrant.R90).cullface(Direction.DOWN));
                })

                .transform(ItemDisplayContext.GUI, t -> t.rotation(34.75F, -43, 0).translation(0, 1, 0).scale(0.75F, 0.75F, 0.75F))
                .transform(ItemDisplayContext.GROUND, t -> t.translation(0, 3.5F, 0).scale(0.6F, 0.6F, 0.6F))
                .transform(ItemDisplayContext.FIXED, t -> t.translation(0, 0, -3.25F))
                .transform(ItemDisplayContext.HEAD, t -> t.translation(0, 10.5F, 0))
                .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND, t -> t.rotation(70, 0, 0).translation(-6, 4.5F, 3.5F))
                .transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND, t -> t.rotation(70, 0, 0).translation(-6, 4.5F, 3.5F))
                .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND, t -> t.translation(-9, 1, 0))
                .transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND, t -> t.translation(-9, 1, 0));

        ModelTemplate modelTemplate = builder.build();

        modelTemplate.create(
                modelLocation,
                new TextureMapping()
                        .put(TextureSlot.DIRT, new Material(texture1))
                        .put(TextureSlot.TEXTURE, new Material(texture2))
                        .put(TextureSlot.PARTICLE, new Material(texture2)),
                blockModels.modelOutput
        );

        MultiVariant variant = plainVariant(modelLocation);

        blockModels.blockStateOutput.accept(
                MultiPartGenerator.multiPart(block)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH),
                                variant)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.EAST, true),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.SOUTH, true),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.WEST, true),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
        );
    }

    private void createLargePotVariants(BlockModelGenerators blockModels, Block block, Block plantBlock) {
        String plantName = BuiltInRegistries.BLOCK.getKey(plantBlock).getPath();
        Identifier plantModelLocation = this.mcLocation("block/" + plantName);

        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier modelLocation = this.modLocation("block/" + name);

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .parent(this.modLocation("block/large_flower_pot_cross_single"))
                .requiredTextureSlot(TextureSlot.PLANT);

        ModelTemplate modelTemplate = builder.build();

        modelTemplate.create(
                modelLocation,
                new TextureMapping().put(TextureSlot.PLANT, new Material(plantModelLocation)),
                blockModels.modelOutput
        );

        MultiVariant variant = plainVariant(modelLocation);

        blockModels.blockStateOutput.accept(
                MultiPartGenerator.multiPart(block)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH),
                                variant)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
        );
    }

    private void createLargePotEmissive(BlockModelGenerators blockModels, Block block, Block plantBlock) {
        String blockName = BuiltInRegistries.BLOCK.getKey(block).getPath();
        String plantName = BuiltInRegistries.BLOCK.getKey(plantBlock).getPath();

        Identifier potTexture = this.modLocation("block/" + "large_pot");
        Identifier plantTexture = this.mcLocation("block/" + plantName);
        Identifier emissionTexture = this.mcLocation("block/" + plantName + "_emissive");
        Identifier dirtTexture = this.mcLocation("block/dirt");

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .ambientOcclusion(false)
                .requiredTextureSlot(TextureSlot.TEXTURE)
                .requiredTextureSlot(TextureSlot.PARTICLE)
                .requiredTextureSlot(TextureSlot.PLANT)
                .requiredTextureSlot(TextureSlot.CROSS_EMISSIVE)
                .requiredTextureSlot(TextureSlot.DIRT);

        builder.element(e -> {
            e.from(2.6f, 6f, 8f).to(13.4f, 18f, 8f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.shade(false);
            e.lightEmission(15);
            e.face(Direction.NORTH, f -> f.texture(TextureSlot.CROSS_EMISSIVE).uvs(0, 0, 16, 16));
            e.face(Direction.SOUTH, f -> f.texture(TextureSlot.CROSS_EMISSIVE).uvs(0, 0, 16, 16));
        });

        builder.element(e -> {
            e.from(8f, 6f, 2.6f).to(8f, 18f, 13.4f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.shade(false);
            e.lightEmission(15);
            e.face(Direction.EAST, f -> f.texture(TextureSlot.CROSS_EMISSIVE).uvs(0, 0, 16, 16));
            e.face(Direction.WEST, f -> f.texture(TextureSlot.CROSS_EMISSIVE).uvs(0, 0, 16, 16));
        });

        builder.element(e -> {
            e.from(2.6f, 6f, 8f).to(13.4f, 18f, 8f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.face(Direction.NORTH, f -> f.texture(TextureSlot.PLANT).uvs(0, 0, 16, 16));
            e.face(Direction.SOUTH, f -> f.texture(TextureSlot.PLANT).uvs(0, 0, 16, 16));
        });

        builder.element(e -> {
            e.from(8f, 6f, 2.6f).to(8f, 18f, 13.4f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.face(Direction.EAST, f -> f.texture(TextureSlot.PLANT).uvs(0, 0, 16, 16));
            e.face(Direction.WEST, f -> f.texture(TextureSlot.PLANT).uvs(0, 0, 16, 16));
        });

        builder.element(e -> {
            e.from(0f, 0f, 4f).to(16f, 8f, 5f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 0).origin(16, 0, 0));
            e.face(Direction.NORTH, f -> f.texture(TextureSlot.TEXTURE).uvs(0, 8, 16, 16));
            e.face(Direction.EAST, f -> f.texture(TextureSlot.TEXTURE).uvs(16, 8, 15, 16).cullface(Direction.EAST));
            e.face(Direction.SOUTH, f -> f.texture(TextureSlot.TEXTURE).uvs(16, 8, 0, 16));
            e.face(Direction.WEST, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 8, 0, 16).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.texture(TextureSlot.TEXTURE).uvs(16, 9, 0, 8));
            e.face(Direction.DOWN, f -> f.texture(TextureSlot.TEXTURE).uvs(0, 15, 16, 16).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(0f, 0f, 5f).to(1f, 8f, 11f);
            e.face(Direction.EAST, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 0, 7, 8));
            e.face(Direction.WEST, f -> f.texture(TextureSlot.TEXTURE).uvs(7, 0, 1, 8).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.texture(TextureSlot.TEXTURE).uvs(7, 0, 1, 1).rotation(Quadrant.R90));
            e.face(Direction.DOWN, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 7, 7, 8).rotation(Quadrant.R90).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(1f, 0f, 5f).to(15f, 6f, 11f);
            e.face(Direction.UP, f -> f.texture(TextureSlot.DIRT).uvs(1, 5, 15, 11));
            e.face(Direction.DOWN, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 9, 15, 15).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(0f, 0f, 11f).to(16f, 8f, 12f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 0).origin(0, 0, 16));
            e.face(Direction.NORTH, f -> f.texture(TextureSlot.TEXTURE).uvs(16, 8, 0, 16));
            e.face(Direction.EAST, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 8, 0, 16).cullface(Direction.EAST));
            e.face(Direction.SOUTH, f -> f.texture(TextureSlot.TEXTURE).uvs(0, 8, 16, 16));
            e.face(Direction.WEST, f -> f.texture(TextureSlot.TEXTURE).uvs(16, 8, 15, 16).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.texture(TextureSlot.TEXTURE).uvs(0, 8, 16, 9));
            e.face(Direction.DOWN, f -> f.texture(TextureSlot.TEXTURE).uvs(16, 16, 0, 15).cullface(Direction.DOWN));
        });

        builder.element(e -> {
                    e.from(15f, 0f, 5f).to(16f, 8f, 11f);
                    e.face(Direction.EAST, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 0, 7, 8).cullface(Direction.EAST));
                    e.face(Direction.WEST, f -> f.texture(TextureSlot.TEXTURE).uvs(7, 0, 1, 8));
                    e.face(Direction.UP, f -> f.texture(TextureSlot.TEXTURE).uvs(7, 1, 1, 0).rotation(Quadrant.R90));
                    e.face(Direction.DOWN, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 8, 7, 7).rotation(Quadrant.R90).cullface(Direction.DOWN));
                })
                .transform(ItemDisplayContext.GUI, t -> t.rotation(34.75F, -43, 0).translation(0, 1, 0).scale(0.75F, 0.75F, 0.75F))
                .transform(ItemDisplayContext.GROUND, t -> t.translation(0, 3.5F, 0).scale(0.6F, 0.6F, 0.6F))
                .transform(ItemDisplayContext.FIXED, t -> t.translation(0, 0, -3.25F))
                .transform(ItemDisplayContext.HEAD, t -> t.translation(0, 10.5F, 0))
                .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND, t -> t.rotation(70, 0, 0).translation(-6, 4.5F, 3.5F))
                .transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND, t -> t.rotation(70, 0, 0).translation(-6, 4.5F, 3.5F))
                .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND, t -> t.translation(-9, 1, 0))
                .transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND, t -> t.translation(-9, 1, 0));


        ModelTemplate template = builder.build();

        template.create(
                this.modLocation("block/" + blockName),
                new TextureMapping()
                        .put(TextureSlot.TEXTURE, new Material(potTexture))
                        .put(TextureSlot.DIRT, new Material(dirtTexture))
                        .put(TextureSlot.PARTICLE, new Material(potTexture))
                        .put(TextureSlot.PLANT, new Material(plantTexture))
                        .put(TextureSlot.CROSS_EMISSIVE, new Material(emissionTexture)),
                blockModels.modelOutput
        );

        MultiVariant variant = plainVariant(this.modLocation("block/" + blockName));

        blockModels.blockStateOutput.accept(
                MultiPartGenerator.multiPart(block)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH),
                                variant)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
        );
    }

    private void createLargePotFromString(BlockModelGenerators blockModels, Block block, String plantName) {
        Identifier plantModelLocation = this.mcLocation("block/" + plantName);

        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier modelLocation = this.modLocation("block/" + name);

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .parent(this.modLocation("block/large_flower_pot_cross_single"))
                .requiredTextureSlot(TextureSlot.PLANT);

        ModelTemplate modelTemplate = builder.build();

        modelTemplate.create(
                modelLocation,
                new TextureMapping().put(TextureSlot.PLANT, new Material(plantModelLocation)),
                blockModels.modelOutput
        );

        MultiVariant variant = plainVariant(modelLocation);

        blockModels.blockStateOutput.accept(
                MultiPartGenerator.multiPart(block)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH),
                                variant)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
        );
    }

    private void createLargePotTall(BlockModelGenerators blockModels, Block block, String plantTop, String plantBottom) {
        Identifier plantModelLocationBottom = this.mcLocation("block/" + plantBottom);
        Identifier plantModelLocationTop = this.mcLocation("block/" + plantTop);

        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier modelLocation = this.modLocation("block/" + name);

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .parent(this.modLocation("block/large_flower_pot_cross_tall"))
                .requiredTextureSlot(TextureSlot.TOP)
                .requiredTextureSlot(TextureSlot.BOTTOM);

        ModelTemplate modelTemplate = builder.build();

        modelTemplate.create(
                modelLocation,
                new TextureMapping()
                        .put(TextureSlot.TOP, new Material(plantModelLocationTop))
                        .put(TextureSlot.BOTTOM, new Material(plantModelLocationBottom)),
                blockModels.modelOutput
        );

        MultiVariant variant = plainVariant(modelLocation);

        blockModels.blockStateOutput.accept(
                MultiPartGenerator.multiPart(block)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH),
                                variant)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
        );
    }

    private void createLargePotSunflower(BlockModelGenerators blockModels, Block potBlock) {
        String potName = BuiltInRegistries.BLOCK.getKey(potBlock).getPath();
        Identifier modelLocation = this.modLocation("block/" + potName);

        Identifier textPot = this.modLocation("block/large_pot");
        Identifier texDirt = this.mcLocation("block/dirt");
        Identifier texBack = this.mcLocation("block/sunflower_back");
        Identifier texFront = this.mcLocation("block/sunflower_front");
        Identifier texBottom = this.mcLocation("block/sunflower_bottom");
        Identifier texTop = this.mcLocation("block/sunflower_top");

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .ambientOcclusion(false)
                .requiredTextureSlot(TextureSlot.PARTICLE)
                .requiredTextureSlot(TextureSlot.PLANT)
                .requiredTextureSlot(TextureSlot.DIRT)
                .requiredTextureSlot(TextureSlot.BACK)
                .requiredTextureSlot(TextureSlot.FRONT)
                .requiredTextureSlot(TextureSlot.BOTTOM)
                .requiredTextureSlot(TextureSlot.TOP);

        int[] angles = {45, -45};
        for (int angle : angles) {

            builder.element(e -> {
                e.from(0, 19, 8).to(16, 32, 8);
                e.shade(false);
                e.rotation(rot -> rot.origin(8, 19, 8).singleAxis(Direction.Axis.Y, angle));
                e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.TOP));
                e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.TOP));
            });

            builder.element(e -> {
                e.from(0, 6, 8).to(16, 19, 8);
                e.shade(false);
                e.rotation(rot -> rot.origin(8, 19, 8).singleAxis(Direction.Axis.Y, angle));
                e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.BOTTOM));
                e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.BOTTOM));
            });
        }

        builder.element(e -> {
            e.from(0, 0, 4).to(16, 8, 5);
            e.face(Direction.NORTH, f -> f.uvs(0, 8, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.EAST, f -> f.uvs(16, 8, 15, 16).texture(TextureSlot.PLANT).cullface(Direction.EAST));
            e.face(Direction.SOUTH, f -> f.uvs(16, 8, 0, 16).texture(TextureSlot.PLANT));
            e.face(Direction.WEST, f -> f.uvs(1, 8, 0, 16).texture(TextureSlot.PLANT).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.uvs(16, 9, 0, 8).texture(TextureSlot.PLANT));
            e.face(Direction.DOWN, f -> f.uvs(0, 15, 16, 16).texture(TextureSlot.PLANT).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(0, 0, 5).to(1, 8, 11);
            e.face(Direction.EAST, f -> f.uvs(1, 0, 7, 8).texture(TextureSlot.PLANT));
            e.face(Direction.WEST, f -> f.uvs(7, 0, 1, 8).texture(TextureSlot.PLANT).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.uvs(7, 0, 1, 1).rotation(Quadrant.R90).texture(TextureSlot.PLANT));
            e.face(Direction.DOWN, f -> f.uvs(1, 7, 7, 8).rotation(Quadrant.R90).texture(TextureSlot.PLANT).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(1, 0, 5).to(15, 6, 11);
            e.face(Direction.UP, f -> f.uvs(1, 5, 15, 11).texture(TextureSlot.DIRT));
            e.face(Direction.DOWN, f -> f.uvs(1, 9, 15, 15).texture(TextureSlot.PLANT).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(0, 0, 11).to(16, 8, 12);
            e.face(Direction.NORTH, f -> f.uvs(16, 8, 0, 16).texture(TextureSlot.PLANT));
            e.face(Direction.EAST, f -> f.uvs(1, 8, 0, 16).texture(TextureSlot.PLANT).cullface(Direction.EAST));
            e.face(Direction.SOUTH, f -> f.uvs(0, 8, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.WEST, f -> f.uvs(16, 8, 15, 16).texture(TextureSlot.PLANT).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.uvs(0, 8, 16, 9).texture(TextureSlot.PLANT));
            e.face(Direction.DOWN, f -> f.uvs(16, 16, 0, 15).texture(TextureSlot.PLANT).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(15, 0, 5).to(16, 8, 11);
            e.face(Direction.EAST, f -> f.uvs(1, 0, 7, 8).texture(TextureSlot.PLANT).cullface(Direction.EAST));
            e.face(Direction.WEST, f -> f.uvs(7, 0, 1, 8).texture(TextureSlot.PLANT));
            e.face(Direction.UP, f -> f.uvs(7, 1, 1, 0).rotation(Quadrant.R90).texture(TextureSlot.PLANT));
            e.face(Direction.DOWN, f -> f.uvs(1, 8, 7, 7).rotation(Quadrant.R90).texture(TextureSlot.PLANT).cullface(Direction.DOWN));
        });

        builder.element(e -> {
                    e.from(4.75f, 22.75f, 8.5f).to(11.75f, 30.75f, 8.5f);
                    e.shade(false);
                    e.rotation(rot -> rot.origin(8, 32, 8).singleAxis(Direction.Axis.X, 22.5f));
                    e.face(Direction.NORTH, f -> f.uvs(4, 4, 12, 12).rotation(Quadrant.R180).texture(TextureSlot.FRONT));
                    e.face(Direction.SOUTH, f -> f.uvs(4, 4, 12, 12).texture(TextureSlot.BACK));
                })
                .transform(ItemDisplayContext.GUI, t -> t.rotation(34.75F, -43F, 0F).translation(0, 1, 0).scale(0.75F, 0.75F, 0.75F))
                .transform(ItemDisplayContext.GROUND, t -> t.translation(0, 3.5F, 0).scale(0.6F, 0.6F, 0.6F))
                .transform(ItemDisplayContext.FIXED, t -> t.translation(0, 0, -3.25F))
                .transform(ItemDisplayContext.HEAD, t -> t.translation(0, 10.5F, 0))
                .transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND, t -> t.rotation(70, 0, 0).translation(-6, 4.5F, 3.5F))
                .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND, t -> t.rotation(70, 0, 0).translation(-6, 4.5F, 3.5F))
                .transform(ItemDisplayContext.FIRST_PERSON_RIGHT_HAND, t -> t.translation(-9, 1, 0))
                .transform(ItemDisplayContext.FIRST_PERSON_LEFT_HAND, t -> t.translation(-9, 1, 0));

        ModelTemplate template = builder.build();

        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.PLANT, new Material(textPot))
                .put(TextureSlot.DIRT, new Material(texDirt))
                .put(TextureSlot.PARTICLE, new Material(textPot))
                .put(TextureSlot.BACK, new Material(texBack))
                .put(TextureSlot.FRONT, new Material(texFront))
                .put(TextureSlot.BOTTOM, new Material(texBottom))
                .put(TextureSlot.TOP, new Material(texTop));

        template.create(modelLocation, mapping, blockModels.modelOutput);

        MultiVariant variant = plainVariant(modelLocation);

        blockModels.blockStateOutput.accept(
                MultiPartGenerator.multiPart(potBlock)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH),
                                variant)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
        );
    }

    /*-------LARGE DOUBLE POT--------*/
    private void createLargePotCrossDouble(BlockModelGenerators blockModels, Block block) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier modelLocation = this.modLocation("block/large_flower_pot_cross_double");
        Identifier textureDirt = this.mcLocation("block/dirt");
        Identifier texturePlant = this.modLocation("block/" + name);

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .ambientOcclusion(false)
                .guiLight(UnbakedModel.GuiLight.FRONT)
                .requiredTextureSlot(TextureSlot.DIRT)
                .requiredTextureSlot(TextureSlot.PARTICLE)
                .requiredTextureSlot(TextureSlot.PLANT);

        builder.element(e -> {
            e.from(9.5F, 6F, 4.1F).to(9.5F, 18F, 14.9F);
            e.rotation(r -> r.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
        });

        builder.element(e -> {
            e.from(4.1F, 6F, 9.5F).to(14.9F, 18F, 9.5F);
            e.rotation(r -> r.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
        });

        builder.element(e -> {
            e.from(6.5F, 6F, 1.1F).to(6.5F, 18F, 11.9F);
            e.rotation(r -> r.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
        });

        builder.element(e -> {
            e.from(1.1F, 6F, 6.5F).to(11.9F, 18F, 6.5F);
            e.rotation(r -> r.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
        });

        builder.element(e -> {
            e.from(0F, 0F, 4F).to(16F, 8F, 5F);
            e.rotation(r -> r.origin(16, 0, 0).singleAxis(Direction.Axis.Y, 0));
            e.face(Direction.NORTH, f -> f.uvs(0, 8, 16, 16).texture(TextureSlot.PARTICLE));
            e.face(Direction.EAST, f -> f.uvs(16, 8, 15, 16).texture(TextureSlot.PARTICLE).cullface(Direction.EAST));
            e.face(Direction.SOUTH, f -> f.uvs(16, 8, 0, 16).texture(TextureSlot.PARTICLE));
            e.face(Direction.WEST, f -> f.uvs(1, 8, 0, 16).texture(TextureSlot.PARTICLE).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.uvs(16, 9, 0, 8).texture(TextureSlot.PARTICLE));
            e.face(Direction.DOWN, f -> f.uvs(0, 15, 16, 16).texture(TextureSlot.PARTICLE).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(0F, 0F, 5F).to(1F, 8F, 11F);
            e.rotation(r -> r.origin(16, 0, 0).singleAxis(Direction.Axis.Y, 0));
            e.face(Direction.EAST, f -> f.uvs(1, 0, 7, 8).texture(TextureSlot.PARTICLE));
            e.face(Direction.WEST, f -> f.uvs(7, 0, 1, 8).texture(TextureSlot.PARTICLE).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.uvs(7, 0, 1, 1).texture(TextureSlot.PARTICLE).rotation(Quadrant.R90));
            e.face(Direction.DOWN, f -> f.uvs(1, 7, 7, 8).texture(TextureSlot.PARTICLE).rotation(Quadrant.R90).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(1F, 0F, 5F).to(15F, 6F, 11F);
            e.face(Direction.UP, f -> f.uvs(1, 5, 15, 11).texture(TextureSlot.DIRT));
            e.face(Direction.DOWN, f -> f.uvs(1, 9, 15, 15).texture(TextureSlot.PARTICLE).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(0F, 0F, 11F).to(16F, 8F, 12F);
            e.rotation(r -> r.origin(0, 0, 16).singleAxis(Direction.Axis.Y, 0));
            e.face(Direction.NORTH, f -> f.uvs(16, 8, 0, 16).texture(TextureSlot.PARTICLE));
            e.face(Direction.EAST, f -> f.uvs(1, 8, 0, 16).texture(TextureSlot.PARTICLE).cullface(Direction.EAST));
            e.face(Direction.SOUTH, f -> f.uvs(0, 8, 16, 16).texture(TextureSlot.PARTICLE));
            e.face(Direction.WEST, f -> f.uvs(16, 8, 15, 16).texture(TextureSlot.PARTICLE).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.uvs(0, 8, 16, 9).texture(TextureSlot.PARTICLE));
            e.face(Direction.DOWN, f -> f.uvs(16, 16, 0, 15).texture(TextureSlot.PARTICLE).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(15F, 0F, 5F).to(16F, 8F, 11F);
            e.face(Direction.EAST, f -> f.uvs(1, 0, 7, 8).texture(TextureSlot.PARTICLE).cullface(Direction.EAST));
            e.face(Direction.WEST, f -> f.uvs(7, 0, 1, 8).texture(TextureSlot.PARTICLE));
            e.face(Direction.UP, f -> f.uvs(7, 1, 1, 0).texture(TextureSlot.PARTICLE).rotation(Quadrant.R90));
            e.face(Direction.DOWN, f -> f.uvs(1, 8, 7, 7).texture(TextureSlot.PARTICLE).rotation(Quadrant.R90).cullface(Direction.DOWN));
        });

        builder.transform(ItemDisplayContext.GUI, t -> t.rotation(34.75F, -43F, 0F).translation(0, 1, 0).scale(0.75F, 0.75F, 0.75F))
                .transform(ItemDisplayContext.GROUND, t -> t.translation(0, 3.5F, 0).scale(0.6F, 0.6F, 0.6F))
                .transform(ItemDisplayContext.FIXED, t -> t.translation(0, 0, -3.25F))
                .transform(ItemDisplayContext.HEAD, t -> t.translation(0, 10.5F, 0))
                .transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND, t -> t.rotation(70, 0, 0).translation(-6, 4.5F, 3.5F))
                .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND, t -> t.rotation(70, 0, 0).translation(-6, 4.5F, 3.5F))
                .transform(ItemDisplayContext.FIRST_PERSON_RIGHT_HAND, t -> t.translation(-9, 1, 0))
                .transform(ItemDisplayContext.FIRST_PERSON_LEFT_HAND, t -> t.translation(-9, 1, 0));

        ModelTemplate template = builder.build();

        template.create(
                modelLocation,
                new TextureMapping()
                        .put(TextureSlot.PARTICLE, new Material(texturePlant))
                        .put(TextureSlot.PLANT, new Material(texturePlant))
                        .put(TextureSlot.DIRT, new Material(textureDirt)),
                blockModels.modelOutput
        );
    }

    private void createLargePotDoubleVariant(BlockModelGenerators blockModels, Block block, Block plantBlock) {
        String plantName = BuiltInRegistries.BLOCK.getKey(plantBlock).getPath();
        Identifier plantModelLocation = this.mcLocation("block/" + plantName);

        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier modelLocation = this.modLocation("block/" + name);

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .parent(this.modLocation("block/large_flower_pot_cross_double"))
                .requiredTextureSlot(TextureSlot.PLANT);

        ModelTemplate modelTemplate = builder.build();

        modelTemplate.create(
                modelLocation,
                new TextureMapping().put(TextureSlot.PLANT, new Material(plantModelLocation)),
                blockModels.modelOutput
        );

        MultiVariant variant = plainVariant(modelLocation);

        blockModels.blockStateOutput.accept(
                MultiPartGenerator.multiPart(block)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH),
                                variant)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
        );
    }

    private void createLargePotEmissiveDouble(BlockModelGenerators blockModels, Block block, Block plantBlock) {
        String blockName = BuiltInRegistries.BLOCK.getKey(block).getPath();
        String plantName = BuiltInRegistries.BLOCK.getKey(plantBlock).getPath();

        Identifier potTexture = this.modLocation("block/large_pot");
        Identifier plantTexture = this.mcLocation("block/" + plantName);
        Identifier emissionTexture = this.mcLocation("block/" + plantName + "_emissive");
        Identifier dirtTexture = this.mcLocation("block/dirt");

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .ambientOcclusion(false)
                .requiredTextureSlot(TextureSlot.TEXTURE)
                .requiredTextureSlot(TextureSlot.PARTICLE)
                .requiredTextureSlot(TextureSlot.PLANT)
                .requiredTextureSlot(TextureSlot.CROSS_EMISSIVE)
                .requiredTextureSlot(TextureSlot.DIRT);

        builder.element(e -> {
            e.from(9.5f, 6f, 4.1f).to(9.5f, 18f, 14.9f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.shade(false);
            e.lightEmission(15);
            e.face(Direction.EAST, f -> f.texture(TextureSlot.CROSS_EMISSIVE).uvs(0, 0, 16, 16));
            e.face(Direction.WEST, f -> f.texture(TextureSlot.CROSS_EMISSIVE).uvs(0, 0, 16, 16));
        });

        builder.element(e -> {
            e.from(4.1f, 6f, 9.5f).to(14.9f, 18f, 9.5f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.shade(false);
            e.lightEmission(15);
            e.face(Direction.NORTH, f -> f.texture(TextureSlot.CROSS_EMISSIVE).uvs(0, 0, 16, 16));
            e.face(Direction.SOUTH, f -> f.texture(TextureSlot.CROSS_EMISSIVE).uvs(0, 0, 16, 16));
        });

        builder.element(e -> {
            e.from(6.5F, 6F, 1.1F).to(6.5F, 18F, 11.9F);
            e.rotation(r -> r.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.shade(false);
            e.lightEmission(15);
            e.face(Direction.EAST, f -> f.texture(TextureSlot.CROSS_EMISSIVE).uvs(0, 0, 16, 16));
            e.face(Direction.WEST, f -> f.texture(TextureSlot.CROSS_EMISSIVE).uvs(0, 0, 16, 16));
        });

        builder.element(e -> {
            e.from(1.1F, 6F, 6.5F).to(11.9F, 18F, 6.5F);
            e.rotation(r -> r.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.shade(false);
            e.lightEmission(15);
            e.face(Direction.NORTH, f -> f.texture(TextureSlot.CROSS_EMISSIVE).uvs(0, 0, 16, 16));
            e.face(Direction.SOUTH, f -> f.texture(TextureSlot.CROSS_EMISSIVE).uvs(0, 0, 16, 16));
        });


        builder.element(e -> {
            e.from(9.5f, 6f, 4.1f).to(9.5f, 18f, 14.9f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.face(Direction.EAST, f -> f.texture(TextureSlot.PLANT).uvs(0, 0, 16, 16));
            e.face(Direction.WEST, f -> f.texture(TextureSlot.PLANT).uvs(0, 0, 16, 16));
        });

        builder.element(e -> {
            e.from(4.1f, 6f, 9.5f).to(14.9f, 18f, 9.5f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.face(Direction.NORTH, f -> f.texture(TextureSlot.PLANT).uvs(0, 0, 16, 16));
            e.face(Direction.SOUTH, f -> f.texture(TextureSlot.PLANT).uvs(0, 0, 16, 16));
        });

        builder.element(e -> {
            e.from(6.5F, 6F, 1.1F).to(6.5F, 18F, 11.9F);
            e.rotation(r -> r.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
        });

        builder.element(e -> {
            e.from(1.1F, 6F, 6.5F).to(11.9F, 18F, 6.5F);
            e.rotation(r -> r.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
        });

        builder.element(e -> {
            e.from(0f, 0f, 4f).to(16f, 8f, 5f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 0).origin(16, 0, 0));
            e.face(Direction.NORTH, f -> f.texture(TextureSlot.TEXTURE).uvs(0, 8, 16, 16));
            e.face(Direction.EAST, f -> f.texture(TextureSlot.TEXTURE).uvs(16, 8, 15, 16).cullface(Direction.EAST));
            e.face(Direction.SOUTH, f -> f.texture(TextureSlot.TEXTURE).uvs(16, 8, 0, 16));
            e.face(Direction.WEST, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 8, 0, 16).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.texture(TextureSlot.TEXTURE).uvs(16, 9, 0, 8));
            e.face(Direction.DOWN, f -> f.texture(TextureSlot.TEXTURE).uvs(0, 15, 16, 16).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(0f, 0f, 5f).to(1f, 8f, 11f);
            e.face(Direction.EAST, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 0, 7, 8));
            e.face(Direction.WEST, f -> f.texture(TextureSlot.TEXTURE).uvs(7, 0, 1, 8).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.texture(TextureSlot.TEXTURE).uvs(7, 0, 1, 1).rotation(Quadrant.R90));
            e.face(Direction.DOWN, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 7, 7, 8).rotation(Quadrant.R90).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(1f, 0f, 5f).to(15f, 6f, 11f);
            e.face(Direction.UP, f -> f.texture(TextureSlot.DIRT).uvs(1, 5, 15, 11));
            e.face(Direction.DOWN, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 9, 15, 15).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(0f, 0f, 11f).to(16f, 8f, 12f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 0).origin(0, 0, 16));
            e.face(Direction.NORTH, f -> f.texture(TextureSlot.TEXTURE).uvs(16, 8, 0, 16));
            e.face(Direction.EAST, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 8, 0, 16).cullface(Direction.EAST));
            e.face(Direction.SOUTH, f -> f.texture(TextureSlot.TEXTURE).uvs(0, 8, 16, 16));
            e.face(Direction.WEST, f -> f.texture(TextureSlot.TEXTURE).uvs(16, 8, 15, 16).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.texture(TextureSlot.TEXTURE).uvs(0, 8, 16, 9));
            e.face(Direction.DOWN, f -> f.texture(TextureSlot.TEXTURE).uvs(16, 16, 0, 15).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(15f, 0f, 5f).to(16f, 8f, 11f);
            e.face(Direction.EAST, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 0, 7, 8).cullface(Direction.EAST));
            e.face(Direction.WEST, f -> f.texture(TextureSlot.TEXTURE).uvs(7, 0, 1, 8));
            e.face(Direction.UP, f -> f.texture(TextureSlot.TEXTURE).uvs(7, 1, 1, 0).rotation(Quadrant.R90));
            e.face(Direction.DOWN, f -> f.texture(TextureSlot.TEXTURE).uvs(1, 8, 7, 7).rotation(Quadrant.R90).cullface(Direction.DOWN));
        });

        builder.transform(ItemDisplayContext.GUI, t -> t.rotation(34.75F, -43F, 0F).translation(0, 1, 0).scale(0.75F, 0.75F, 0.75F))
                .transform(ItemDisplayContext.GROUND, t -> t.translation(0, 3.5F, 0).scale(0.6F, 0.6F, 0.6F))
                .transform(ItemDisplayContext.FIXED, t -> t.translation(0, 0, -3.25F))
                .transform(ItemDisplayContext.HEAD, t -> t.translation(0, 10.5F, 0))
                .transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND, t -> t.rotation(70, 0, 0).translation(-6, 4.5F, 3.5F))
                .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND, t -> t.rotation(70, 0, 0).translation(-6, 4.5F, 3.5F))
                .transform(ItemDisplayContext.FIRST_PERSON_RIGHT_HAND, t -> t.translation(-9, 1, 0))
                .transform(ItemDisplayContext.FIRST_PERSON_LEFT_HAND, t -> t.translation(-9, 1, 0));

        ModelTemplate template = builder.build();

        template.create(
                this.modLocation("block/" + blockName),
                new TextureMapping()
                        .put(TextureSlot.TEXTURE, new Material(potTexture))
                        .put(TextureSlot.DIRT, new Material(dirtTexture))
                        .put(TextureSlot.PARTICLE, new Material(potTexture))
                        .put(TextureSlot.PLANT, new Material(plantTexture))
                        .put(TextureSlot.CROSS_EMISSIVE, new Material(emissionTexture)),
                blockModels.modelOutput
        );

        MultiVariant variant = plainVariant(this.modLocation("block/" + blockName));

        blockModels.blockStateOutput.accept(
                MultiPartGenerator.multiPart(block)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH),
                                variant)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
        );
    }

    private void createLargePotFromStringDouble(BlockModelGenerators blockModels, Block block, String plantName) {
        Identifier plantModelLocation = this.mcLocation("block/" + plantName);

        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier modelLocation = this.modLocation("block/" + name);

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .parent(this.modLocation("block/large_flower_pot_cross_double"))
                .requiredTextureSlot(TextureSlot.PLANT);

        ModelTemplate modelTemplate = builder.build();

        modelTemplate.create(
                modelLocation,
                new TextureMapping().put(TextureSlot.PLANT, new Material(plantModelLocation)),
                blockModels.modelOutput
        );

        MultiVariant variant = plainVariant(modelLocation);

        blockModels.blockStateOutput.accept(
                MultiPartGenerator.multiPart(block)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH),
                                variant)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
        );
    }

    private void createDancingSunflower(BlockModelGenerators blockModels, Block potBlock) {
        String potName = BuiltInRegistries.BLOCK.getKey(potBlock).getPath();
        Identifier modelLocation = this.modLocation("block/" + potName);

        Identifier texPot = this.modLocation("block/large_pot");
        Identifier texBack = this.mcLocation("block/sunflower_back");
        Identifier texDirt = this.mcLocation("block/dirt");
        Identifier texFront = this.modLocation("block/dancing_sunflower_front");
        Identifier texBottom = this.modLocation("block/dancing_sunflower_bottom");
        Identifier texTop = this.modLocation("block/dancing_sunflower_top");

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .ambientOcclusion(false)
                .requiredTextureSlot(TextureSlot.TEXTURE)
                .requiredTextureSlot(TextureSlot.BACK)
                .requiredTextureSlot(TextureSlot.DIRT)
                .requiredTextureSlot(TextureSlot.FRONT)
                .requiredTextureSlot(TextureSlot.BOTTOM)
                .requiredTextureSlot(TextureSlot.TOP)
                .requiredTextureSlot(TextureSlot.PARTICLE);

        int[] angles = {45, -45};
        for (int angle : angles) {
            builder.element(e -> {
                e.from(0, 19, 8).to(16, 32, 8);
                e.shade(false);
                e.rotation(rot -> rot.origin(8, 19, 8).singleAxis(Direction.Axis.Y, angle));
                e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.TOP));
                e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.TOP));
            });

            builder.element(e -> {
                e.from(0, 6, 8).to(16, 19, 8);
                e.shade(false);
                e.rotation(rot -> rot.origin(8, 19, 8).singleAxis(Direction.Axis.Y, angle));
                e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.BOTTOM));
                e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.BOTTOM));
            });
        }

        builder.element(e -> {
            e.from(0, 0, 4).to(16, 8, 5);
            e.face(Direction.NORTH, f -> f.uvs(0, 8, 16, 16).texture(TextureSlot.TEXTURE));
            e.face(Direction.EAST, f -> f.uvs(16, 8, 15, 16).texture(TextureSlot.TEXTURE).cullface(Direction.EAST));
            e.face(Direction.SOUTH, f -> f.uvs(16, 8, 0, 16).texture(TextureSlot.TEXTURE));
            e.face(Direction.WEST, f -> f.uvs(1, 8, 0, 16).texture(TextureSlot.TEXTURE).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.uvs(16, 9, 0, 8).texture(TextureSlot.TEXTURE));
            e.face(Direction.DOWN, f -> f.uvs(0, 15, 16, 16).texture(TextureSlot.TEXTURE).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(0, 0, 5).to(1, 8, 11);
            e.face(Direction.EAST, f -> f.uvs(1, 0, 7, 8).texture(TextureSlot.TEXTURE));
            e.face(Direction.WEST, f -> f.uvs(7, 0, 1, 8).texture(TextureSlot.TEXTURE).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.uvs(7, 0, 1, 1).rotation(Quadrant.R90).texture(TextureSlot.TEXTURE));
            e.face(Direction.DOWN, f -> f.uvs(1, 7, 7, 8).rotation(Quadrant.R90).texture(TextureSlot.TEXTURE).cullface(Direction.DOWN));
        });
        builder.element(e -> {
            e.from(1, 0, 5).to(15, 6, 11);
            e.face(Direction.UP, f -> f.uvs(1, 5, 15, 11).texture(TextureSlot.DIRT));
            e.face(Direction.DOWN, f -> f.uvs(1, 9, 15, 15).texture(TextureSlot.TEXTURE).cullface(Direction.DOWN));
        });
        builder.element(e -> {
            e.from(0, 0, 11).to(16, 8, 12);
            e.face(Direction.NORTH, f -> f.uvs(16, 8, 0, 16).texture(TextureSlot.TEXTURE));
            e.face(Direction.EAST, f -> f.uvs(1, 8, 0, 16).texture(TextureSlot.TEXTURE).cullface(Direction.EAST));
            e.face(Direction.SOUTH, f -> f.uvs(0, 8, 16, 16).texture(TextureSlot.TEXTURE));
            e.face(Direction.WEST, f -> f.uvs(16, 8, 15, 16).texture(TextureSlot.TEXTURE).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.uvs(0, 8, 16, 9).texture(TextureSlot.TEXTURE));
            e.face(Direction.DOWN, f -> f.uvs(16, 16, 0, 15).texture(TextureSlot.TEXTURE).cullface(Direction.DOWN));
        });
        builder.element(e -> {
            e.from(15, 0, 5).to(16, 8, 11);
            e.face(Direction.EAST, f -> f.uvs(1, 0, 7, 8).texture(TextureSlot.TEXTURE).cullface(Direction.EAST));
            e.face(Direction.WEST, f -> f.uvs(7, 0, 1, 8).texture(TextureSlot.TEXTURE));
            e.face(Direction.UP, f -> f.uvs(7, 1, 1, 0).rotation(Quadrant.R90).texture(TextureSlot.TEXTURE));
            e.face(Direction.DOWN, f -> f.uvs(1, 8, 7, 7).rotation(Quadrant.R90).texture(TextureSlot.TEXTURE).cullface(Direction.DOWN));
        });

        builder.element(e -> {
                    e.from(4.75f, 22.75f, 8.5f).to(11.75f, 30.75f, 8.5f);
                    e.shade(false);
                    e.rotation(rot -> rot.origin(8, 32, 8).singleAxis(Direction.Axis.X, 22.5f));
                    e.face(Direction.NORTH, f -> f.uvs(4, 12, 12, 4).rotation(Quadrant.R180).texture(TextureSlot.FRONT));
                    e.face(Direction.SOUTH, f -> f.uvs(4, 4, 12, 12).texture(TextureSlot.BACK));
                })
                .transform(ItemDisplayContext.GUI, t -> t.rotation(34.75F, -43F, 0F).translation(0, 1, 0).scale(0.75F, 0.75F, 0.75F))
                .transform(ItemDisplayContext.GROUND, t -> t.translation(0, 3.5F, 0).scale(0.6F, 0.6F, 0.6F))
                .transform(ItemDisplayContext.FIXED, t -> t.translation(0, 0, -3.25F))
                .transform(ItemDisplayContext.HEAD, t -> t.translation(0, 10.5F, 0))
                .transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND, t -> t.rotation(70, 0, 0).translation(-6, 4.5F, 3.5F))
                .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND, t -> t.rotation(70, 0, 0).translation(-6, 4.5F, 3.5F))
                .transform(ItemDisplayContext.FIRST_PERSON_RIGHT_HAND, t -> t.translation(-9, 1, 0))
                .transform(ItemDisplayContext.FIRST_PERSON_LEFT_HAND, t -> t.translation(-9, 1, 0));

        ModelTemplate template = builder.build();

        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.TEXTURE, new Material(texPot))
                .put(TextureSlot.BACK, new Material(texBack))
                .put(TextureSlot.DIRT, new Material(texDirt))
                .put(TextureSlot.FRONT, new Material(texFront))
                .put(TextureSlot.BOTTOM, new Material(texBottom))
                .put(TextureSlot.TOP, new Material(texTop))
                .put(TextureSlot.PARTICLE, new Material(texPot));

        template.create(modelLocation, mapping, blockModels.modelOutput);

        MultiVariant variant = plainVariant(modelLocation);
        blockModels.blockStateOutput.accept(
                MultiPartGenerator.multiPart(potBlock)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH),
                                variant)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
        );
    }

    /*-------FLORAL BASKET--------*/
    private void createFloralBasketCross(BlockModelGenerators blockModels, Block block) {
        String blockName = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier modelLocation = this.modLocation("block/floral_basket_cross");

        Identifier textureBasket = this.modLocation("block/floral_basket");
        Identifier textureDirt = this.mcLocation("block/dirt");
        Identifier textureHayTop = this.mcLocation("block/hay_block_top");
        Identifier texturePlant = this.modLocation("block/" + blockName);

        TextureSlot BASKET = TextureSlot.create("basket");
        TextureSlot HAY_TOP = TextureSlot.create("hay_top");
        TextureSlot PLANT = TextureSlot.create("plant");

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .ambientOcclusion(false)
                .guiLight(UnbakedModel.GuiLight.FRONT)
                .requiredTextureSlot(BASKET)
                .requiredTextureSlot(TextureSlot.DIRT)
                .requiredTextureSlot(HAY_TOP)
                .requiredTextureSlot(PLANT)
                .requiredTextureSlot(TextureSlot.PARTICLE);

        builder.element(e -> {
            e.from(0, 8, 8).to(16, 16, 8);
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 8).texture(BASKET));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 8).texture(BASKET));
        });

        builder.element(e -> {
            e.from(0, 1, 2).to(16, 8, 3);
            e.face(Direction.NORTH, f -> f.uvs(0, 8, 16, 15).texture(BASKET));
            e.face(Direction.EAST, f -> f.uvs(15, 8, 16, 15).texture(BASKET).cullface(Direction.EAST));
            e.face(Direction.SOUTH, f -> f.uvs(16, 8, 0, 15).texture(BASKET));
            e.face(Direction.WEST, f -> f.uvs(0, 8, 1, 15).texture(BASKET).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.uvs(16, 9, 0, 8).texture(BASKET));
            e.face(Direction.DOWN, f -> f.uvs(16, 14, 0, 15).texture(BASKET));
        });

        builder.element(e -> {
            e.from(0, 1, 3).to(1, 8, 13);
            e.face(Direction.EAST, f -> f.uvs(13, 8, 3, 15).texture(BASKET));
            e.face(Direction.WEST, f -> f.uvs(3, 8, 13, 15).texture(BASKET).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.uvs(3, 9, 13, 8).texture(BASKET).rotation(Quadrant.R90));
            e.face(Direction.DOWN, f -> f.uvs(13, 15, 3, 14).texture(BASKET).rotation(Quadrant.R90));
        });

        builder.element(e -> {
            e.from(0, 1, 13).to(16, 8, 14);
            e.rotation(rot -> rot.origin(0, 0, 16).singleAxis(Direction.Axis.Y, 0));
            e.face(Direction.NORTH, f -> f.uvs(0, 8, 16, 15).texture(BASKET));
            e.face(Direction.EAST, f -> f.uvs(16, 8, 15, 15).texture(BASKET).cullface(Direction.EAST));
            e.face(Direction.SOUTH, f -> f.uvs(16, 8, 0, 15).texture(BASKET));
            e.face(Direction.WEST, f -> f.uvs(1, 8, 0, 15).texture(BASKET).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.uvs(16, 8, 0, 9).texture(BASKET));
            e.face(Direction.DOWN, f -> f.uvs(16, 15, 0, 14).texture(BASKET));
        });

        builder.element(e -> {
            e.from(15, 1, 3).to(16, 8, 13);
            e.rotation(rot -> rot.origin(16, 0, 0).singleAxis(Direction.Axis.Y, 0));
            e.face(Direction.EAST, f -> f.uvs(13, 8, 3, 15).texture(BASKET).cullface(Direction.EAST));
            e.face(Direction.WEST, f -> f.uvs(3, 8, 13, 15).texture(BASKET));
            e.face(Direction.UP, f -> f.uvs(3, 8, 13, 9).texture(BASKET).rotation(Quadrant.R90));
            e.face(Direction.DOWN, f -> f.uvs(13, 14, 3, 15).texture(BASKET).rotation(Quadrant.R90));
        });

        builder.element(e -> {
            e.from(1, 0, 3).to(15, 6, 13);
            e.face(Direction.NORTH, f -> f.uvs(1, 10, 15, 16).texture(BASKET));
            e.face(Direction.EAST, f -> f.uvs(3, 10, 13, 16).texture(BASKET));
            e.face(Direction.SOUTH, f -> f.uvs(1, 10, 15, 16).texture(BASKET));
            e.face(Direction.WEST, f -> f.uvs(3, 10, 13, 16).texture(BASKET));
            e.face(Direction.UP, f -> f.uvs(15, 13, 1, 3).texture(TextureSlot.DIRT));
            e.face(Direction.DOWN, f -> f.uvs(15, 3, 1, 13).texture(HAY_TOP).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(7, 6, -1.4F).to(7, 18, 9.4F);
            e.rotation(rot -> rot.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
        });

        builder.element(e -> {
            e.from(1.6F, 6, 4).to(12.4F, 18, 4);
            e.rotation(rot -> rot.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
        });

        builder.element(e -> {
            e.from(12, 6, 3.6F).to(12, 18, 14.4F);
            e.rotation(rot -> rot.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
        });

        builder.element(e -> {
            e.from(6.6F, 6, 9).to(17.4F, 18, 9);
            e.rotation(rot -> rot.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
        });

        builder.element(e -> {
            e.from(4.1F, 6, 6.5F).to(14.9F, 18, 6.5F);
            e.rotation(rot -> rot.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
        });

        builder.element(e -> {
            e.from(9.5F, 6, 1.1F).to(9.5F, 18, 11.9F);
            e.rotation(rot -> rot.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
        });

        builder.element(e -> {
            e.from(4, 6, 1.6F).to(4, 18, 12.4F);
            e.rotation(rot -> rot.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
        });

        builder.element(e -> {
            e.from(-1.4F, 6, 7).to(9.4F, 18, 7);
            e.rotation(rot -> rot.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
        });

        builder.element(e -> {
            e.from(3.6F, 6, 12).to(14.4F, 18, 12);
            e.rotation(rot -> rot.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
        });

        builder.element(e -> {
            e.from(9, 6, 6.6F).to(9, 18, 17.4F);
            e.rotation(rot -> rot.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
        });

        builder.element(e -> {
            e.from(6.5F, 6, 4.1F).to(6.5F, 18, 14.9F);
            e.rotation(rot -> rot.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
        });

        builder.element(e -> {
            e.from(1.1F, 6, 9.5F).to(11.9F, 18, 9.5F);
            e.rotation(rot -> rot.origin(8, 8, 8).singleAxis(Direction.Axis.Y, 45).rescale(true));
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(PLANT));
        });


        builder.transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND, t -> t.rotation(70, -90, 0).translation(0, -3.75F, -3.75F).scale(0.67969F, 0.67969F, 0.67969F))
                .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND, t -> t.rotation(70, -90, 0).translation(0, -3.75F, -3.75F).scale(0.67969F, 0.67969F, 0.67969F))
                .transform(ItemDisplayContext.FIRST_PERSON_RIGHT_HAND, t -> t.rotation(0, -80, 0).translation(5.25F, -4.5F, 0))
                .transform(ItemDisplayContext.FIRST_PERSON_LEFT_HAND, t -> t.rotation(0, -80, 0).translation(5.25F, -4.5F, 0))
                .transform(ItemDisplayContext.GROUND, t -> t.translation(0, 3.5F, 0).scale(0.6F, 0.6F, 0.6F))
                .transform(ItemDisplayContext.GUI, t -> t.rotation(34.75F, -43, 0).translation(0, 1, 0).scale(0.75F, 0.75F, 0.75F))
                .transform(ItemDisplayContext.HEAD, t -> t.translation(0, 10.5F, 0))
                .transform(ItemDisplayContext.FIXED, t -> t.translation(0, 0, -3.25F));

        ModelTemplate modelTemplate = builder.build();

        modelTemplate.create(
                modelLocation,
                new TextureMapping()
                        .put(BASKET, new Material(textureBasket))
                        .put(TextureSlot.DIRT, new Material(textureDirt))
                        .put(HAY_TOP, new Material(textureHayTop))
                        .put(PLANT, new Material(texturePlant))
                        .put(TextureSlot.PARTICLE, new Material(textureHayTop)),
                blockModels.modelOutput
        );
        
        MultiVariant variant = plainVariant(modelLocation);
        blockModels.blockStateOutput.accept(
                MultiPartGenerator.multiPart(block)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH),
                                variant)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
        );
    }

    private void createFloralBasket(BlockModelGenerators blockModels, Block block) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier modelLocation = this.modLocation("block/" + name);

        Identifier tex0 = this.modLocation("block/floral_basket");
        Identifier tex1 = this.mcLocation("block/dirt");
        Identifier tex2 = this.mcLocation("block/hay_block_top");

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .ambientOcclusion(false)
                .guiLight(UnbakedModel.GuiLight.FRONT)
                .requiredTextureSlot(TextureSlot.TEXTURE)
                .requiredTextureSlot(TextureSlot.DIRT)
                .requiredTextureSlot(TextureSlot.TOP)
                .requiredTextureSlot(TextureSlot.PARTICLE)

                .element(e -> {
                    e.from(0, 8, 8).to(16, 16, 8);
                    e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 8).texture(TextureSlot.TEXTURE));
                    e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 8).texture(TextureSlot.TEXTURE));
                })
                .element(e -> {
                    e.from(0, 1, 2).to(16, 8, 3);
                    e.face(Direction.NORTH, f -> f.uvs(0, 8, 16, 15).texture(TextureSlot.TEXTURE));
                    e.face(Direction.EAST, f -> f.uvs(15, 8, 16, 15).texture(TextureSlot.TEXTURE).cullface(Direction.EAST));
                    e.face(Direction.SOUTH, f -> f.uvs(16, 8, 0, 15).texture(TextureSlot.TEXTURE));
                    e.face(Direction.WEST, f -> f.uvs(0, 8, 1, 15).texture(TextureSlot.TEXTURE).cullface(Direction.WEST));
                    e.face(Direction.UP, f -> f.uvs(16, 9, 0, 8).texture(TextureSlot.TEXTURE));
                    e.face(Direction.DOWN, f -> f.uvs(16, 14, 0, 15).texture(TextureSlot.TEXTURE));
                })
                .element(e -> {
                    e.from(0, 1, 3).to(1, 8, 13);
                    e.face(Direction.EAST, f -> f.uvs(13, 8, 3, 15).texture(TextureSlot.TEXTURE));
                    e.face(Direction.WEST, f -> f.uvs(3, 8, 13, 15).texture(TextureSlot.TEXTURE).cullface(Direction.WEST));
                    e.face(Direction.UP, f -> f.uvs(3, 9, 13, 8).texture(TextureSlot.TEXTURE).rotation(Quadrant.R90));
                    e.face(Direction.DOWN, f -> f.uvs(13, 15, 3, 14).texture(TextureSlot.TEXTURE).rotation(Quadrant.R90));
                })
                .element(e -> {
                    e.from(0, 1, 13).to(16, 8, 14);
                    e.rotation(rot -> rot.origin(0, 0, 16).singleAxis(Direction.Axis.Y, 0));
                    e.face(Direction.NORTH, f -> f.uvs(0, 8, 16, 15).texture(TextureSlot.TEXTURE));
                    e.face(Direction.EAST, f -> f.uvs(16, 8, 15, 15).texture(TextureSlot.TEXTURE).cullface(Direction.EAST));
                    e.face(Direction.SOUTH, f -> f.uvs(16, 8, 0, 15).texture(TextureSlot.TEXTURE));
                    e.face(Direction.WEST, f -> f.uvs(1, 8, 0, 15).texture(TextureSlot.TEXTURE).cullface(Direction.WEST));
                    e.face(Direction.UP, f -> f.uvs(16, 8, 0, 9).texture(TextureSlot.TEXTURE));
                    e.face(Direction.DOWN, f -> f.uvs(16, 15, 0, 14).texture(TextureSlot.TEXTURE));
                })
                .element(e -> {
                    e.from(15, 1, 3).to(16, 8, 13);
                    e.rotation(rot -> rot.origin(16, 0, 0).singleAxis(Direction.Axis.Y, 0));
                    e.face(Direction.EAST, f -> f.uvs(13, 8, 3, 15).texture(TextureSlot.TEXTURE).cullface(Direction.EAST));
                    e.face(Direction.WEST, f -> f.uvs(3, 8, 13, 15).texture(TextureSlot.TEXTURE));
                    e.face(Direction.UP, f -> f.uvs(3, 8, 13, 9).texture(TextureSlot.TEXTURE).rotation(Quadrant.R90));
                    e.face(Direction.DOWN, f -> f.uvs(13, 14, 3, 15).texture(TextureSlot.TEXTURE).rotation(Quadrant.R90));
                })
                .element(e -> {
                    e.from(1, 0, 3).to(15, 6, 13);
                    e.face(Direction.NORTH, f -> f.uvs(1, 10, 15, 16).texture(TextureSlot.TEXTURE));
                    e.face(Direction.EAST, f -> f.uvs(3, 10, 13, 16).texture(TextureSlot.TEXTURE));
                    e.face(Direction.SOUTH, f -> f.uvs(1, 10, 15, 16).texture(TextureSlot.TEXTURE));
                    e.face(Direction.WEST, f -> f.uvs(3, 10, 13, 16).texture(TextureSlot.TEXTURE));
                    e.face(Direction.UP, f -> f.uvs(15, 13, 1, 3).texture(TextureSlot.DIRT));
                    e.face(Direction.DOWN, f -> f.uvs(15, 3, 1, 13).texture(TextureSlot.TOP).cullface(Direction.DOWN));
                })

                .transform(ItemDisplayContext.GUI, t ->
                        t.rotation(34.75F, -43, 0)
                                .translation(0, 1, 0)
                                .scale(0.75F, 0.75F, 0.75F))
                .transform(ItemDisplayContext.GROUND, t ->
                        t.translation(0, 3.5F, 0)
                                .scale(0.6F, 0.6F, 0.6F))
                .transform(ItemDisplayContext.FIXED, t ->
                        t.translation(0, 0, -3.25F))
                .transform(ItemDisplayContext.HEAD, t ->
                        t.translation(0, 10.5F, 0))
                .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND, t ->
                        t.rotation(70, -90, 0)
                                .translation(0, -3.75F, -3.75F)
                                .scale(0.67969F, 0.67969F, 0.67969F))
                .transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND, t ->
                        t.rotation(70, -90, 0)
                                .translation(0, -3.75F, -3.75F)
                                .scale(0.67969F, 0.67969F, 0.67969F))
                .transform(ItemDisplayContext.FIRST_PERSON_LEFT_HAND, t ->
                        t.rotation(0, -80, 0)
                                .translation(5.25F, -4.5F, 0))
                .transform(ItemDisplayContext.FIRST_PERSON_RIGHT_HAND, t ->
                        t.rotation(0, -80, 0)
                                .translation(5.25F, -4.5F, 0));

        ModelTemplate template = builder.build();
        template.create(
                modelLocation,
                new TextureMapping()
                        .put(TextureSlot.TEXTURE, new Material(tex0))
                        .put(TextureSlot.DIRT, new Material(tex1))
                        .put(TextureSlot.TOP, new Material(tex2))
                        .put(TextureSlot.PARTICLE, new Material(tex2)),
                blockModels.modelOutput
        );

        MultiVariant variant = plainVariant(modelLocation);
        blockModels.blockStateOutput.accept(
                MultiPartGenerator.multiPart(block)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH),
                                variant)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
        );
    }

    private void createFloralBasketVariants(BlockModelGenerators blockModels, Block block, Block plantBlock) {
        String plantName = BuiltInRegistries.BLOCK.getKey(plantBlock).getPath();
        Identifier plantModelLocation = this.mcLocation("block/" + plantName);

        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier modelLocation = this.modLocation("block/" + name);

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .parent(this.modLocation("block/floral_basket_cross"))
                .requiredTextureSlot(TextureSlot.PLANT);

        ModelTemplate modelTemplate = builder.build();

        modelTemplate.create(
                modelLocation,
                new TextureMapping().put(TextureSlot.PLANT, new Material(plantModelLocation)),
                blockModels.modelOutput
        );

        MultiVariant variant = plainVariant(modelLocation);

        blockModels.blockStateOutput.accept(
                MultiPartGenerator.multiPart(block)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH),
                                variant)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
        );
    }

    private void createFloralBasketFromString(BlockModelGenerators blockModels, Block block, String plantName) {
        Identifier plantModelLocation = this.mcLocation("block/" + plantName);

        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();
        Identifier modelLocation = this.modLocation("block/" + name);

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .parent(this.modLocation("block/floral_basket_cross"))
                .requiredTextureSlot(TextureSlot.PLANT);

        ModelTemplate modelTemplate = builder.build();

        modelTemplate.create(
                modelLocation,
                new TextureMapping().put(TextureSlot.PLANT, new Material(plantModelLocation)),
                blockModels.modelOutput
        );

        MultiVariant variant = plainVariant(modelLocation);

        blockModels.blockStateOutput.accept(
                MultiPartGenerator.multiPart(block)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH),
                                variant)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
        );
    }

    private void createFloralBasketEmissive(BlockModelGenerators blockModels, Block block, Block plantBlock) {
        String blockPath = BuiltInRegistries.BLOCK.getKey(block).getPath();
        String plantPath = BuiltInRegistries.BLOCK.getKey(plantBlock).getPath();
        Identifier modelLocation = this.modLocation("block/" + blockPath);

        Identifier textureBasket = this.modLocation("block/floral_basket");
        Identifier textureDirt = this.mcLocation("block/dirt");
        Identifier textureHayTop = this.mcLocation("block/hay_block_top");
        Identifier texturePlant = this.mcLocation("block/" + plantPath);
        Identifier textureEmission = this.mcLocation("block/open_eyeblossom_emissive");

        ExtendedModelTemplateBuilder builder = ExtendedModelTemplateBuilder.builder()
                .ambientOcclusion(false)
                .guiLight(UnbakedModel.GuiLight.FRONT)
                .requiredTextureSlot(TextureSlot.TEXTURE)
                .requiredTextureSlot(TextureSlot.DIRT)
                .requiredTextureSlot(TextureSlot.PARTICLE)
                .requiredTextureSlot(TextureSlot.PLANT)
                .requiredTextureSlot(TextureSlot.CROSS_EMISSIVE);

        builder.element(e -> {
            e.from(0, 8, 8).to(16, 16, 8);
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 8).texture(TextureSlot.TEXTURE));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 8).texture(TextureSlot.TEXTURE));
        });

        builder.element(e -> {
            e.from(0, 1, 2).to(16, 8, 3);
            e.face(Direction.NORTH, f -> f.uvs(0, 8, 16, 15).texture(TextureSlot.TEXTURE));
            e.face(Direction.EAST, f -> f.uvs(15, 8, 16, 15).texture(TextureSlot.TEXTURE).cullface(Direction.EAST));
            e.face(Direction.SOUTH, f -> f.uvs(16, 8, 0, 15).texture(TextureSlot.TEXTURE));
            e.face(Direction.WEST, f -> f.uvs(0, 8, 1, 15).texture(TextureSlot.TEXTURE).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.uvs(16, 9, 0, 8).texture(TextureSlot.TEXTURE));
            e.face(Direction.DOWN, f -> f.uvs(16, 14, 0, 15).texture(TextureSlot.TEXTURE));
        });

        builder.element(e -> {
            e.from(0, 1, 3).to(1, 8, 13);
            e.face(Direction.EAST, f -> f.uvs(13, 8, 3, 15).texture(TextureSlot.TEXTURE));
            e.face(Direction.WEST, f -> f.uvs(3, 8, 13, 15).texture(TextureSlot.TEXTURE).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.uvs(3, 9, 13, 8).rotation(Quadrant.R90).texture(TextureSlot.TEXTURE));
            e.face(Direction.DOWN, f -> f.uvs(13, 15, 3, 14).rotation(Quadrant.R90).texture(TextureSlot.TEXTURE));
        });

        builder.element(e -> {
            e.from(0, 1, 13).to(16, 8, 14);
            e.face(Direction.NORTH, f -> f.uvs(0, 8, 16, 15).texture(TextureSlot.TEXTURE));
            e.face(Direction.EAST, f -> f.uvs(16, 8, 15, 15).texture(TextureSlot.TEXTURE).cullface(Direction.EAST));
            e.face(Direction.SOUTH, f -> f.uvs(16, 8, 0, 15).texture(TextureSlot.TEXTURE));
            e.face(Direction.WEST, f -> f.uvs(1, 8, 0, 15).texture(TextureSlot.TEXTURE).cullface(Direction.WEST));
            e.face(Direction.UP, f -> f.uvs(16, 8, 0, 9).texture(TextureSlot.TEXTURE));
            e.face(Direction.DOWN, f -> f.uvs(16, 15, 0, 14).texture(TextureSlot.TEXTURE));
        });

        builder.element(e -> {
            e.from(15, 1, 3).to(16, 8, 13);
            e.face(Direction.EAST, f -> f.uvs(13, 8, 3, 15).texture(TextureSlot.TEXTURE).cullface(Direction.EAST));
            e.face(Direction.WEST, f -> f.uvs(3, 8, 13, 15).texture(TextureSlot.TEXTURE));
            e.face(Direction.UP, f -> f.uvs(3, 8, 13, 9).rotation(Quadrant.R90).texture(TextureSlot.TEXTURE));
            e.face(Direction.DOWN, f -> f.uvs(13, 14, 3, 15).rotation(Quadrant.R90).texture(TextureSlot.TEXTURE));
        });

        builder.element(e -> {
            e.from(1, 0, 3).to(15, 6, 13);
            e.face(Direction.UP, f -> f.uvs(15, 13, 1, 3).texture(TextureSlot.DIRT));
            e.face(Direction.DOWN, f -> f.uvs(15, 3, 1, 13).texture(TextureSlot.TEXTURE).cullface(Direction.DOWN));
        });

        builder.element(e -> {
            e.from(7, 6, -1.4f).to(7, 18, 9.4f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
        });

        builder.element(e -> {
            e.from(1.6f, 6, 4).to(12.4f, 18, 4);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
        });

        builder.element(e -> {
            e.from(12, 6, 3.6f).to(12, 18, 14.4f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
        });

        builder.element(e -> {
            e.from(6.6f, 6, 9).to(17.4f, 18, 9);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
        });

        builder.element(e -> {
            e.from(4.1f, 6, 6.5f).to(14.9f, 18, 6.5f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
        });

        builder.element(e -> {
            e.from(9.5f, 6, 1.1f).to(9.5f, 18, 11.9f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
        });

        builder.element(e -> {
            e.from(4, 6, 1.6f).to(4, 18, 12.4f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
        });

        builder.element(e -> {
            e.from(-1.4f, 6, 7).to(9.4f, 18, 7);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
        });

        builder.element(e -> {
            e.from(3.6f, 6, 12).to(14.4f, 18, 12);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
        });

        builder.element(e -> {
            e.from(9f, 6, 6.6f).to(9f, 18, 17.4f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
        });

        builder.element(e -> {
            e.from(6.5f, 6, 4.1f).to(6.5f, 18, 14.9f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
        });

        builder.element(e -> {
            e.from(1.1f, 6, 9.5f).to(11.9f, 18, 9.5f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.PLANT));
        });

        builder.element(e -> {
            e.from(7, 6, -1.4f).to(7, 18, 9.4f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.shade(false);
            e.lightEmission(15);
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
        });

        builder.element(e -> {
            e.from(1.6f, 6, 4).to(12.4f, 18, 4);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.shade(false);
            e.lightEmission(15);
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
        });

        builder.element(e -> {
            e.from(12, 6, 3.6f).to(12, 18, 14.4f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.shade(false);
            e.lightEmission(15);
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
        });

        builder.element(e -> {
            e.from(6.6f, 6, 9).to(17.4f, 18, 9);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.shade(false);
            e.lightEmission(15);
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
        });

        builder.element(e -> {
            e.from(4.1f, 6, 6.5f).to(14.9f, 18, 6.5f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.shade(false);
            e.lightEmission(15);
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
        });

        builder.element(e -> {
            e.from(9.5f, 6, 1.1f).to(9.5f, 18, 11.9f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.shade(false);
            e.lightEmission(15);
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
        });

        builder.element(e -> {
            e.from(4, 6, 1.6f).to(4, 18, 12.4f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.shade(false);
            e.lightEmission(15);
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
        });

        builder.element(e -> {
            e.from(-1.4f, 6, 7).to(9.4f, 18, 7);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.shade(false);
            e.lightEmission(15);
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
        });

        builder.element(e -> {
            e.from(3.6f, 6, 12).to(14.4f, 18, 12);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.shade(false);
            e.lightEmission(15);
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
        });

        builder.element(e -> {
            e.from(9f, 6, 6.6f).to(9f, 18, 17.4f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.shade(false);
            e.lightEmission(15);
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
        });

        builder.element(e -> {
            e.from(6.5f, 6, 4.1f).to(6.5f, 18, 14.9f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.shade(false);
            e.lightEmission(15);
            e.face(Direction.EAST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
            e.face(Direction.WEST, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
        });

        builder.element(e -> {
            e.from(1.1f, 6, 9.5f).to(11.9f, 18, 9.5f);
            e.rotation(r -> r.singleAxis(Direction.Axis.Y, 45).origin(8, 8, 8).rescale(true));
            e.shade(false);
            e.lightEmission(15);
            e.face(Direction.NORTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
            e.face(Direction.SOUTH, f -> f.uvs(0, 0, 16, 16).texture(TextureSlot.CROSS_EMISSIVE));
        });


        builder.transform(ItemDisplayContext.GUI, t -> t.rotation(34.75F, -43F, 0F).translation(0, 1, 0).scale(0.75F, 0.75F, 0.75F))
                .transform(ItemDisplayContext.GROUND, t -> t.translation(0, 3.5F, 0).scale(0.6F, 0.6F, 0.6F))
                .transform(ItemDisplayContext.FIXED, t -> t.translation(0, 0, -3.25F))
                .transform(ItemDisplayContext.HEAD, t -> t.translation(0, 10.5F, 0))
                .transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND, t -> t.rotation(70, -90, 0).translation(0, -3.75F, -3.75F).scale(0.67969F, 0.67969F, 0.67969F))
                .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND, t -> t.rotation(70, -90, 0).translation(0, -3.75F, -3.75F).scale(0.67969F, 0.67969F, 0.67969F))
                .transform(ItemDisplayContext.FIRST_PERSON_RIGHT_HAND, t -> t.rotation(0, -80, 0).translation(5.25F, -4.5F, 0F))
                .transform(ItemDisplayContext.FIRST_PERSON_LEFT_HAND, t -> t.rotation(0, -80, 0).translation(5.25F, -4.5F, 0F));

        ModelTemplate modelTemplate = builder.build();

        modelTemplate.create(
                modelLocation,
                new TextureMapping()
                        .put(TextureSlot.TEXTURE, new Material(textureBasket))
                        .put(TextureSlot.DIRT, new Material(textureDirt))
                        .put(TextureSlot.PARTICLE, new Material(textureHayTop))
                        .put(TextureSlot.PLANT, new Material(texturePlant))
                        .put(TextureSlot.CROSS_EMISSIVE, new Material(textureEmission)),
                blockModels.modelOutput
        );

        MultiVariant variant = plainVariant(modelLocation);

        blockModels.blockStateOutput.accept(
                MultiPartGenerator.multiPart(block)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH),
                                variant)
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.SOUTH),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R180)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.WEST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R270)))
                        .with(BlockModelGenerators.condition().term(BlockStateProperties.HORIZONTAL_FACING, Direction.EAST),
                                variant.with(VariantMutator.Y_ROT.withValue(Quadrant.R90)))
        );
    }
}