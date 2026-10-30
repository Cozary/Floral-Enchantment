package com.cozary.floralench.blocks.pots.special;

import com.cozary.floralench.blocks.base.LargePotBase;
import com.cozary.floralench.init.ModBlocks;
import com.google.common.collect.Maps;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

import java.util.Map;
import java.util.function.Supplier;

public class LargePot extends LargePotBase {

    private static final Map<Item, Supplier<Block>> CONTENT_TO_POT = Maps.newHashMap();

    static {
        CONTENT_TO_POT.put(Items.ALLIUM, () -> ModBlocks.LARGE_ALLIUM_POT.get());
        CONTENT_TO_POT.put(Items.AZURE_BLUET, () -> ModBlocks.LARGE_AZURE_BLUET_POT.get());
        CONTENT_TO_POT.put(Items.BLUE_ORCHID, () -> ModBlocks.LARGE_BLUE_ORCHID_POT.get());
        CONTENT_TO_POT.put(Items.CORNFLOWER, () -> ModBlocks.LARGE_CORNFLOWER_POT.get());
        CONTENT_TO_POT.put(Items.DANDELION, () -> ModBlocks.LARGE_DANDELION_POT.get());
        CONTENT_TO_POT.put(Items.LILAC, () -> ModBlocks.LARGE_LILAC_POT.get());
        CONTENT_TO_POT.put(Items.LILY_OF_THE_VALLEY, () -> ModBlocks.LARGE_LILY_OF_THE_VALLEY_POT.get());
        CONTENT_TO_POT.put(Items.ORANGE_TULIP, () -> ModBlocks.LARGE_ORANGE_TULIP_POT.get());
        CONTENT_TO_POT.put(Items.OXEYE_DAISY, () -> ModBlocks.LARGE_OXEYE_DAISY_POT.get());
        CONTENT_TO_POT.put(Items.PEONY, () -> ModBlocks.LARGE_PEONY_POT.get());
        CONTENT_TO_POT.put(Items.PINK_TULIP, () -> ModBlocks.LARGE_PINK_TULIP_POT.get());
        CONTENT_TO_POT.put(Items.POPPY, () -> ModBlocks.LARGE_POPPY_POT.get());
        CONTENT_TO_POT.put(Items.RED_TULIP, () -> ModBlocks.LARGE_RED_TULIP_POT.get());
        CONTENT_TO_POT.put(Items.ROSE_BUSH, () -> ModBlocks.LARGE_ROSE_BUSH_POT.get());
        CONTENT_TO_POT.put(Items.SUNFLOWER, () -> ModBlocks.LARGE_SUNFLOWER_POT.get());
        CONTENT_TO_POT.put(Items.WHITE_TULIP, () -> ModBlocks.LARGE_WHITE_TULIP_POT.get());
        CONTENT_TO_POT.put(Items.WITHER_ROSE, () -> ModBlocks.LARGE_WITHER_ROSE_POT.get());
        CONTENT_TO_POT.put(Items.TORCHFLOWER, () -> ModBlocks.LARGE_TORCHFLOWER_POT.get());
        CONTENT_TO_POT.put(Items.PITCHER_PLANT, () -> ModBlocks.LARGE_PITCHER_PLANT_POT.get());
        CONTENT_TO_POT.put(Items.FLOWERING_AZALEA, () -> ModBlocks.LARGE_AZALEA_POT.get());
        CONTENT_TO_POT.put(Items.SPORE_BLOSSOM, () -> ModBlocks.LARGE_SPORE_BLOSSOM_POT.get());
        CONTENT_TO_POT.put(Items.OPEN_EYEBLOSSOM, () -> ModBlocks.LARGE_OPEN_EYEBLOSSOM_POT.get());
        CONTENT_TO_POT.put(Items.CLOSED_EYEBLOSSOM, () -> ModBlocks.LARGE_CLOSED_EYEBLOSSOM_POT.get());
        CONTENT_TO_POT.put(Items.CACTUS, () -> ModBlocks.LARGE_CACTUS_FLOWER_POT.get());
        CONTENT_TO_POT.put(Items.CACTUS_FLOWER, () -> ModBlocks.LARGE_CACTUS_FLOWER_POT.get());
        CONTENT_TO_POT.put(Items.GOLDEN_DANDELION, () -> ModBlocks.LARGE_GOLDEN_DANDELION_POT.get());
    }

    public LargePot() {
        super("large_pot");
    }

    @Override
    protected InteractionResult useItemOn(ItemStack itemStack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        Supplier<Block> potSupplier = CONTENT_TO_POT.get(itemStack.getItem());
        if (potSupplier != null) {
            Block potBlock = potSupplier.get();
            if (potBlock != null) {
                if (!level.isClientSide()) {
                    Direction direction = state.getValue(FACING);
                    level.setBlockAndUpdate(pos, potBlock.defaultBlockState().setValue(LargePotBase.FACING, direction));
                    level.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
                    player.awardStat(Stats.POT_FLOWER);
                    itemStack.consume(1, player);
                }
                return InteractionResult.SUCCESS;
            }
        }

        return super.useItemOn(itemStack, state, level, pos, player, hand, hitResult);
    }
}
