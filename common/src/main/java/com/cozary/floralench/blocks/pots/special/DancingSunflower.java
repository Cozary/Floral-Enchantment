package com.cozary.floralench.blocks.pots.special;

import com.cozary.floralench.blocks.base.LargePot;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import java.util.Optional;

import static net.minecraft.world.level.block.JukeboxBlock.HAS_RECORD;


public class DancingSunflower extends LargePot {
    Optional<BlockPos> jukeboxPosition;
    BlockState jukebox;

    @Override
    public InteractionResult use(BlockState state, Level worldIn, BlockPos pos, Player player, InteractionHand handIn, BlockHitResult hit) {
        ItemStack itemstack = player.getItemInHand(handIn);
        Item item = itemstack.getItem();
        ItemStack item1 = Items.SUNFLOWER.getDefaultInstance();
        Direction direction1 = state.getValue(FACING);
        if (!worldIn.isClientSide) {
            if (item == Items.AIR) {

                worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_POT.get().defaultBlockState().setValue(LargePot.FACING, direction1));
                player.setItemInHand(handIn, item1);
            }
        }
        return InteractionResult.CONSUME;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel worldIn, BlockPos pos, RandomSource random) {
        Direction direction1 = state.getValue(FACING);
        if (!worldIn.isClientSide) {
            jukeboxPosition = findNearestRepellent(worldIn, pos);
            if (jukeboxPosition.isPresent()) {
                jukebox = worldIn.getBlockState(jukeboxPosition.get());
                if (!jukebox.getValue(HAS_RECORD)) {
                    if (worldIn.getBlockState(jukeboxPosition.get()).is(Blocks.JUKEBOX) && this.jukeboxPosition.get().closerThan(pos, 11D)) {
                        worldIn.setBlockAndUpdate(pos, ModBlocks.LARGE_SUNFLOWER_POT.get().defaultBlockState().setValue(LargePot.FACING, direction1));
                    }
                }
            }
        }
    }

    private Optional<BlockPos> findNearestRepellent(ServerLevel p_26665_, BlockPos pos) {
        return BlockPos.findClosestMatch(pos, 11, 0, (block) -> {
            return p_26665_.getBlockState(block).is(Blocks.JUKEBOX);
        });
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return true;
    }


}