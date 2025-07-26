package com.xiaomu.xiaomu_mod.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class ObsidianBucket extends Item {
    public ObsidianBucket(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos pos = context.getBlockPos();
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        Direction side = context.getSide();

        if (!world.isClient()) {
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
            BlockState blockState = world.getBlockState(pos1);
            String name = blockState.getBlock().getName().getString();
            if (isRightBlock(blockState)) {
                world.setBlockState(pos1, Blocks.OBSIDIAN.getDefaultState());
                if (player != null && !player.isCreative()) {
                    ItemStack stack = context.getStack();
                    stack.setCount(stack.getCount() - 1);
                    player.giveItemStack(new ItemStack(Items.BUCKET));
                }
            }
        }
        return super.useOnBlock(context);
    }

    private boolean isRightBlock(BlockState blockState) {
        return blockState.isOf(Blocks.AIR) || blockState.isOf(Blocks.VOID_AIR);
    }
}

