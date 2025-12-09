package com.cozary.floralench.datagen;

import com.cozary.floralench.init.ModBlocks;
import com.cozary.floralench.init.RegistryObject;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModLootTableProvider extends BlockLootSubProvider {
    public ModLootTableProvider(HolderLookup.Provider lookupProvider) {

        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), lookupProvider);
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
