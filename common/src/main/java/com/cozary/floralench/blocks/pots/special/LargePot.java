package com.cozary.floralench.blocks.pots.special;

import com.cozary.floralench.blocks.base.LargePotBase;
import com.cozary.floralench.blocks.pots.*;
import com.cozary.floralench.init.ModBlocks;
import com.google.common.collect.Maps;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import java.util.Map;
import java.util.function.Supplier;

public class LargePot extends LargePotBase {

    private static final Map<Item, Supplier<Block>> CONTENT_TO_POT = Maps.newHashMap();

    static {
        CONTENT_TO_POT.put(Items.ALLIUM, ModBlocks.LARGE_ALLIUM_POT);
        CONTENT_TO_POT.put(Items.AZURE_BLUET, ModBlocks.LARGE_AZURE_BLUET_POT);
        CONTENT_TO_POT.put(Items.BLUE_ORCHID, ModBlocks.LARGE_BLUE_ORCHID_POT);
        CONTENT_TO_POT.put(Items.CORNFLOWER, ModBlocks.LARGE_CORNFLOWER_POT);
        CONTENT_TO_POT.put(Items.DANDELION, ModBlocks.LARGE_DANDELION_POT);
        CONTENT_TO_POT.put(Items.LILAC, ModBlocks.LARGE_LILAC_POT);
        CONTENT_TO_POT.put(Items.LILY_OF_THE_VALLEY, ModBlocks.LARGE_LILY_OF_THE_VALLEY_POT);
        CONTENT_TO_POT.put(Items.ORANGE_TULIP, ModBlocks.LARGE_ORANGE_TULIP_POT);
        CONTENT_TO_POT.put(Items.OXEYE_DAISY, ModBlocks.LARGE_OXEYE_DAISY_POT);
        CONTENT_TO_POT.put(Items.PEONY, ModBlocks.LARGE_PEONY_POT);
        CONTENT_TO_POT.put(Items.PINK_TULIP, ModBlocks.LARGE_PINK_TULIP_POT);
        CONTENT_TO_POT.put(Items.POPPY, ModBlocks.LARGE_POPPY_POT);
        CONTENT_TO_POT.put(Items.RED_TULIP, ModBlocks.LARGE_RED_TULIP_POT);
        CONTENT_TO_POT.put(Items.ROSE_BUSH, ModBlocks.LARGE_ROSE_BUSH_POT);
        CONTENT_TO_POT.put(Items.SUNFLOWER, ModBlocks.LARGE_SUNFLOWER_POT);
        CONTENT_TO_POT.put(Items.WHITE_TULIP, ModBlocks.LARGE_WHITE_TULIP_POT);
        CONTENT_TO_POT.put(Items.WITHER_ROSE, ModBlocks.LARGE_WITHER_ROSE_POT);
        CONTENT_TO_POT.put(Items.TORCHFLOWER, ModBlocks.LARGE_TORCHFLOWER_POT);
        CONTENT_TO_POT.put(Items.PITCHER_PLANT, ModBlocks.LARGE_PITCHER_PLANT_POT);
        CONTENT_TO_POT.put(Items.FLOWERING_AZALEA, ModBlocks.LARGE_AZALEA_POT);
        CONTENT_TO_POT.put(Items.SPORE_BLOSSOM, ModBlocks.LARGE_SPORE_BLOSSOM_POT);
        CONTENT_TO_POT.put(Items.OPEN_EYEBLOSSOM, ModBlocks.LARGE_OPEN_EYEBLOSSOM_POT);
        CONTENT_TO_POT.put(Items.CLOSED_EYEBLOSSOM, ModBlocks.LARGE_CLOSED_EYEBLOSSOM_POT);
        CONTENT_TO_POT.put(Items.CACTUS, ModBlocks.LARGE_CACTUS_FLOWER_POT);
    }

    public LargePot() {
        super("large_pot");
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level worldIn, BlockPos pos, Player player, BlockHitResult hit) {
        ItemStack itemstack = player.getMainHandItem();
        Item item = itemstack.getItem();
        Direction direction = state.getValue(FACING);

        if (CONTENT_TO_POT.containsKey(item)) {
            if (!worldIn.isClientSide()) {
                worldIn.setBlockAndUpdate(pos, CONTENT_TO_POT.get(item).get().defaultBlockState().setValue(LargePotBase.FACING, direction));
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
            }
            return InteractionResult.CONSUME;
        }

        return InteractionResult.PASS;
    }
}
