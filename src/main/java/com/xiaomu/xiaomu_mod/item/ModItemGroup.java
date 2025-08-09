package com.xiaomu.xiaomu_mod.item;

import com.xiaomu.xiaomu_mod.XiaomuMod;
import com.xiaomu.xiaomu_mod.block.ModBlocks;
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

    public static final RegistryKey<ItemGroup> MUSIC_DISC_GROUP = register("music_disc_group");

    public static final RegistryKey<ItemGroup> FOOD_GROUP = register("food_group");

    public static final RegistryKey<ItemGroup> OTHER_GROUP = register("other_group");



    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(XiaomuMod.MOD_ID, id));
    }

    public static void registerRecordsGroup(){
        Registry.register(Registries.ITEM_GROUP, MUSIC_DISC_GROUP,
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
                            entries.add(ModItems.MAID_S2_OPENING_TV_VER);
                            entries.add(ModItems.MAID_S2_ENDING);
                            entries.add(ModItems.MAID_S2_ENDING_TV_VER);
                            entries.add(ModItems.MAID_S2_EPISODE_3_ENDING);
                            entries.add(ModItems.DEER_S1_OPENING);
                            entries.add(ModItems.DEER_S1_OPENING_TV_VER);
                            entries.add(ModItems.CAFE_S1_OPENING);
                            entries.add(ModItems.CAFE_S1_OPENING_TV_VER);
                            entries.add(ModItems.CAFE_S1_ENDING);
                            entries.add(ModItems.CAFE_S1_ENDING_TV_VER);
                            entries.add(ModItems.SO_LUCKY);
                            entries.add(ModItems.AT_THE_MERCY_OF_GOD);
                            entries.add(ModItems.MAGIC_TV_VER_S1_OPENING);
                            entries.add(ModItems.MAGIC_TV_VER_S1_EPISODE_1_TO_2_ENDING);
                            entries.add(ModItems.MAGIC_TV_VER_S1_EPISODE_3_TO_11_ENDING);
                            entries.add(ModItems.MAGIC_MOVIE_VER_S1_TO_S2_OPENING);
                            entries.add(ModItems.MAGIC_MOVIE_VER_S2_ENDING);
                            entries.add(ModItems.MAGIC_MOVIE_VER_S3_OPENING);
                            entries.add(ModItems.MAGIC_MOVIE_VER_S3_EPISODE);
                            entries.add(ModItems.MAGIC_MOVIE_VER_S3_ENDING);
                            entries.add(ModItems.SENREN_BANKA_OPENING);
                            entries.add(ModItems.SENREN_BANKA_OPENING_GAME_VER);
                            entries.add(ModItems.SENREN_BANKA_YOSHINO);
                            entries.add(ModItems.SENREN_BANKA_YOSHINO_INSTRUMENT_VER);
                            entries.add(ModItems.SENREN_BANKA_YOSHINO_QUIET_VER);
                            entries.add(ModItems.SENREN_BANKA_YOSHINO_ENDING);
                            entries.add(ModItems.SENREN_BANKA_MURASAME);
                            entries.add(ModItems.SENREN_BANKA_MURASAME_INSTRUMENT_VER);
                            entries.add(ModItems.SENREN_BANKA_MURASAME_QUIET_VER);
                            entries.add(ModItems.SENREN_BANKA_MURASAME_ENDING);
                            entries.add(ModItems.SENREN_BANKA_MAKO);
                            entries.add(ModItems.SENREN_BANKA_MAKO_ENDING);
                            entries.add(ModItems.SENREN_BANKA_LENA);
                            entries.add(ModItems.SENREN_BANKA_LENA_ENDING);
                            entries.add(ModItems.RIDDLE_JOKER_OPENING);
                            entries.add(ModItems.SLEEP_S1_OPENING);
                            entries.add(ModItems.SISTER_S1_OPENING);
                            entries.add(ModItems.SISTER_S1_OPENING_TV_VER);
                            //English
                            //mihoyo
                            entries.add(ModItems.PASSING_MEMORIES);
                            entries.add(ModItems.THE_ROAD_NOT_TAKEN);
                            entries.add(ModItems.EMBERFIRE);
                            entries.add(ModItems.HOPE_IS_THE_THING_WITH_FEATHERS);
                            entries.add(ModItems.SWAY_TO_MY_BEAT_IN_COSMOS);
                            //other
                            entries.add(ModItems.CALL_OF_SILENCE);
                            entries.add(ModItems.DUVET);
                            entries.add(ModItems.I_LOVE_YOU_SO);
                            entries.add(ModItems.LEVITATING);
                            entries.add(ModItems.COLORS);
                            entries.add(ModItems.RIDE_OR_DIE);
                            entries.add(ModItems.WHERE_WE_STARTED);
                            entries.add(ModItems.PAST_LIVES);
                            entries.add(ModItems.UMBRELLA);
                            //Chinese
                            //mihoyo
                            entries.add(ModItems.DEVASTATION_AND_REDEMPTION);
                            //instrumental music
                            //mihoyo
                            entries.add(ModItems.THE_PARADE_OF_FLYING_SQUIRRELS);
                            entries.add(ModItems.SURASTHANA_FANTASIA);
                            //other
                            entries.add(ModItems.DAY_LIGHT);
                        }).build());

        Registry.register(Registries.ITEM_GROUP, FOOD_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 0)
                        .displayName(Text.translatable("itemGroup.xiaomu_mod.food_group"))
                        .icon(() -> new ItemStack(ModItems.TOHRU_MEAT))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.TOHRU_MEAT);
                            entries.add(ModItems.COOKED_TOHRU_MEAT);
                            entries.add(ModItems.KOBAYASHI_BEER_CAN_FULL);
                            entries.add(ModItems.KOBAYASHI_BEER_CAN_EMPTY);
                            entries.add(ModItems.GILDED_APPLE);
                            entries.add(ModItems.ENCHANTED_GOLDEN_CARROT);
                            entries.add(ModItems.GILDED_BREAD);
                            entries.add(ModItems.GOLDEN_BREAD);
                            entries.add(ModItems.ENCHANTED_GOLDEN_BREAD);
                        }).build());

        Registry.register(Registries.ITEM_GROUP, OTHER_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 0)
                        .displayName(Text.translatable("itemGroup.xiaomu_mod.other_group"))
                        .icon(() -> new ItemStack(ModBlocks.RANDOM_FOOD_BLOCK))
                        .entries((displayContext, entries) -> {
                            entries.add(ModBlocks.RANDOM_FOOD_BLOCK);
                            entries.add(ModItems.TOHRU_HORN);
                            entries.add(ModItems.OBSIDIAN_BUCKET);
                            entries.add(ModItems.BOTTOMLESS_OBSIDIAN_BUCKET);
                            entries.add(ModItems.BOTTOMLESS_BUCKET);
                            entries.add(ModItems.BOTTOMLESS_WATER_BUCKET);
                            entries.add(ModItems.BOTTOMLESS_LAVA_BUCKET);
                        }).build());

        XiaomuMod.LOGGER.info("Registering Groups");
    }
}