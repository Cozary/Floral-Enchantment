package com.cozary.floralench.datagen;

import com.cozary.floralench.init.ModBlocks;
import com.cozary.floralench.init.RegistryObject;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModLootTableProvider extends BlockLootSubProvider {
    public ModLootTableProvider(LootTableSubProvider.Context context) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), context);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries()
                .stream()
                .map(e -> (Block) e.get())
                .toList();
    }

    @Override
    protected void generate() {

        for (RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries()) {
            this.dropSelf(block.get());
        }

    }


}
