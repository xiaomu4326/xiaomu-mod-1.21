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
                            entries.add(ModItems.AOZORANORAPUSODI);
                            entries.add(ModItems.AOZORANORAPUSODI_TV_VER);
                            entries.add(ModItems.ISHUKANKOMYUNIKESHON);
                            entries.add(ModItems.ISHUKANKOMYUNIKESHON_TV_VER);
                            entries.add(ModItems.AINOSHUPURIMU);
                            entries.add(ModItems.AINOSHUPURIMU_TV_VER);
                            entries.add(ModItems.MEIDOWIZUDORAGONZU);
                            entries.add(ModItems.MEIDOWIZUDORAGONZU_TV_VER);
                            entries.add(ModItems.ISHUKANRIRESHONSHIPPU);
                            entries.add(ModItems.SHIKAIRODEIZU);
                            entries.add(ModItems.SHIKAIRODEIZU_TV_VER);
                            entries.add(ModItems.BONAPETITOS);
                            entries.add(ModItems.BONAPETITOS_TV_VER);
                            entries.add(ModItems.DETARAMENAMAINASUTOPURASUNIOKERUBURENDOKO);
                            entries.add(ModItems.DETARAMENAMAINASUTOPURASUNIOKERUBURENDOKO_TV_VER);
                            entries.add(ModItems.SO_LUCKY);
                            entries.add(ModItems.KAMINOMANIMANI);
                            entries.add(ModItems.KONEKUTO);
                            entries.add(ModItems.MATAASHITA);
                            entries.add(ModItems.MAGIA);
                            entries.add(ModItems.RUMINASU);
                            entries.add(ModItems.HIKARIFURU);
                            entries.add(ModItems.KARAFURU);
                            entries.add(ModItems.MISTERIOSO);
                            entries.add(ModItems.KIMINOGINNONIWA);
                            entries.add(ModItems.KOIHIKOIFUEN);
                            entries.add(ModItems.KOIHIKOIFUEN_GAME_VER);
                            entries.add(ModItems.TOORYANSEKANBIFURAI);
                            entries.add(ModItems.TOORYANSEKANBIFURAI_INSTRUMENT_VER);
                            entries.add(ModItems.TOORYANSEKANBIFURAI_QUIET_VER);
                            entries.add(ModItems.AISHISATOKANSHANOKIMOCHI);
                            entries.add(ModItems.KIZUNAHITOTSU);
                            entries.add(ModItems.KIZUNAHITOTSU_INSTRUMENT_VER);
                            entries.add(ModItems.KIZUNAHITOTSU_QUIET_VER);
                            entries.add(ModItems.FUTATSUNOKAGE);
                            entries.add(ModItems.MAKONONICHIJOU);
                            entries.add(ModItems.FUTARIDE);
                            entries.add(ModItems.BLUE_SKY);
                            entries.add(ModItems.GIFT);
                            entries.add(ModItems.ASTRAL_ABILITY);
                            entries.add(ModItems.KAIMINANMINSUYARISUTOSEIKATSU);
                            entries.add(ModItems.AIDENSADASADAMERUTODAUN);
                            entries.add(ModItems.AIDENSADASADAMERUTODAUN_TV_VER);
                            entries.add(ModItems.HOSHIFURUUMI);
                            entries.add(ModItems.RAY_CHOUKAGUYAHIME_VERSION);
                            entries.add(ModItems.WAARUDOIZUMAIN);
                            entries.add(ModItems.WATASHIHAWATASHINOKOTOGASUKI);
                            entries.add(ModItems.EX_OTOGIBANASHI);
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
                            //Other Language
                            //mihoyo
                            entries.add(ModItems.NOD_KRAI);
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
                            entries.add(ModItems.UNPOLISHED_DIAMOND);
                            entries.add(ModItems.GASEOUS_CARBON_DIOXIDE);
                            entries.add(ModItems.OBSIDIAN_BUCKET);
                            entries.add(ModItems.BOTTOMLESS_OBSIDIAN_BUCKET);
                            entries.add(ModItems.BOTTOMLESS_BUCKET);
                            entries.add(ModItems.BOTTOMLESS_WATER_BUCKET);
                            entries.add(ModItems.BOTTOMLESS_LAVA_BUCKET);
                        }).build());

        XiaomuMod.LOGGER.info("Registering Groups");
    }
}