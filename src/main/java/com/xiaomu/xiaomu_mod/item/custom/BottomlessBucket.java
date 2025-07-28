package com.xiaomu.xiaomu_mod.item.custom;

import com.xiaomu.xiaomu_mod.tags.ModBlockTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.event.EntityPositionSource;

public class BottomlessBucket extends Item {
    public BottomlessBucket(Settings settings) {super(settings);}

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos pos = context.getBlockPos();
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        Direction side = context.getSide();

        BlockState blockState = world.getBlockState(pos);
        BlockPos blockPos_north = pos.north(1);
        BlockPos blockPos_south = pos.south(1);
        BlockPos blockPos_west = pos.west(1);
        BlockPos blockPos_east = pos.east(1);
        BlockState blockState_north = world.getBlockState(blockPos_north);
        BlockState blockState_south = world.getBlockState(blockPos_south);
        BlockState blockState_west = world.getBlockState(blockPos_west);
        BlockState blockState_east = world.getBlockState(blockPos_east);

        if (Screen.hasControlDown()) {
            world.playSound(player, pos, SoundEvents.ITEM_BUCKET_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                    for (int k = 0; k < 5; k++){
                        BlockPos pos_shift_1 = pos.down(i).south(j-2).west(k-2);
                        BlockState blockState1 = world.getBlockState(pos_shift_1);
                        if (!isWrongBlock(blockState1)) {
                            world.setBlockState(pos_shift_1, Blocks.AIR.getDefaultState());
                        }
                    }
                }
            }
        }else {
            if (side == Direction.NORTH && blockState_north.isIn(ModBlockTags.FLUID)){
                if (isLava(blockState_north)) {
                    world.playSound(player, blockPos_north, SoundEvents.ITEM_BUCKET_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }else {
                    world.playSound(player, blockPos_north, SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }
                world.setBlockState(blockPos_north, Blocks.AIR.getDefaultState());
            }else if (side == Direction.SOUTH && blockState_south.isIn(ModBlockTags.FLUID)){
                if (isLava(blockState_south)) {world.playSound(player, blockPos_south, SoundEvents.ITEM_BUCKET_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }else {
                    world.playSound(player, blockPos_north, SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }
                world.setBlockState(blockPos_south, Blocks.AIR.getDefaultState());
            }else if (side == Direction.WEST && blockState_west.isIn(ModBlockTags.FLUID)){
                if (isLava(blockState_west)) {
                    world.playSound(player, blockPos_west, SoundEvents.ITEM_BUCKET_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }else {
                    world.playSound(player, blockPos_west, SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }
                world.setBlockState(blockPos_west, Blocks.AIR.getDefaultState());
            }else if (side == Direction.EAST && blockState_east.isIn(ModBlockTags.FLUID)) {
                if (isLava(blockState_east)) {
                    world.playSound(player, blockPos_east, SoundEvents.ITEM_BUCKET_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }else {
                    world.playSound(player, blockPos_east, SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundCategory.BLOCKS, 1.0F, 1.0F);
                }
                world.setBlockState(blockPos_east, Blocks.AIR.getDefaultState());
            }else {
                if (!isWrongBlock(blockState)) {
                    world.playSound(player, pos, SoundEvents.ITEM_BUCKET_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    world.setBlockState(pos, Blocks.AIR.getDefaultState());
                }
            }
        }

        return super.useOnBlock(context);
    }

    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        user.playSound(SoundEvents.ITEM_BUCKET_FILL);
        entity.remove(Entity.RemovalReason.DISCARDED);
        return  ActionResult.PASS;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand){
        if (Screen.hasAltDown()) {
            user.playSound(SoundEvents.ITEM_BUCKET_FILL);
            user.kill();
        }
        return TypedActionResult.pass(user.getStackInHand(hand));
    }

    private boolean isWrongBlock(BlockState blockState){
        return blockState.isIn(ModBlockTags.CANNOT_BE_PICKED_UP_WITH_BOTTOMLESS_BUCKET);
    }

    private boolean isLava(BlockState blockState){
        return !blockState.isOf(Blocks.LAVA);
    }
}