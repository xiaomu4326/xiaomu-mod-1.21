package com.xiaomu.xiaomu_mod.item.custom;

import net.minecraft.block.BlockState;
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

public class BottomlessObsidianBucket extends Item {
    public BottomlessObsidianBucket(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos pos = context.getBlockPos();
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        Direction side = context.getSide();
        float PlayerYaw = player.getYaw();

        if (Screen.hasControlDown()) {
            boolean isRightBlock = true;
            if (side == Direction.DOWN) {
                pos = pos.down(1);
            } else if (side == Direction.UP) {
                pos = pos.up(1);
            } else if (side == Direction.NORTH) {
                pos = pos.north(1);
            } else if (side == Direction.SOUTH) {
                pos = pos.south(1);
            } else if (side == Direction.EAST) {
                pos = pos.east(1);
            } else if (side == Direction.WEST) {
                pos = pos.west(1);
            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    BlockPos area_pos = pos.up(i).east(j - 2);
                    if (!(world.getBlockState(area_pos).isOf(Blocks.AIR) | world.getBlockState(area_pos).isOf(Blocks.VOID_AIR))) {
                        isRightBlock = false;
                    }
                }
            }
            if (isRightBlock) {
                world.playSound(player, pos, SoundEvents.BLOCK_STONE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                if ((45.0 <= PlayerYaw && PlayerYaw <= 135) | (-135.0 < PlayerYaw && PlayerYaw < -45.0)) {
                    for (int k = 0; k < 5; k++) {
                        for (int a = 0; a < 5; a++) {
                            BlockPos area_pos_a = pos.up(a).south(k - 2);
                            world.setBlockState(area_pos_a, Blocks.OBSIDIAN.getDefaultState());
                        }
                    }
                    for (int b = 0; b < 3; b++) {
                        for (int c = 0; c < 3; c++) {
                            BlockPos area_pos_b = pos.up(b + 1).south(c - 1);
                            world.setBlockState(area_pos_b, Blocks.AIR.getDefaultState());
                        }
                    }
                    world.setBlockState(pos.up(1), Blocks.FIRE.getDefaultState());
                } else {
                    for (int k = 0; k < 5; k++) {
                        for (int a = 0; a < 5; a++) {
                            BlockPos area_pos_a = pos.up(a).east(k - 2);
                            world.setBlockState(area_pos_a, Blocks.OBSIDIAN.getDefaultState());
                        }
                    }
                    for (int b = 0; b < 3; b++) {
                        for (int c = 0; c < 3; c++) {
                            BlockPos area_pos_b = pos.up(b + 1).east(c - 1);
                            world.setBlockState(area_pos_b, Blocks.AIR.getDefaultState());
                        }
                    }
                    world.setBlockState(pos.up(1), Blocks.FIRE.getDefaultState());
                }
            }
        }else if (Screen.hasAltDown()) {
            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++){
                    for (int k = 0; k < 5; k++){
                        BlockPos pos_alt = pos.up(i+1).south(j-2).west(k-2);
                        if (world.getBlockState(pos_alt).isOf(Blocks.AIR) | world.getBlockState(pos_alt).isOf(Blocks.VOID_AIR)) {
                            world.setBlockState(pos_alt, Blocks.OBSIDIAN.getDefaultState());
                        }
                    }
                }
            }
        } else {
            BlockPos pos1 = pos;
            if (side == Direction.DOWN) {
                pos1 = pos.down(1);
            } else if (side == Direction.UP) {
                pos1 = pos.up(1);
            } else if (side == Direction.NORTH) {
                pos1 = pos.north(1);
            } else if (side == Direction.SOUTH) {
                pos1 = pos.south(1);
            } else if (side == Direction.EAST) {
                pos1 = pos.east(1);
            } else if (side == Direction.WEST) {
                pos1 = pos.west(1);
            }
            BlockState blockState = world.getBlockState(pos1);
            if (isRightBlock(blockState)) {
                world.playSound(player, pos1, SoundEvents.BLOCK_STONE_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                world.setBlockState(pos1, Blocks.OBSIDIAN.getDefaultState());
            }
        }
        return super.useOnBlock(context);
    }


    private boolean isRightBlock(BlockState blockState) {
        return blockState.isOf(Blocks.AIR) | blockState.isOf(Blocks.VOID_AIR);
    }
}