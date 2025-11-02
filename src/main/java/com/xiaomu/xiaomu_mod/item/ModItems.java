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
        // Music Discs
        // Japanese
        public static final Item AOZORANORAPUSODI = registerItems("aozoranorapusodi",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.AOZORANORAPUSODI)));
        public static final Item AOZORANORAPUSODI_TV_VER = registerItems("aozoranorapusodi_tv_ver",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.AOZORANORAPUSODI_TV_VER)));

        public static final Item ISHUKANKOMYUNIKESHON = registerItems("ishukankomyunikeshon",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.ISHUKANKOMYUNIKESHON)));
        public static final Item ISHUKANKOMYUNIKESHON_TV_VER = registerItems("ishukankomyunikeshon_tv_ver",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.ISHUKANKOMYUNIKESHON_TV_VER)));

        public static final Item AINOSHUPURIMU = registerItems("ainoshupurimu",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.AINOSHUPURIMU)));
        public static final Item AINOSHUPURIMU_TV_VER = registerItems("ainoshupurimu_tv_ver",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.AINOSHUPURIMU_TV_VER)));

        public static final Item MEIDOWIZUDORAGONZU = registerItems("meidowizudoragonzu",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.MEIDOWIZUDORAGONZU)));
        public static final Item MEIDOWIZUDORAGONZU_TV_VER = registerItems("meidowizudoragonzu_tv_ver",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.MEIDOWIZUDORAGONZU_TV_VER)));

        public static final Item ISHUKANRIRESHONSHIPPU = registerItems("ishukanrireshonshippu",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.ISHUKANRIRESHONSHIPPU)));

        public static final Item SHIKAIRODEIZU = registerItems("shikairodeizu",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.SHIKAIRODEIZU)));

        public static final Item SHIKAIRODEIZU_TV_VER = registerItems("shikairodeizu_tv_ver",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.SHIKAIRODEIZU_TV_VER)));

        public static final Item BONAPETITOS = registerItems("bonapetitos",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.BONAPETITOS)));
        public static final Item BONAPETITOS_TV_VER = registerItems("bonapetitos_tv_ver",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.BONAPETITOS_TV_VER)));

        public static final Item DETARAMENAMAINASUTOPURASUNIOKERUBURENDOKO = registerItems("detaramenamainasutopurasuniokeruburendoko",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.DETARAMENAMAINASUTOPURASUNIOKERUBURENDOKO)));
        public static final Item DETARAMENAMAINASUTOPURASUNIOKERUBURENDOKO_TV_VER = registerItems("detaramenamainasutopurasuniokeruburendoko_tv_ver",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.DETARAMENAMAINASUTOPURASUNIOKERUBURENDOKO_TV_VER)));

        public static final Item SO_LUCKY = registerItems("so_lucky",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.SO_LUCKY)));

        public static final Item KAMINOMANIMANI = registerItems("kaminomanimani",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.KAMINOMANIMANI)));

        public static final Item KONEKUTO = registerItems("konekuto",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.KONEKUTO)));

        public static final Item MATAASHITA = registerItems("mataashita",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.MATAASHITA)));

        public static final Item MAGIA = registerItems("magia",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.MAGIA)));

        public static final Item RUMINASU = registerItems("ruminasu",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.RUMINASU)));

        public static final Item HIKARIFURU = registerItems("hikarifuru",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.HIKARIFURU)));

        public static final Item KARAFURU = registerItems("karafuru",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.KARAFURU)));

        public static final Item MISTERIOSO = registerItems("misterioso",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.MISTERIOSO)));

        public static final Item KIMINOGINNONIWA = registerItems("kiminoginnoniwa",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.KIMINOGINNONIWA)));

        public static final Item KOIHIKOIFUEN = registerItems("koihikoifuen",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.KOIHIKOIFUEN)));
        public static final Item KOIHIKOIFUEN_GAME_VER = registerItems("koihikoifuen_game_ver",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.KOIHIKOIFUEN_GAME_VER)));

        public static final Item TOORYANSEKANBIFURAI = registerItems("tooryansekanbifurai",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.TOORYANSEKANBIFURAI)));
        public static final Item TOORYANSEKANBIFURAI_INSTRUMENT_VER = registerItems("tooryansekanbifurai_instrument_ver",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.TOORYANSEKANBIFURAI_INSTRUMENT_VER)));
        public static final Item TOORYANSEKANBIFURAI_QUIET_VER = registerItems("tooryansekanbifurai_quiet_ver",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.TOORYANSEKANBIFURAI_QUIET_VER)));

        public static final Item AISHISATOKANSHANOKIMOCHI = registerItems("aishisatokanshanokimochi",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.AISHISATOKANSHANOKIMOCHI)));

        public static final Item KIZUNAHITOTSU = registerItems("kizunahitotsu",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.KIZUNAHITOTSU)));
        public static final Item KIZUNAHITOTSU_INSTRUMENT_VER = registerItems("kizunahitotsu_instrument_ver",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.KIZUNAHITOTSU_INSTRUMENT_VER)));
        public static final Item KIZUNAHITOTSU_QUIET_VER = registerItems("kizunahitotsu_quiet_ver",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.KIZUNAHITOTSU_QUIET_VER)));

        public static final Item FUTATSUNOKAGE = registerItems("futatsunokage",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.FUTATSUNOKAGE)));

        public static final Item MAKONONICHIJOU = registerItems("makononichijou",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.MAKONONICHIJOU)));

        public static final Item FUTARIDE = registerItems("futaride",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.FUTARIDE)));

        public static final Item BLUE_SKY = registerItems("blue_sky",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.BLUE_SKY)));

        public static final Item GIFT = registerItems("gift",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.GIFT)));

        public static final Item ASTRAL_ABILITY = registerItems("astral_ability",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.ASTRAL_ABILITY)));

        public static final Item SLEEP_S1_OPENING = registerItems("sleep_s1_opening",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.SLEEP_S1_OPENING)));

        public static final Item SISTER_S1_OPENING = registerItems("sister_s1_opening",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.SISTER_S1_OPENING)));
        public static final Item SISTER_S1_OPENING_TV_VER = registerItems("sister_s1_opening_tv_ver",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.SISTER_S1_OPENING_TV_VER)));

        // English
        // mihoyo
        public static final Item PASSING_MEMORIES = registerItems("passing_memories",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.PASSING_MEMORIES)));

        public static final Item THE_ROAD_NOT_TAKEN = registerItems("the_road_not_taken",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.THE_ROAD_NOT_TAKEN)));

        public static final Item EMBERFIRE = registerItems("emberfire",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.EMBERFIRE)));

        public static final Item HOPE_IS_THE_THING_WITH_FEATHERS = registerItems("hope_is_the_thing_with_feathers",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.HOPE_IS_THE_THING_WITH_FEATHERS)));

        public static final Item SWAY_TO_MY_BEAT_IN_COSMOS = registerItems("sway_to_my_beat_in_cosmos",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.SWAY_TO_MY_BEAT_IN_COSMOS)));

        // other
        public static final Item CALL_OF_SILENCE = registerItems("call_of_silence",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.CALL_OF_SILENCE)));

        public static final Item DUVET = registerItems("duvet",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.DUVET)));

        public static final Item I_LOVE_YOU_SO = registerItems("i_love_you_so",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.I_LOVE_YOU_SO)));

        
        public static final Item LEVITATING = registerItems("levitating",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.LEVITATING)));

        public static final Item COLORS = registerItems("colors",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.COLORS)));

        public static final Item RIDE_OR_DIE = registerItems("ride_or_die",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.RIDE_OR_DIE)));

        public static final Item WHERE_WE_STARTED = registerItems("where_we_started",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.WHERE_WE_STARTED)));

        public static final Item PAST_LIVES = registerItems("past_lives",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.PAST_LIVES)));

        public static final Item UMBRELLA = registerItems("umbrella",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.UMBRELLA)));

        
        //Chinese
        //mihoyo
        public static final Item DEVASTATION_AND_REDEMPTION = registerItems("devastation_and_redemption",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.DEVASTATION_AND_REDEMPTION)));


        //Other Language
        //mihoyo
        public static final Item NOD_KRAI = registerItems("nod_krai",
                new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                        .jukeboxPlayable(ModJukeboxSongs.NOD_KRAI)));


        // instrumental music
        // mihoyo
        public static final Item THE_PARADE_OF_FLYING_SQUIRRELS = registerItems("the_parade_of_flying_squirrels",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.THE_PARADE_OF_FLYING_SQUIRRELS)));

        public static final Item SURASTHANA_FANTASIA = registerItems("surasthana_fantasia",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.SURASTHANA_FANTASIA)));

        // other
        public static final Item DAY_LIGHT = registerItems("day_light",
                        new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE)
                                        .jukeboxPlayable(ModJukeboxSongs.DAY_LIGHT)));

        // items
        // Food
        public static final Item TOHRU_MEAT = registerItems("tohru_meat",
                        new Item(new Item.Settings().maxCount(64).rarity(Rarity.COMMON)
                                        .food(ModFoodComponents.TOHRU_MEAT)));

        public static final Item COOKED_TOHRU_MEAT = registerItems("cooked_tohru_meat",
                        new Item(new Item.Settings().maxCount(64).rarity(Rarity.RARE)
                                        .food(ModFoodComponents.COOKED_TOHRU_MEAT)));

        public static final Item KOBAYASHI_BEER_CAN_FULL = registerItems("kobayashi_beer_can_full",
                        new KobayashiBeerCanFull(new Item.Settings().maxCount(64).rarity(Rarity.COMMON)
                                        .food(ModFoodComponents.KOBAYASHI_BEER_CAN_FULL)));

        public static final Item KOBAYASHI_BEER_CAN_EMPTY = registerItems("kobayashi_beer_can_empty",
                        new Item(new Item.Settings().maxCount(64).rarity(Rarity.COMMON)));

        public static final Item ENCHANTED_GOLDEN_CARROT = registerItems("enchanted_golden_carrot",
                        new Item((new Item.Settings().maxCount(64).rarity(Rarity.RARE)
                                        .food(ModFoodComponents.ENCHANTED_GOLDEN_CARROT)
                                        .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true))));

        public static final Item GILDED_APPLE = registerItems("gilded_apple",
                        new Item((new Item.Settings().maxCount(64).rarity(Rarity.COMMON)
                                        .food(ModFoodComponents.GILDED_APPLE))));

        public static final Item GILDED_BREAD = registerItems("gilded_bread",
                        new Item((new Item.Settings().maxCount(64).rarity(Rarity.COMMON)
                                        .food(ModFoodComponents.GILDED_BREAD))));

        public static final Item GOLDEN_BREAD = registerItems("golden_bread",
                        new Item((new Item.Settings().maxCount(64).rarity(Rarity.RARE)
                                        .food(ModFoodComponents.GOLDEN_BREAD))));

        public static final Item ENCHANTED_GOLDEN_BREAD = registerItems("enchanted_golden_bread",
                        new Item((new Item.Settings().maxCount(64).rarity(Rarity.EPIC)
                                        .food(ModFoodComponents.ENCHANTED_GOLDEN_BREAD)
                                        .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true))));

        // other
        public static final Item TOHRU_HORN = registerItems("tohru_horn",
                        new Item(new Item.Settings().maxCount(64).rarity(Rarity.COMMON)));

        public static final Item OBSIDIAN_BUCKET = registerItems("obsidian_bucket",
                        new ObsidianBucket(new Item.Settings().maxCount(64).rarity(Rarity.COMMON)));

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

        private static Item registerItems(String id, Item item) {
                return Registry.register(Registries.ITEM, Identifier.of(XiaomuMod.MOD_ID, id), item);
        }

        public static void addItemToFoodAndDrinkItemGroup(FabricItemGroupEntries fabricItemGroupEntries) {
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

        public static void addItemToToolsAndUtilitiesItemGroup(FabricItemGroupEntries fabricItemGroupEntries) {
                fabricItemGroupEntries.add(OBSIDIAN_BUCKET);
                fabricItemGroupEntries.add(BOTTOMLESS_OBSIDIAN_BUCKET);
                fabricItemGroupEntries.add(BOTTOMLESS_BUCKET);
                fabricItemGroupEntries.add(BOTTOMLESS_WATER_BUCKET);
                fabricItemGroupEntries.add(BOTTOMLESS_LAVA_BUCKET);
        }

        public static void registerModItems() {
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                                .register(ModItems::addItemToFoodAndDrinkItemGroup);
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                                .register(ModItems::addItemToToolsAndUtilitiesItemGroup);
        }
}
