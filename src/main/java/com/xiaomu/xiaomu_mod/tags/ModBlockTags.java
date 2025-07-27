package com.xiaomu.xiaomu_mod.tags;

import com.xiaomu.xiaomu_mod.XiaomuMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {

    public static final TagKey<Block> CANNOT_BE_PICKED_UP_WITH_BOTTOMLESS_BUCKET = of("cannot_be_picked_up_with_bottomless_bucket");
    public static final TagKey<Block> FLUID = of("fluid");

    private static TagKey<Block> of(String id){
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(XiaomuMod.MOD_ID, id));
    };

    public static void registerBlockTags(){
        XiaomuMod.LOGGER.info("Registering Block Tags");
    }
}
