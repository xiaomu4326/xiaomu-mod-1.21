package com.xiaomu.xiaomu_mod.item.custom;

import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class BottomlessLavaBucket extends Item{
    public BottomlessLavaBucket(Settings settings) {super(settings);}

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos pos = context.getBlockPos();
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        Direction side = context.getSide();


        if (Screen.hasControlDown()) {
            world.playSound(player, pos, SoundEvents.ITEM_BUCKET_EMPTY, SoundCategory.BLOCKS, 1.0F, 1.0F);
            for (int i = 0; i <= 5; i++){
                for (int j = 0; j < 5; j++){
                    for (int k = 0; k < 5; k++){
                        BlockPos pos_shift_1 = pos.up(i).south(j-2).west(k-2);
                        if (world.getBlockState(pos_shift_1).isOf(Blocks.AIR) | world.getBlockState(pos_shift_1).isOf(Blocks.VOID_AIR)) {
                            world.setBlockState(pos_shift_1, Blocks.LAVA.getDefaultState());
                        }else if (world.getBlockState(pos_shift_1).isOf(Blocks.LAVA)) {
                            world.setBlockState(pos_shift_1, Blocks.LAVA.getDefaultState());
                        }
                    }
                }
            }
        }else {
            BlockPos pos1 = pos;
            if (side == Direction.DOWN) {
                pos1 = pos.down(1);
            }else if (side == Direction.UP) {
                pos1 = pos.up(1);
            }else if (side == Direction.NORTH) {
                pos1 = pos.north(1);
            }else if (side == Direction.SOUTH) {
                pos1 = pos.south(1);
            }else if (side == Direction.EAST) {
                pos1 = pos.east(1);
            }else if (side == Direction.WEST) {
                pos1 = pos.west(1);
            }
            if (world.getBlockState(pos1).isOf(Blocks.AIR) | world.getBlockState(pos1).isOf(Blocks.VOID_AIR)) {
                world.playSound(player, pos1, SoundEvents.ITEM_BUCKET_EMPTY, SoundCategory.BLOCKS, 1.0F, 1.0F);
                world.setBlockState(pos1, Blocks.LAVA.getDefaultState());
            }else if (world.getBlockState(pos1).isOf(Blocks.LAVA)) {
                world.playSound(player, pos1, SoundEvents.ITEM_BUCKET_EMPTY, SoundCategory.BLOCKS, 1.0F, 1.0F);
                world.setBlockState(pos1, Blocks.LAVA.getDefaultState());
            }
        }

        return super.useOnBlock(context);
    }
}
