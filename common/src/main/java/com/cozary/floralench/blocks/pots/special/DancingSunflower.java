package com.cozary.floralench.blocks.pots.special;

import com.cozary.floralench.blocks.pots.LargePottedBlock;
import com.cozary.floralench.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;

import static net.minecraft.world.level.block.JukeboxBlock.HAS_RECORD;


public class DancingSunflower extends LargePottedBlock {
    Optional<BlockPos> jukeboxPosition;
    BlockState jukebox;

    public DancingSunflower() {
        super("dancing_sunflower", () -> Items.SUNFLOWER, ModBlocks.LARGE_POT);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel worldIn, BlockPos pos, RandomSource random) {
        Direction direction1 = state.getValue(FACING);
        if (!worldIn.isClientSide()) {
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