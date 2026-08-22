package com.cozary.floralench.datagen;

import com.cozary.floralench.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ModRecipeProvider extends RecipeProvider {

    public static final Supplier<List<FloralEntry>> MOSSY_COBBLESTONES = () -> List.of(
            new FloralEntry(ModItems.DANDELION_MOSSY_COBBLESTONE_ITEM.get(), ModItems.DANDELION_VINE_ITEM.get()),
            new FloralEntry(ModItems.POPPY_MOSSY_COBBLESTONE_ITEM.get(), ModItems.POPPY_VINE_ITEM.get()),
            new FloralEntry(ModItems.BLUE_ORCHID_MOSSY_COBBLESTONE_ITEM.get(), ModItems.BLUE_ORCHID_VINE_ITEM.get()),
            new FloralEntry(ModItems.ALLIUM_MOSSY_COBBLESTONE_ITEM.get(), ModItems.ALLIUM_VINE_ITEM.get()),
            new FloralEntry(ModItems.AZURE_BLUET_MOSSY_COBBLESTONE_ITEM.get(), ModItems.AZURE_BLUET_VINE_ITEM.get()),
            new FloralEntry(ModItems.RED_TULIP_MOSSY_COBBLESTONE_ITEM.get(), ModItems.RED_TULIP_VINE_ITEM.get()),
            new FloralEntry(ModItems.ORANGE_TULIP_MOSSY_COBBLESTONE_ITEM.get(), ModItems.ORANGE_TULIP_VINE_ITEM.get()),
            new FloralEntry(ModItems.WHITE_TULIP_MOSSY_COBBLESTONE_ITEM.get(), ModItems.WHITE_TULIP_VINE_ITEM.get()),
            new FloralEntry(ModItems.PINK_TULIP_MOSSY_COBBLESTONE_ITEM.get(), ModItems.PINK_TULIP_VINE_ITEM.get()),
            new FloralEntry(ModItems.OXEYE_DAISY_MOSSY_COBBLESTONE_ITEM.get(), ModItems.OXEYE_DAISY_VINE_ITEM.get()),
            new FloralEntry(ModItems.CORNFLOWER_MOSSY_COBBLESTONE_ITEM.get(), ModItems.CORNFLOWER_VINE_ITEM.get()),
            new FloralEntry(ModItems.LILY_OF_THE_VALLEY_MOSSY_COBBLESTONE_ITEM.get(), ModItems.LILY_OF_THE_VALLEY_VINE_ITEM.get()),
            new FloralEntry(ModItems.WITHER_ROSE_MOSSY_COBBLESTONE_ITEM.get(), ModItems.WITHER_ROSE_VINE_ITEM.get()),
            new FloralEntry(ModItems.SUNFLOWER_MOSSY_COBBLESTONE_ITEM.get(), ModItems.SUNFLOWER_VINE_ITEM.get()),
            new FloralEntry(ModItems.LILAC_MOSSY_COBBLESTONE_ITEM.get(), ModItems.LILAC_VINE_ITEM.get()),
            new FloralEntry(ModItems.ROSE_BUSH_MOSSY_COBBLESTONE_ITEM.get(), ModItems.ROSE_BUSH_VINE_ITEM.get()),
            new FloralEntry(ModItems.PEONY_MOSSY_COBBLESTONE_ITEM.get(), ModItems.PEONY_VINE_ITEM.get()),
            new FloralEntry(ModItems.TORCHFLOWER_MOSSY_COBBLESTONE_ITEM.get(), ModItems.TORCHFLOWER_VINE_ITEM.get()),
            new FloralEntry(ModItems.PITCHER_PLANT_MOSSY_COBBLESTONE_ITEM.get(), ModItems.PITCHER_PLANT_VINE_ITEM.get()),
            new FloralEntry(ModItems.CHORUS_FLOWER_MOSSY_COBBLESTONE_ITEM.get(), ModItems.CHORUS_FLOWER_VINE_ITEM.get()),
            new FloralEntry(ModItems.AZALEA_MOSSY_COBBLESTONE_ITEM.get(), ModItems.AZALEA_VINE_ITEM.get()),
            new FloralEntry(ModItems.PINK_PETALS_MOSSY_COBBLESTONE_ITEM.get(), ModItems.PINK_PETALS_VINE_ITEM.get()),
            new FloralEntry(ModItems.SPORE_BLOSSOM_MOSSY_COBBLESTONE_ITEM.get(), ModItems.SPORE_BLOSSOM_VINE_ITEM.get()),
            new FloralEntry(ModItems.OPEN_EYEBLOSSOM_MOSSY_COBBLESTONE_ITEM.get(), ModItems.OPEN_EYEBLOSSOM_VINE_ITEM.get()),
            new FloralEntry(ModItems.CLOSED_EYEBLOSSOM_MOSSY_COBBLESTONE_ITEM.get(), ModItems.CLOSED_EYEBLOSSOM_VINE_ITEM.get()),
            new FloralEntry(ModItems.WILDFLOWERS_MOSSY_COBBLESTONE_ITEM.get(), ModItems.WILDFLOWERS_VINE_ITEM.get()),
            new FloralEntry(ModItems.CACTUS_FLOWER_MOSSY_COBBLESTONE_ITEM.get(), ModItems.CACTUS_FLOWER_VINE_ITEM.get()),
            new FloralEntry(ModItems.GOLDEN_DANDELION_MOSSY_COBBLESTONE_ITEM.get(), ModItems.GOLDEN_DANDELION_VINE_ITEM.get())
    );
    public static final Supplier<List<FloralEntry>> BUSHES = () -> List.of(
            new FloralEntry(ModItems.ALLIUM_BUSH_ITEM.get(), Items.ALLIUM),
            new FloralEntry(ModItems.AZURE_BLUET_BUSH_ITEM.get(), Items.AZURE_BLUET),
            new FloralEntry(ModItems.BLUE_ORCHID_BUSH_ITEM.get(), Items.BLUE_ORCHID),
            new FloralEntry(ModItems.CORNFLOWER_BUSH_ITEM.get(), Items.CORNFLOWER),
            new FloralEntry(ModItems.DANDELION_BUSH_ITEM.get(), Items.DANDELION),
            new FloralEntry(ModItems.LILAC_BUSH_ITEM.get(), Items.LILAC),
            new FloralEntry(ModItems.LILY_OF_THE_VALLEY_BUSH_ITEM.get(), Items.LILY_OF_THE_VALLEY),
            new FloralEntry(ModItems.ORANGE_TULIP_BUSH_ITEM.get(), Items.ORANGE_TULIP),
            new FloralEntry(ModItems.OXEYE_DAISY_BUSH_ITEM.get(), Items.OXEYE_DAISY),
            new FloralEntry(ModItems.PEONY_BUSH_ITEM.get(), Items.PEONY),
            new FloralEntry(ModItems.PINK_TULIP_BUSH_ITEM.get(), Items.PINK_TULIP),
            new FloralEntry(ModItems.POPPY_BUSH_ITEM.get(), Items.POPPY),
            new FloralEntry(ModItems.RED_TULIP_BUSH_ITEM.get(), Items.RED_TULIP),
            new FloralEntry(ModItems.ROSE_BUSH_BUSH_ITEM.get(), Items.ROSE_BUSH),
            new FloralEntry(ModItems.SUNFLOWER_BUSH_ITEM.get(), Items.SUNFLOWER),
            new FloralEntry(ModItems.WHITE_TULIP_BUSH_ITEM.get(), Items.WHITE_TULIP),
            new FloralEntry(ModItems.WITHER_ROSE_BUSH_ITEM.get(), Items.WITHER_ROSE),
            new FloralEntry(ModItems.TORCHFLOWER_BUSH_ITEM.get(), Items.TORCHFLOWER),
            new FloralEntry(ModItems.PITCHER_PLANT_BUSH_ITEM.get(), Items.PITCHER_PLANT),
            new FloralEntry(ModItems.CHORUS_FLOWER_BUSH_ITEM.get(), Items.CHORUS_FLOWER),
            new FloralEntry(ModItems.AZALEA_BUSH_ITEM.get(), Items.AZALEA),
            new FloralEntry(ModItems.PINK_PETALS_BUSH_ITEM.get(), Items.PINK_TULIP),
            new FloralEntry(ModItems.SPORE_BLOSSOM_BUSH_ITEM.get(), Items.SPORE_BLOSSOM),
            new FloralEntry(ModItems.OPEN_EYEBLOSSOM_BUSH_ITEM.get(), Items.OPEN_EYEBLOSSOM),
            new FloralEntry(ModItems.CLOSED_EYEBLOSSOM_BUSH_ITEM.get(), Items.CLOSED_EYEBLOSSOM),
            new FloralEntry(ModItems.WILDFLOWERS_BUSH_ITEM.get(), Items.WILDFLOWERS),
            new FloralEntry(ModItems.CACTUS_FLOWER_BUSH_ITEM.get(), Items.CACTUS_FLOWER),
            new FloralEntry(ModItems.GOLDEN_DANDELION_BUSH_ITEM.get(), Items.GOLDEN_DANDELION)
    );
    public static final Supplier<List<FloralEntry>> MOSSY_STONE_BRICKS = () -> List.of(
            new FloralEntry(ModItems.DANDELION_MOSSY_STONE_BRICK_ITEM.get(), ModItems.DANDELION_VINE_ITEM.get()),
            new FloralEntry(ModItems.POPPY_MOSSY_STONE_BRICK_ITEM.get(), ModItems.POPPY_VINE_ITEM.get()),
            new FloralEntry(ModItems.BLUE_ORCHID_MOSSY_STONE_BRICK_ITEM.get(), ModItems.BLUE_ORCHID_VINE_ITEM.get()),
            new FloralEntry(ModItems.ALLIUM_MOSSY_STONE_BRICK_ITEM.get(), ModItems.ALLIUM_VINE_ITEM.get()),
            new FloralEntry(ModItems.AZURE_BLUET_MOSSY_STONE_BRICK_ITEM.get(), ModItems.AZURE_BLUET_VINE_ITEM.get()),
            new FloralEntry(ModItems.RED_TULIP_MOSSY_STONE_BRICK_ITEM.get(), ModItems.RED_TULIP_VINE_ITEM.get()),
            new FloralEntry(ModItems.ORANGE_TULIP_MOSSY_STONE_BRICK_ITEM.get(), ModItems.ORANGE_TULIP_VINE_ITEM.get()),
            new FloralEntry(ModItems.WHITE_TULIP_MOSSY_STONE_BRICK_ITEM.get(), ModItems.WHITE_TULIP_VINE_ITEM.get()),
            new FloralEntry(ModItems.PINK_TULIP_MOSSY_STONE_BRICK_ITEM.get(), ModItems.PINK_TULIP_VINE_ITEM.get()),
            new FloralEntry(ModItems.OXEYE_DAISY_MOSSY_STONE_BRICK_ITEM.get(), ModItems.OXEYE_DAISY_VINE_ITEM.get()),
            new FloralEntry(ModItems.CORNFLOWER_MOSSY_STONE_BRICK_ITEM.get(), ModItems.CORNFLOWER_VINE_ITEM.get()),
            new FloralEntry(ModItems.LILY_OF_THE_VALLEY_MOSSY_STONE_BRICK_ITEM.get(), ModItems.LILY_OF_THE_VALLEY_VINE_ITEM.get()),
            new FloralEntry(ModItems.WITHER_ROSE_MOSSY_STONE_BRICK_ITEM.get(), ModItems.WITHER_ROSE_VINE_ITEM.get()),
            new FloralEntry(ModItems.SUNFLOWER_MOSSY_STONE_BRICK_ITEM.get(), ModItems.SUNFLOWER_VINE_ITEM.get()),
            new FloralEntry(ModItems.LILAC_MOSSY_STONE_BRICK_ITEM.get(), ModItems.LILAC_VINE_ITEM.get()),
            new FloralEntry(ModItems.ROSE_BUSH_MOSSY_STONE_BRICK_ITEM.get(), ModItems.ROSE_BUSH_VINE_ITEM.get()),
            new FloralEntry(ModItems.PEONY_MOSSY_STONE_BRICK_ITEM.get(), ModItems.PEONY_VINE_ITEM.get()),
            new FloralEntry(ModItems.TORCHFLOWER_MOSSY_STONE_BRICK_ITEM.get(), ModItems.TORCHFLOWER_VINE_ITEM.get()),
            new FloralEntry(ModItems.PITCHER_PLANT_MOSSY_STONE_BRICK_ITEM.get(), ModItems.PITCHER_PLANT_VINE_ITEM.get()),
            new FloralEntry(ModItems.CHORUS_FLOWER_MOSSY_STONE_BRICK_ITEM.get(), ModItems.CHORUS_FLOWER_VINE_ITEM.get()),
            new FloralEntry(ModItems.AZALEA_MOSSY_STONE_BRICK_ITEM.get(), ModItems.AZALEA_VINE_ITEM.get()),
            new FloralEntry(ModItems.PINK_PETALS_MOSSY_STONE_BRICK_ITEM.get(), ModItems.PINK_PETALS_VINE_ITEM.get()),
            new FloralEntry(ModItems.SPORE_BLOSSOM_MOSSY_STONE_BRICK_ITEM.get(), ModItems.SPORE_BLOSSOM_VINE_ITEM.get()),
            new FloralEntry(ModItems.OPEN_EYEBLOSSOM_MOSSY_STONE_BRICK_ITEM.get(), ModItems.OPEN_EYEBLOSSOM_VINE_ITEM.get()),
            new FloralEntry(ModItems.CLOSED_EYEBLOSSOM_MOSSY_STONE_BRICK_ITEM.get(), ModItems.CLOSED_EYEBLOSSOM_VINE_ITEM.get()),
            new FloralEntry(ModItems.WILDFLOWERS_MOSSY_STONE_BRICK_ITEM.get(), ModItems.WILDFLOWERS_VINE_ITEM.get()),
            new FloralEntry(ModItems.CACTUS_FLOWER_MOSSY_STONE_BRICK_ITEM.get(), ModItems.CACTUS_FLOWER_VINE_ITEM.get()),
            new FloralEntry(ModItems.GOLDEN_DANDELION_MOSSY_STONE_BRICK_ITEM.get(), ModItems.GOLDEN_DANDELION_VINE_ITEM.get())
    );
    public static final Supplier<List<FloralEntry>> FLORAL_BASKETS = () -> List.of(
            new FloralEntry(ModItems.DANDELION_BASKET.get(), Items.DANDELION),
            new FloralEntry(ModItems.POPPY_BASKET.get(), Items.POPPY),
            new FloralEntry(ModItems.BLUE_ORCHID_BASKET.get(), Items.BLUE_ORCHID),
            new FloralEntry(ModItems.ALLIUM_BASKET.get(), Items.ALLIUM),
            new FloralEntry(ModItems.AZURE_BLUET_BASKET.get(), Items.AZURE_BLUET),
            new FloralEntry(ModItems.RED_TULIP_BASKET.get(), Items.RED_TULIP),
            new FloralEntry(ModItems.ORANGE_TULIP_BASKET.get(), Items.ORANGE_TULIP),
            new FloralEntry(ModItems.WHITE_TULIP_BASKET.get(), Items.WHITE_TULIP),
            new FloralEntry(ModItems.PINK_TULIP_BASKET.get(), Items.PINK_TULIP),
            new FloralEntry(ModItems.OXEYE_DAISY_BASKET.get(), Items.OXEYE_DAISY),
            new FloralEntry(ModItems.CORNFLOWER_BASKET.get(), Items.CORNFLOWER),
            new FloralEntry(ModItems.LILY_OF_THE_VALLEY_BASKET.get(), Items.LILY_OF_THE_VALLEY),
            new FloralEntry(ModItems.WITHER_ROSE_BASKET.get(), Items.WITHER_ROSE),
            new FloralEntry(ModItems.TORCHFLOWER_BASKET.get(), Items.TORCHFLOWER),
            new FloralEntry(ModItems.PITCHER_PLANT_BASKET.get(), Items.PITCHER_PLANT),
            new FloralEntry(ModItems.AZALEA_BASKET.get(), Items.AZALEA),
            new FloralEntry(ModItems.SPORE_BLOSSOM_BASKET.get(), Items.SPORE_BLOSSOM),
            new FloralEntry(ModItems.OPEN_EYEBLOSSOM_BASKET.get(), Items.OPEN_EYEBLOSSOM),
            new FloralEntry(ModItems.CLOSED_EYEBLOSSOM_BASKET.get(), Items.CLOSED_EYEBLOSSOM),
            new FloralEntry(ModItems.CACTUS_FLOWER_BASKET.get(), Items.CACTUS_FLOWER),
            new FloralEntry(ModItems.GOLDEN_DANDELION_BASKET.get(), Items.GOLDEN_DANDELION)
    );


    protected ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {

        shaped(RecipeCategory.DECORATIONS, ModItems.FLORAL_BASKET.get())
                .pattern("# #")
                .pattern("###")
                .define('#', Items.WHEAT)
                .unlockedBy("has_wheat", has(Items.WHEAT))
                .save(output);

        for (FloralEntry entry : FLORAL_BASKETS.get()) {
            shaped(RecipeCategory.DECORATIONS, entry.item)
                    .pattern("###")
                    .pattern("###")
                    .pattern(" W ")
                    .define('#', entry.flower)
                    .define('W', ModItems.FLORAL_BASKET.get())
                    .unlockedBy("has_floral_basket", has(ModItems.FLORAL_BASKET.get()))
                    .save(output);
        }

        for (FloralEntry entry : FLORAL_BASKETS.get()) {
            shapeless(RecipeCategory.DECORATIONS, entry.flower, 6)
                    .requires(entry.item)
                    .unlockedBy("has_floral_vine", has(entry.item))
                    .save(output, entry.item + "_revert");
        }

        for (FloralEntry entry : BUSHES.get()) {
            shaped(RecipeCategory.DECORATIONS, entry.item)
                    .pattern("mmm")
                    .pattern("mxm")
                    .pattern("mmm")
                    .define('m', Items.VINE)
                    .define('x', entry.flower)
                    .unlockedBy("has_vine", has(Items.VINE))
                    .save(output);
        }

        for (FloralEntry entry : MOSSY_COBBLESTONES.get()) {
            shapeless(RecipeCategory.DECORATIONS, entry.item)
                    .requires(entry.flower)
                    .requires(Items.COBBLESTONE)
                    .unlockedBy("has_floral_vine", has(entry.flower))
                    .save(output);
        }

        for (FloralEntry entry : MOSSY_STONE_BRICKS.get()) {
            shapeless(RecipeCategory.DECORATIONS, entry.item)
                    .requires(entry.flower)
                    .requires(Items.COBBLESTONE)
                    .unlockedBy("has_floral_vine", has(entry.flower))
                    .save(output);
        }

        shaped(RecipeCategory.DECORATIONS, ModItems.TULIPS_CROWN.get())
                .pattern("cxz")
                .pattern("m m")
                .pattern("zxc")
                .define('m', Items.ORANGE_TULIP)
                .define('x', Items.RED_TULIP)
                .define('z', Items.WHITE_TULIP)
                .define('c', Items.PINK_TULIP)
                .unlockedBy("has_flower", has(Items.ORANGE_TULIP))
                .unlockedBy("has_flower", has(Items.RED_TULIP))
                .unlockedBy("has_flower", has(Items.WHITE_TULIP))
                .unlockedBy("has_flower", has(Items.PINK_TULIP))
                .save(output);


        shaped(RecipeCategory.DECORATIONS, ModItems.BLACK_CROWN.get())
                .pattern(" m ")
                .pattern("m m")
                .pattern(" m ")
                .define('m', Items.WITHER_ROSE)
                .unlockedBy("has_flower", has(Items.WITHER_ROSE))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModItems.BLUE_CROWN.get())
                .pattern(" x ")
                .pattern("m m")
                .pattern(" x ")
                .define('m', Items.BLUE_ORCHID)
                .define('x', Items.CORNFLOWER)
                .unlockedBy("has_flower", has(Items.CORNFLOWER))
                .unlockedBy("has_flower", has(Items.BLUE_ORCHID))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModItems.RED_CROWN.get())
                .pattern(" x ")
                .pattern("m m")
                .pattern(" x ")
                .define('m', Items.POPPY)
                .define('x', Items.ROSE_BUSH)
                .unlockedBy("has_flower", has(Items.POPPY))
                .unlockedBy("has_flower", has(Items.ROSE_BUSH))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModItems.YELLOW_CROWN.get())
                .pattern(" x ")
                .pattern("m m")
                .pattern(" x ")
                .define('m', Items.DANDELION)
                .define('x', Items.SUNFLOWER)
                .unlockedBy("has_flower", has(Items.DANDELION))
                .unlockedBy("has_flower", has(Items.SUNFLOWER))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModItems.PINK_CROWN.get())
                .pattern(" xz")
                .pattern("m m")
                .pattern("zx ")
                .define('m', Items.ALLIUM)
                .define('x', Items.LILAC)
                .define('z', Items.PEONY)
                .unlockedBy("has_flower", has(Items.ALLIUM))
                .unlockedBy("has_flower", has(Items.LILAC))
                .unlockedBy("has_flower", has(Items.PEONY))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModItems.WHITE_CROWN.get())
                .pattern(" xz")
                .pattern("m m")
                .pattern("zx ")
                .define('m', Items.AZURE_BLUET)
                .define('x', Items.OXEYE_DAISY)
                .define('z', Items.LILY_OF_THE_VALLEY)
                .unlockedBy("has_flower", has(Items.AZURE_BLUET))
                .unlockedBy("has_flower", has(Items.OXEYE_DAISY))
                .unlockedBy("has_flower", has(Items.LILY_OF_THE_VALLEY))
                .save(output);

        shaped(RecipeCategory.DECORATIONS, ModItems.LARGE_POT.get())
                .pattern("# #")
                .pattern("###")
                .define('#', Items.BRICK)
                .unlockedBy("has_brick", has(Items.BRICK))
                .save(output);

    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> provider) {
            super(packOutput, provider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName() {
            return "Nameless Trinkets Recipes";
        }
    }

    public record FloralEntry(Item item, Item flower) {
    }

}
