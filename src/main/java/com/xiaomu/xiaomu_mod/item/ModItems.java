package com.xiaomu.xiaomu_mod.item;

import com.xiaomu.xiaomu_mod.XiaomuMod;
import com.xiaomu.xiaomu_mod.item.custom.*;
import com.xiaomu.xiaomu_mod.sound.ModJukeboxSongs;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    //Records(Music Disc)
    //Japanese
    public static final Item MAID_S1_OPENING = registerItems("maid_s1_opening",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.MAID_S1_OPENING)));
    public static final Item MAID_S1_OPENING_TV_VER = registerItems("maid_s1_opening_tv_ver",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.MAID_S1_OPENING_TV_VER)));

    public static final Item MAID_S1_ENDING = registerItems("maid_s1_ending",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.MAID_S1_ENDING)));
    public static final Item MAID_S1_ENDING_TV_VER = registerItems("maid_s1_ending_tv_ver",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.MAID_S1_ENDING_TV_VER)));

    public static final Item MAID_S2_OPENING = registerItems("maid_s2_opening",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.MAID_S2_OPENING)));
    public static final Item MAID_S2_OPENING_TV_VER = registerItems("maid_s2_opening_tv_ver",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.MAID_S2_OPENING_TV_VER)));

    public static final Item MAID_S2_ENDING = registerItems("maid_s2_ending",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.MAID_S2_ENDING)));
    public static final Item MAID_S2_ENDING_TV_VER = registerItems("maid_s2_ending_tv_ver",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.MAID_S2_ENDING_TV_VER)));

    public static final Item DEER_S1_OPENING = registerItems("deer_s1_opening",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.DEER_S1_OPENING)));

    public static final Item CAFE_S1_OPENING = registerItems("cafe_s1_opening",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.CAFE_S1_OPENING)));
    public static final Item CAFE_S1_OPENING_TV_VER = registerItems("cafe_s1_opening_tv_ver",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.CAFE_S1_OPENING_TV_VER)));

    public static final Item CAFE_S1_ENDING = registerItems("cafe_s1_ending",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.CAFE_S1_ENDING)));
    public static final Item CAFE_S1_ENDING_TV_VER = registerItems("cafe_s1_ending_tv_ver",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.CAFE_S1_ENDING_TV_VER)));

    public static final Item SO_LUCKY = registerItems("so_lucky",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SO_LUCKY)));

    public static final Item AT_THE_MERCY_OF_GOD = registerItems("at_the_mercy_of_god",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.AT_THE_MERCY_OF_GOD)));

    public static final Item MAGIC_TV_VER_S1_OPENING = registerItems("magic_tv_ver_s1_opening",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.MAGIC_TV_VER_S1_OPENING)));

    public static final Item MAGIC_TV_VER_S1_EPISODE_1_TO_2_ENDING = registerItems("magic_tv_ver_s1_episode_1_to_2_ending",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.MAGIC_TV_VER_S1_EPISODE_1_TO_2_ENDING)));

    public static final Item MAGIC_TV_VER_S1_EPISODE_3_TO_11_ENDING = registerItems("magic_tv_ver_s1_episode_3_to_11_ending",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.MAGIC_TV_VER_S1_EPISODE_3_TO_11_ENDING)));

    public static final Item MAGIC_MOVIE_VER_S1_TO_S2_OPENING = registerItems("magic_movie_ver_s1_to_s2_opening",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.MAGIC_MOVIE_VER_S1_TO_S2_OPENING)));

    public static final Item MAGIC_MOVIE_VER_S2_ENDING = registerItems("magic_movie_ver_s2_ending",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.MAGIC_MOVIE_VER_S2_ENDING)));

    public static final Item MAGIC_MOVIE_VER_S3_OPENING = registerItems("magic_movie_ver_s3_opening",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.MAGIC_MOVIE_VER_S3_OPENING)));

    public static final Item MAGIC_MOVIE_VER_S3_EPISODE = registerItems("magic_movie_ver_s3_episode",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.MAGIC_MOVIE_VER_S3_EPISODE)));

    public static final Item MAGIC_MOVIE_VER_S3_ENDING = registerItems("magic_movie_ver_s3_ending",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.MAGIC_MOVIE_VER_S3_ENDING)));

    public static final Item SENREN_BANKA_OPENING = registerItems("senren_banka_opening",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SENREN_BANKA_OPENING)));
    public static final Item SENREN_BANKA_OPENING_GAME_VER = registerItems("senren_banka_opening_game_ver",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SENREN_BANKA_OPENING_GAME_VER)));

    public static final Item SENREN_BANKA_YOSHINO = registerItems("senren_banka_yoshino",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SENREN_BANKA_YOSHINO)));
    public static final Item SENREN_BANKA_YOSHINO_INSTRUMENT_VER = registerItems("senren_banka_yoshino_instrument_ver",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SENREN_BANKA_YOSHINO_INSTRUMENT_VER)));
    public static final Item SENREN_BANKA_YOSHINO_QUIET_VER = registerItems("senren_banka_yoshino_quiet_ver",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SENREN_BANKA_YOSHINO_QUIET_VER)));

    public static final Item SENREN_BANKA_YOSHINO_ENDING = registerItems("senren_banka_yoshino_ending",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SENREN_BANKA_YOSHINO_ENDING)));

    public static final Item SENREN_BANKA_MURASAME = registerItems("senren_banka_murasame",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SENREN_BANKA_MURASAME)));
    public static final Item SENREN_BANKA_MURASAME_INSTRUMENT_VER = registerItems("senren_banka_murasame_instrument_ver",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SENREN_BANKA_MURASAME_INSTRUMENT_VER)));
    public static final Item SENREN_BANKA_MURASAME_QUIET_VER = registerItems("senren_banka_murasame_quiet_ver",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SENREN_BANKA_MURASAME_QUIET_VER)));

    public static final Item SENREN_BANKA_MURASAME_ENDING = registerItems("senren_banka_murasame_ending",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SENREN_BANKA_MURASAME_ENDING)));

    public static final Item SENREN_BANKA_MAKO = registerItems("senren_banka_mako",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SENREN_BANKA_MAKO)));

    public static final Item SENREN_BANKA_MAKO_ENDING = registerItems("senren_banka_mako_ending",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SENREN_BANKA_MAKO_ENDING)));

    public static final Item SENREN_BANKA_LENA = registerItems("senren_banka_lena",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SENREN_BANKA_LENA)));

    public static final Item SENREN_BANKA_LENA_ENDING = registerItems("senren_banka_lena_ending",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SENREN_BANKA_LENA_ENDING)));

    public static final Item SLEEP_S1_OPENING = registerItems("sleep_s1_opening",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SLEEP_S1_OPENING)));

    //English
    public static final Item PASSING_MEMORIES = registerItems("passing_memories",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.PASSING_MEMORIES)));

    public static final Item CALL_OF_SILENCE = registerItems("call_of_silence",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.CALL_OF_SILENCE)));

    public static final Item DUVET = registerItems("duvet",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.DUVET)));

    public static final Item I_LOVE_YOU_SO = registerItems("i_love_you_so",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.I_LOVE_YOU_SO)));

    public static final Item DAY_LIGHT = registerItems("day_light",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.DAY_LIGHT)));

    public static final Item HOPE_IS_THE_THING_WITH_FEATHERS = registerItems("hope_is_the_thing_with_feathers",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.HOPE_IS_THE_THING_WITH_FEATHERS)));

    public static final Item SWAY_TO_MY_BEAT_IN_COSMOS = registerItems("sway_to_my_beat_in_cosmos",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.SWAY_TO_MY_BEAT_IN_COSMOS)));

    public static final Item LEVITATING = registerItems("levitating",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.LEVITATING)));

    public static final Item COLORS = registerItems("colors",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.COLORS)));

    public static final Item RIDE_OR_DIE = registerItems("ride_or_die",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.RIDE_OR_DIE)));

    public static final Item WHERE_WE_STARTED = registerItems("where_we_started",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.WHERE_WE_STARTED)));

    public static final Item PAST_LIVES = registerItems("past_lives",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.PAST_LIVES)));

    public static final Item UMBRELLA = registerItems("umbrella",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModJukeboxSongs.UMBRELLA)));


    //Food
    public static final Item TOHRU_MEAT = registerItems("tohru_meat",
            new Item(new Item.Settings().maxCount(64).rarity(Rarity.COMMON).food(ModFoodComponents.TOHRU_MEAT)));

    public static final Item COOKED_TOHRU_MEAT = registerItems("cooked_tohru_meat",
            new Item(new Item.Settings().maxCount(64).rarity(Rarity.RARE).food(ModFoodComponents.COOKED_TOHRU_MEAT)));

    public static final Item KOBAYASHI_BEER_CAN_FULL = registerItems("kobayashi_beer_can_full",
            new KobayashiBeerCanFull(new Item.Settings().maxCount(64).rarity(Rarity.COMMON).food(ModFoodComponents.KOBAYASHI_BEER_CAN_FULL)));

    public static final Item KOBAYASHI_BEER_CAN_EMPTY = registerItems("kobayashi_beer_can_empty",
            new Item(new Item.Settings().maxCount(64).rarity(Rarity.COMMON)));

    public static final Item ENCHANTED_GOLDEN_CARROT = registerItems("enchanted_golden_carrot",
            new Item((new Item.Settings().maxCount(64).rarity(Rarity.RARE).food(ModFoodComponents.ENCHANTED_GOLDEN_CARROT)
                    .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true))));

    public static final Item GILDED_APPLE = registerItems("gilded_apple",
            new Item((new Item.Settings().maxCount(64).rarity(Rarity.COMMON).food(ModFoodComponents.GILDED_APPLE))));

    public static final Item GILDED_BREAD = registerItems("gilded_bread",
            new Item((new Item.Settings().maxCount(64).rarity(Rarity.COMMON).food(ModFoodComponents.GILDED_BREAD))));

    public static final Item GOLDEN_BREAD = registerItems("golden_bread",
            new Item((new Item.Settings().maxCount(64).rarity(Rarity.RARE).food(ModFoodComponents.GOLDEN_BREAD))));

    public static final Item ENCHANTED_GOLDEN_BREAD = registerItems("enchanted_golden_bread",
            new Item((new Item.Settings().maxCount(64).rarity(Rarity.EPIC).food(ModFoodComponents.ENCHANTED_GOLDEN_BREAD)
                    .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true))));


    //other
    public static final Item TOHRU_HORN = registerItems("tohru_horn",
            new Item(new Item.Settings().maxCount(64).rarity(Rarity.COMMON)));

    public static final Item OBSIDIAN_BUCKET = registerItems("obsidian_bucket",
            new ObsidianBucket(new Item.Settings().maxCount(2).rarity(Rarity.COMMON)));

    public static final Item BOTTOMLESS_OBSIDIAN_BUCKET = registerItems("bottomless_obsidian_bucket",
            new BottomlessObsidianBucket(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final Item BOTTOMLESS_BUCKET = registerItems("bottomless_bucket",
            new BottomlessBucket(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final Item BOTTOMLESS_WATER_BUCKET = registerItems("bottomless_water_bucket",
            new BottomlessWaterBucket(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final Item BOTTOMLESS_LAVA_BUCKET = registerItems("bottomless_lava_bucket",
            new BottomlessLavaBucket(new Item.Settings().maxCount(1).rarity(Rarity.EPIC)
                    .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)));


    private static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(XiaomuMod.MOD_ID, id), item);
    }

    public static void addItemToFoodAndDrinkItemGroup(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(TOHRU_MEAT);
        fabricItemGroupEntries.add(COOKED_TOHRU_MEAT);
        fabricItemGroupEntries.add(KOBAYASHI_BEER_CAN_FULL);
        fabricItemGroupEntries.add(KOBAYASHI_BEER_CAN_EMPTY);
        fabricItemGroupEntries.add(GILDED_APPLE);
        fabricItemGroupEntries.add(ENCHANTED_GOLDEN_CARROT);
        fabricItemGroupEntries.add(GILDED_BREAD);
        fabricItemGroupEntries.add(GOLDEN_BREAD);
        fabricItemGroupEntries.add(ENCHANTED_GOLDEN_BREAD);
    }

    public static void addItemToToolsAndUtilitiesItemGroup(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(OBSIDIAN_BUCKET);
        fabricItemGroupEntries.add(BOTTOMLESS_OBSIDIAN_BUCKET);
        fabricItemGroupEntries.add(BOTTOMLESS_BUCKET);
        fabricItemGroupEntries.add(BOTTOMLESS_WATER_BUCKET);
        fabricItemGroupEntries.add(BOTTOMLESS_LAVA_BUCKET);
    }

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemToFoodAndDrinkItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemToToolsAndUtilitiesItemGroup);
    }
}
