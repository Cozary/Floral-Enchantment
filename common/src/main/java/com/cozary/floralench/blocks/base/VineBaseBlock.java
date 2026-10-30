package com.cozary.floralench.blocks.base;

import com.cozary.floralench.FloralEnchantment;
import net.minecraft.advancements.triggers.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.VineBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;

public class VineBaseBlock extends VineBlock {

    public static final BooleanProperty SHEARED = BooleanProperty.create("sheared");

    public VineBaseBlock(String name) {
        super(Properties.of()
                .setId(ResourceKey.create(
                        Registries.BLOCK,
                        Identifier.fromNamespaceAndPath(FloralEnchantment.MOD_ID, name)
                ))
                .noCollision()
                .randomTicks()
                .strength(0.2F)
                .sound(SoundType.VINE)
                .mapColor(MapColor.PLANT)
                .replaceable()
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY)
        );
        this.registerDefaultState(this.defaultBlockState().setValue(SHEARED, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(SHEARED);
    }

    @Override
    protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (stack.is(Items.SHEARS) || stack.getItem() instanceof ShearsItem) {
            if (!state.getValue(SHEARED)) {
                level.playSound(player, pos, SoundEvents.GROWING_PLANT_CROP, SoundSource.BLOCKS, 1.0F, 1.0F);
                BlockState newState = state.setValue(SHEARED, true);
                level.setBlockAndUpdate(pos, newState);
                level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, newState));
                if (player instanceof ServerPlayer serverPlayer) {
                    CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger(serverPlayer, pos, stack);
                }
                if (player != null) {
                    stack.hurtAndBreak(1, player, hand.asEquipmentSlot());
                }
                return InteractionResult.SUCCESS;
            }
        }
        return super.useItemOn(stack, state, level, pos, player, hand, hitResult);
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (state.getValue(SHEARED)) {
            return;
        }
        super.randomTick(state, level, pos, random);
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return !state.getValue(SHEARED);
    }
}
