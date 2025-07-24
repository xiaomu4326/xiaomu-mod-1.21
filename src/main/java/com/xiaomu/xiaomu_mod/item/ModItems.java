package com.xiaomu.xiaomu_mod.item;

import com.xiaomu.xiaomu_mod.XiaomuMod;
import com.xiaomu.xiaomu_mod.item.custom.KobayashiBeerCanFull;
import com.xiaomu.xiaomu_mod.sound.ModJukeboxSongs;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
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
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.MAID_S1_OPENING)));
    public static final Item MAID_S1_OPENING_TV_VER = registerItems("maid_s1_opening_tv_ver",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.MAID_S1_OPENING_TV_VER)));

    public static final Item MAID_S1_ENDING = registerItems("maid_s1_ending",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.MAID_S1_ENDING)));
    public static final Item MAID_S1_ENDING_TV_VER = registerItems("maid_s1_ending_tv_ver",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.MAID_S1_ENDING_TV_VER)));

    public static final Item MAID_S2_OPENING = registerItems("maid_s2_opening",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.MAID_S2_OPENING)));

    public static final Item MAID_S2_ENDING = registerItems("maid_s2_ending",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.MAID_S2_ENDING)));

    public static final Item DEER_S1_OPENING = registerItems("deer_s1_opening",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.DEER_S1_OPENING)));

    public static final Item CAFE_S1_OPENING = registerItems("cafe_s1_opening",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.CAFE_S1_OPENING)));
    public static final Item CAFE_S1_OPENING_TV_VER = registerItems("cafe_s1_opening_tv_ver",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.CAFE_S1_OPENING_TV_VER)));

    public static final Item CAFE_S1_ENDING = registerItems("cafe_s1_ending",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.CAFE_S1_ENDING)));
    public static final Item CAFE_S1_ENDING_TV_VER = registerItems("cafe_s1_ending_tv_ver",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.CAFE_S1_ENDING_TV_VER)));

    public static final Item SO_LUCKY = registerItems("so_lucky",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.SO_LUCKY)));

    public static final Item AT_THE_MERCY_OF_GOD = registerItems("at_the_mercy_of_god",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.AT_THE_MERCY_OF_GOD)));

    public static final Item MAGIC_TV_VER_S1_OPENING = registerItems("magic_tv_ver_s1_opening",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.MAGIC_TV_VER_S1_OPENING)));

    public static final Item MAGIC_TV_VER_S1_EPISODE_1_TO_2_ENDING = registerItems("magic_tv_ver_s1_episode_1_to_2_ending",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.MAGIC_TV_VER_S1_EPISODE_1_TO_2_ENDING)));

    public static final Item MAGIC_TV_VER_S1_EPISODE_3_TO_11_ENDING = registerItems("magic_tv_ver_s1_episode_3_to_11_ending",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.MAGIC_TV_VER_S1_EPISODE_3_TO_11_ENDING)));

    public static final Item SENREN_BANKA_OPENING = registerItems("senren_banka_opening",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.SENREN_BANKA_OPENING)));
    public static final Item SENREN_BANKA_OPENING_GAME_VER = registerItems("senren_banka_opening_game_ver",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.SENREN_BANKA_OPENING_GAME_VER)));

    //English
    public static final Item PASSING_MEMORIES = registerItems("passing_memories",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.PASSING_MEMORIES)));

    public static final Item CALL_OF_SILENCE = registerItems("call_of_silence",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.CALL_OF_SILENCE)));

    public static final Item DUVET = registerItems("duvet",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.DUVET)));

    public static final Item I_LOVE_YOU_SO = registerItems("i_love_you_so",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.I_LOVE_YOU_SO)));

    public static final Item DAY_LIGHT = registerItems("day_light",
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).jukeboxPlayable(ModJukeboxSongs.DAY_LIGHT)));


    //Food
    public static final Item TOHRU_MEAT = registerItems("tohru_meat",
            new Item(new Item.Settings().maxCount(64).rarity(Rarity.COMMON).food(ModFoodComponents.TOHRU_MEAT)));

    public static final Item COOKED_TOHRU_MEAT = registerItems("cooked_tohru_meat",
            new Item(new Item.Settings().maxCount(64).rarity(Rarity.COMMON).food(ModFoodComponents.COOKED_TOHRU_MEAT)));

    public static final Item KOBAYASHI_BEER_CAN_FULL = registerItems("kobayashi_beer_can_full",
            new KobayashiBeerCanFull(new Item.Settings().maxCount(64).rarity(Rarity.COMMON).food(ModFoodComponents.KOBAYASHI_BEER_CAN_FULL)));


    //other
    public static final Item KOBAYASHI_BEER_CAN_EMPTY = registerItems("kobayashi_beer_can_empty",
            new Item(new Item.Settings().maxCount(64).rarity(Rarity.COMMON)));

    private static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(XiaomuMod.MOD_ID, id), item);
    }

    public static void addItemToFoodAndDrinkItemGroup(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(TOHRU_MEAT);
        fabricItemGroupEntries.add(COOKED_TOHRU_MEAT);
        fabricItemGroupEntries.add(KOBAYASHI_BEER_CAN_FULL);
        fabricItemGroupEntries.add(KOBAYASHI_BEER_CAN_EMPTY);
    }

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemToFoodAndDrinkItemGroup);
    }
}
