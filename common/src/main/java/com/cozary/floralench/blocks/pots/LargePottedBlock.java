package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.blocks.base.LargePotBase;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

import java.util.function.Supplier;

public class LargePottedBlock extends LargePotBase {
    private final Supplier<Item> content;
    private final Supplier<Block> previousBlock;
    private final Supplier<Block> nextBlock;

    public LargePottedBlock(String name, Supplier<Item> content, Supplier<Block> previousBlock, Supplier<Block> nextBlock) {
        super(name);
        this.content = content;
        this.previousBlock = previousBlock;
        this.nextBlock = nextBlock;
    }

    public LargePottedBlock(String name, Supplier<Item> content, Supplier<Block> previousBlock) {
        this(name, content, previousBlock, null);
    }

    @Override
    protected InteractionResult useItemOn(ItemStack itemStack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (this.nextBlock != null && itemStack.is(this.content.get())) {
            Block next = this.nextBlock.get();
            if (next != null) {
                if (!level.isClientSide()) {
                    Direction direction = state.getValue(FACING);
                    level.setBlockAndUpdate(pos, next.defaultBlockState().setValue(LargePotBase.FACING, direction));
                    level.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
                    itemStack.consume(1, player);
                }
                return InteractionResult.SUCCESS;
            }
        }
        return super.useItemOn(itemStack, state, level, pos, player, hand, hitResult);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (player.getItemInHand(InteractionHand.MAIN_HAND).isEmpty() && this.previousBlock != null) {
            Block prev = this.previousBlock.get();
            if (prev != null) {
                if (!level.isClientSide()) {
                    Direction direction = state.getValue(FACING);
                    level.setBlockAndUpdate(pos, prev.defaultBlockState().setValue(LargePotBase.FACING, direction));
                    ItemStack flowerStack = new ItemStack(this.content.get());
                    if (!player.addItem(flowerStack)) {
                        player.drop(flowerStack, false);
                    }
                    level.gameEvent(player, GameEvent.BLOCK_CHANGE, pos);
                }
                return InteractionResult.SUCCESS;
            }
        }
        return super.useWithoutItem(state, level, pos, player, hitResult);
    }
}
