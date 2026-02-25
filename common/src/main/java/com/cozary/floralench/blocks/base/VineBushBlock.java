package com.cozary.floralench.blocks.base;

import com.cozary.floralench.FloralEnchantment;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.function.Supplier;

public abstract class VineBushBlock extends SweetBerryBushBlock {
    private static final VoxelShape BUSHLING_SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 8.0D, 13.0D);
    private static final VoxelShape HALF_GROW_SHAPE = Block.box(3, 0, 3, 13, 10, 13);
    private static final VoxelShape GROW_SHAPE = Block.box(1, 0, 1, 15, 14, 15);

    private final Supplier<Item> flowerItem;
    private final Supplier<Item> vineItem;

    public VineBushBlock(String name, Supplier<Item> flowerItem, Supplier<Item> vineItem) {
        super(Properties.of()
                .setId(ResourceKey.create(
                        Registries.BLOCK,
                        Identifier.fromNamespaceAndPath(FloralEnchantment.MOD_ID, name)
                ))
                .noCollision()
                .randomTicks()
                .strength(0.2F)
                .sound(SoundType.SWEET_BERRY_BUSH)
                .mapColor(MapColor.PLANT)
                .ignitedByLava()
                .pushReaction(PushReaction.DESTROY)
        );
        this.flowerItem = flowerItem;
        this.vineItem = vineItem;
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, Integer.valueOf(0)));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        if (state.getValue(AGE) == 0) {
            return BUSHLING_SHAPE;
        } else if ((state.getValue(AGE) == 1 || state.getValue(AGE) == 2)) {
            return HALF_GROW_SHAPE;
        } else {
            return state.getValue(AGE) == 3 ? GROW_SHAPE : super.getShape(state, worldIn, pos, context);
        }
    }

    @Override
    protected void entityInside(BlockState state, Level level, BlockPos pos, Entity entity, InsideBlockEffectApplier p_405414_, boolean p_451767_) {
        if (entity instanceof LivingEntity && entity.getType() != EntityType.FOX && entity.getType() != EntityType.BEE) {
            entity.makeStuckInBlock(state, new Vec3(0.9F, 0.85D, 0.9F));
        }
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level worldIn, BlockPos pos, Player player, BlockHitResult hit) {
        int i = state.getValue(AGE);
        boolean flag = i == 3;
        if (!flag && player.getMainHandItem().getItem() == Items.BONE_MEAL) {
            return InteractionResult.PASS;
        } else if (i == 2) {
            int j = 1 + worldIn.random.nextInt(4);
            popResource(worldIn, pos, new ItemStack(flowerItem.get(), j));
            worldIn.playSound(null, pos, SoundEvents.GRASS_FALL, SoundSource.BLOCKS, 1.0F, 0.8F + worldIn.random.nextFloat() * 0.4F);
            worldIn.setBlock(pos, state.setValue(AGE, Integer.valueOf(1)), 2);
            return InteractionResult.SUCCESS.withoutItem();
        } else if (i == 3) {
            int j = 1 + worldIn.random.nextInt(3);
            popResource(worldIn, pos, new ItemStack(vineItem.get(), j));
            worldIn.playSound(null, pos, SoundEvents.GRASS_FALL, SoundSource.BLOCKS, 1.0F, 0.8F + worldIn.random.nextFloat() * 0.4F);
            worldIn.setBlock(pos, state.setValue(AGE, Integer.valueOf(2)), 2);
            return InteractionResult.SUCCESS.withoutItem();
        } else {
            return super.useWithoutItem(state, worldIn, pos, player, hit);
        }
    }

    @Override
    protected ItemStack getCloneItemStack(LevelReader p_304655_, BlockPos p_57257_, BlockState p_57258_, boolean p_388022_) {
        return new ItemStack(this);
    }
}
