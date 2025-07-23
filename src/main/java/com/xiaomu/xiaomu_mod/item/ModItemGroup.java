package com.xiaomu.xiaomu_mod.item;

import com.xiaomu.xiaomu_mod.XiaomuMod;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final RegistryKey<ItemGroup> RECORDS_GROUP = register("music_disc_group");
    public static final RegistryKey<ItemGroup> OTHER_GROUP = register("other_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(XiaomuMod.MOD_ID, id));
    }

    public static void registerRecordsGroup(){
        Registry.register(Registries.ITEM_GROUP, RECORDS_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 0)
                        .displayName(Text.translatable("itemGroup.xiaomu_mod.music_disc_group"))
                        .icon(() -> new ItemStack(Blocks.JUKEBOX))
                        .entries((displayContext, entries) -> {
                            //Jukebox
                            entries.add(Blocks.JUKEBOX);
                            //Japanese
                            entries.add(ModItems.MAID_S1_OPENING);
                            entries.add(ModItems.MAID_S1_OPENING_TV_VER);
                            entries.add(ModItems.MAID_S1_ENDING);
                            entries.add(ModItems.MAID_S1_ENDING_TV_VER);
                            entries.add(ModItems.MAID_S2_OPENING);
                            entries.add(ModItems.MAID_S2_ENDING);
                            entries.add(ModItems.DEER_S1_OPENING);
                            entries.add(ModItems.CAFE_S1_OPENING);
                            entries.add(ModItems.CAFE_S1_OPENING_TV_VER);
                            entries.add(ModItems.CAFE_S1_ENDING);
                            entries.add(ModItems.CAFE_S1_ENDING_TV_VER);
                            entries.add(ModItems.SO_LUCKY);
                            entries.add(ModItems.AT_THE_MERCY_OF_GOD);
                            entries.add(ModItems.MAGIC_TV_VER_S1_OPENING);
                            entries.add(ModItems.MAGIC_TV_VER_S1_EPISODE_1_TO_2_ENDING);
                            entries.add(ModItems.MAGIC_TV_VER_S1_EPISODE_3_TO_11_ENDING);
                            //English
                            entries.add(ModItems.PASSING_MEMORIES);
                            entries.add(ModItems.CALL_OF_SILENCE);
                            entries.add(ModItems.DUVET);
                            entries.add(ModItems.I_LOVE_YOU_SO);
                            entries.add(ModItems.DAY_LIGHT);
                        }).build());

        Registry.register(Registries.ITEM_GROUP, OTHER_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 0)
                        .displayName(Text.translatable("itemGroup.xiaomu_mod.other_group"))
                        .icon(() -> new ItemStack(ModItems.TOHRU_MEAT))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.TOHRU_MEAT);
                            entries.add(ModItems.COOKED_TOHRU_MEAT);
                            entries.add(ModItems.KOBAYASHI_BEER_CAN_FULL);
                            entries.add(ModItems.KOBAYASHI_BEER_CAN_EMPTY);
                        }).build());

        XiaomuMod.LOGGER.info("Registering Records Group");
    }
}

