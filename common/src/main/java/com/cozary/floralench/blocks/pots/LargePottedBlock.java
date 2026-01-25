package com.cozary.floralench.blocks.pots;

import com.cozary.floralench.blocks.base.LargePotBase;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
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
    public InteractionResult useWithoutItem(BlockState state, Level worldIn, BlockPos pos, Player player, BlockHitResult hit) {
        ItemStack itemstack = player.getMainHandItem();
        Item item = itemstack.getItem();
        Direction direction = state.getValue(FACING);

        if (!worldIn.isClientSide()) {
            if (item == Items.AIR) {
                worldIn.setBlockAndUpdate(pos, previousBlock.get().defaultBlockState().setValue(LargePotBase.FACING, direction));
                player.setItemInHand(InteractionHand.MAIN_HAND, new ItemStack(content.get()));
                return InteractionResult.CONSUME;
            } else if (nextBlock != null && item == content.get()) {
                worldIn.setBlockAndUpdate(pos, nextBlock.get().defaultBlockState().setValue(LargePotBase.FACING, direction));
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                return InteractionResult.CONSUME;
            }
        }
        return InteractionResult.CONSUME;
    }
}
