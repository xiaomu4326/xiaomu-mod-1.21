package com.xiaomu.xiaomu_mod.sound;


import java.rmi.registry.Registry;

import com.xiaomu.xiaomu_mod.XiaomuMod;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public interface ModJukeboxSongs {
    //Japanese
    RegistryKey<JukeboxSong> AOZORANORAPUSODI = of("aozoranorapusodi");
    RegistryKey<JukeboxSong> AOZORANORAPUSODI_TV_VER = of("aozoranorapusodi_tv_ver");

    RegistryKey<JukeboxSong> ISHUKANKOMYUNIKESHON = of("ishukankomyunikeshon");
    RegistryKey<JukeboxSong> ISHUKANKOMYUNIKESHON_TV_VER = of("ishukankomyunikeshon_tv_ver");

    RegistryKey<JukeboxSong> AINOSHUPURIMU = of("ainoshupurimu");
    RegistryKey<JukeboxSong> AINOSHUPURIMU_TV_VER = of("ainoshupurimu_tv_ver");

    RegistryKey<JukeboxSong> MEIDOWIZUDORAGONZU = of("meidowizudoragonzu");
    RegistryKey<JukeboxSong> MEIDOWIZUDORAGONZU_TV_VER = of("meidowizudoragonzu_tv_ver");

    RegistryKey<JukeboxSong> ISHUKANRIRESHONSHIPPU = of("ishukanrireshonshippu");

    RegistryKey<JukeboxSong> SHIKAIRODEIZU = of("shikairodeizu");
    RegistryKey<JukeboxSong> SHIKAIRODEIZU_TV_VER = of("shikairodeizu_tv_ver");

    RegistryKey<JukeboxSong> BONAPETITOS = of("bonapetitos");
    RegistryKey<JukeboxSong> BONAPETITOS_TV_VER = of("bonapetitos_tv_ver");

    RegistryKey<JukeboxSong> DETARAMENAMAINASUTOPURASUNIOKERUBURENDOKO = of("detaramenamainasutopurasuniokeruburendoko");
    RegistryKey<JukeboxSong> DETARAMENAMAINASUTOPURASUNIOKERUBURENDOKO_TV_VER = of("detaramenamainasutopurasuniokeruburendoko_tv_ver");

    RegistryKey<JukeboxSong> SO_LUCKY = of("so_lucky");

    RegistryKey<JukeboxSong> KAMINOMANIMANI = of("kaminomanimani");

    RegistryKey<JukeboxSong> KONEKUTO = of("konekuto");

    RegistryKey<JukeboxSong> MATAASHITA = of("mataashita");

    RegistryKey<JukeboxSong> MAGIA = of("magia");

    RegistryKey<JukeboxSong> RUMINASU = of("ruminasu");

    RegistryKey<JukeboxSong> HIKARIFURU = of("hikarifuru");

    RegistryKey<JukeboxSong> KARAFURU = of("karafuru");

    RegistryKey<JukeboxSong> MISTERIOSO = of("misterioso");

    RegistryKey<JukeboxSong> KIMINOGINNONIWA = of("kiminoginnoniwa");

    RegistryKey<JukeboxSong> KOIHIKOIFUEN = of("koihikoifuen");
    RegistryKey<JukeboxSong> KOIHIKOIFUEN_GAME_VER = of("koihikoifuen_game_ver");

    RegistryKey<JukeboxSong> TOORYANSEKANBIFURAI = of("tooryansekanbifurai");
    RegistryKey<JukeboxSong> TOORYANSEKANBIFURAI_INSTRUMENT_VER = of("tooryansekanbifurai_instrument_ver");
    RegistryKey<JukeboxSong> TOORYANSEKANBIFURAI_QUIET_VER = of("tooryansekanbifurai_quiet_ver");

    RegistryKey<JukeboxSong> AISHISATOKANSHANOKIMOCHI = of("aishisatokanshanokimochi");

    RegistryKey<JukeboxSong> KIZUNAHITOTSU = of("kizunahitotsu");
    RegistryKey<JukeboxSong> KIZUNAHITOTSU_INSTRUMENT_VER = of("kizunahitotsu_instrument_ver");
    RegistryKey<JukeboxSong> KIZUNAHITOTSU_QUIET_VER = of("kizunahitotsu_quiet_ver");

    RegistryKey<JukeboxSong> FUTATSUNOKAGE = of("futatsunokage");

    RegistryKey<JukeboxSong> MAKONONICHIJOU = of("makononichijou");

    RegistryKey<JukeboxSong> FUTARIDE = of("futaride");

    RegistryKey<JukeboxSong> BLUE_SKY = of("blue_sky");

    RegistryKey<JukeboxSong> GIFT = of("gift");

    RegistryKey<JukeboxSong> ASTRAL_ABILITY = of("astral_ability");

    RegistryKey<JukeboxSong> KAIMINANMINSUYARISUTOSEIKATSU = of("kaiminanminsuyarisutoseikatsu");

    RegistryKey<JukeboxSong> AIDENSADASADAMERUTODAUN = of("aidensadasadamerutodaun");
    RegistryKey<JukeboxSong> AIDENSADASADAMERUTODAUN_TV_VER = of("aidensadasadamerutodaun_tv_ver");

    RegistryKey<JukeboxSong> HOSHIFURUUMI = of("hoshifuruumi");
    RegistryKey<JukeboxSong> RAY_CHOUKAGUYAHIME_VERSION = of("ray_choukaguyahime_version");
    RegistryKey<JukeboxSong> WAARUDOIZUMAIN = of("waarudoizumain");
    RegistryKey<JukeboxSong> WATASHIHAWATASHINOKOTOGASUKI = of("watashihawatashinokotogasuki");
    RegistryKey<JukeboxSong> EX_OTOGIBANASHI = of("ex_otogibanashi");

    //English
    //mihoyo
    RegistryKey<JukeboxSong> PASSING_MEMORIES = of("passing_memories");

    RegistryKey<JukeboxSong> THE_ROAD_NOT_TAKEN = of("the_road_not_taken");

    RegistryKey<JukeboxSong> EMBERFIRE = of("emberfire");

    RegistryKey<JukeboxSong> HOPE_IS_THE_THING_WITH_FEATHERS = of("hope_is_the_thing_with_feathers");

    RegistryKey<JukeboxSong> SWAY_TO_MY_BEAT_IN_COSMOS = of("sway_to_my_beat_in_cosmos");

    //other
    RegistryKey<JukeboxSong> CALL_OF_SILENCE = of("call_of_silence");

    RegistryKey<JukeboxSong> DUVET = of("duvet");

    RegistryKey<JukeboxSong> I_LOVE_YOU_SO = of("i_love_you_so");

    RegistryKey<JukeboxSong> LEVITATING = of("levitating");

    RegistryKey<JukeboxSong> COLORS = of("colors");

    RegistryKey<JukeboxSong> RIDE_OR_DIE = of("ride_or_die");

    RegistryKey<JukeboxSong> WHERE_WE_STARTED = of("where_we_started");

    RegistryKey<JukeboxSong> PAST_LIVES = of("past_lives");

    RegistryKey<JukeboxSong> UMBRELLA = of("umbrella");


    //Chinese
    //mihoyo
    RegistryKey<JukeboxSong> DEVASTATION_AND_REDEMPTION = of("devastation_and_redemption");

    //Other Language
    //mihoyo
    RegistryKey<JukeboxSong> NOD_KRAI = of("nod_krai");
    

    //instrumental music
    //mihoyo
    RegistryKey<JukeboxSong> THE_PARADE_OF_FLYING_SQUIRRELS = of("the_parade_of_flying_squirrels");

    RegistryKey<JukeboxSong> SURASTHANA_FANTASIA = of("surasthana_fantasia");

    //other
    RegistryKey<JukeboxSong> DAY_LIGHT = of("day_light");

    private static RegistryKey<JukeboxSong> of(String id){
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(XiaomuMod.MOD_ID, id));
    }

    private static void register(
            Registerable<JukeboxSong> registry, RegistryKey<JukeboxSong> key, RegistryEntry.Reference<SoundEvent> soundEvent, int lengthInSeconds, int comparatorOutput
    ) {
        registry.register(
                key, new JukeboxSong(soundEvent, Text.translatable(Util.createTranslationKey("jukebox_song", key.getValue())), lengthInSeconds, comparatorOutput)
        );
    }


    static void bootstrap(Registerable<JukeboxSong> registry) {

        //Japanese
        register(registry, AOZORANORAPUSODI, ModSoundEvents.MUSIC_DISC_AOZORANORAPUSODI, 277, 15);
        register(registry, AOZORANORAPUSODI_TV_VER, ModSoundEvents.MUSIC_DISC_AOZORANORAPUSODI_TV_VER, 95, 15);

        register(registry, ISHUKANKOMYUNIKESHON, ModSoundEvents.MUSIC_DISC_ISHUKANKOMYUNIKESHON, 246, 15);
        register(registry, ISHUKANKOMYUNIKESHON_TV_VER, ModSoundEvents.MUSIC_DISC_ISHUKANKOMYUNIKESHON_TV_VER, 90, 15);

        register(registry, AINOSHUPURIMU, ModSoundEvents.MUSIC_DISC_AINOSHUPURIMU, 284, 15);
        register(registry, AINOSHUPURIMU_TV_VER, ModSoundEvents.MUSIC_DISC_AINOSHUPURIMU_TV_VER, 88, 15);

        register(registry, MEIDOWIZUDORAGONZU, ModSoundEvents.MUSIC_DISC_MEIDOWIZUDORAGONZU, 222, 15);
        register(registry, MEIDOWIZUDORAGONZU_TV_VER, ModSoundEvents.MUSIC_DISC_MEIDOWIZUDORAGONZU_TV_VER, 92, 15);

        register(registry, ISHUKANRIRESHONSHIPPU, ModSoundEvents.MUSIC_DISC_ISHUKANRIRESHONSHIPPU, 205, 15);

        register(registry, SHIKAIRODEIZU, ModSoundEvents.MUSIC_DISC_SHIKAIRODEIZU, 201, 15);
        register(registry, SHIKAIRODEIZU_TV_VER, ModSoundEvents.MUSIC_DISC_SHIKAIRODEIZU_TV_VER, 90, 15);

        register(registry, BONAPETITOS, ModSoundEvents.MUSIC_DISC_BONAPETITOS, 255, 15);
        register(registry, BONAPETITOS_TV_VER, ModSoundEvents.MUSIC_DISC_BONAPETITOS_TV_VER, 91, 15);

        register(registry, DETARAMENAMAINASUTOPURASUNIOKERUBURENDOKO, ModSoundEvents.MUSIC_DISC_DETARAMENAMAINASUTOPURASUNIOKERUBURENDOKO, 274, 15);
        register(registry, DETARAMENAMAINASUTOPURASUNIOKERUBURENDOKO_TV_VER, ModSoundEvents.MUSIC_DISC_DETARAMENAMAINASUTOPURASUNIOKERUBURENDOKO_TV_VER, 92, 15);

        register(registry, SO_LUCKY, ModSoundEvents.MUSIC_DISC_SO_LUCKY, 193, 15);

        register(registry, KAMINOMANIMANI, ModSoundEvents.MUSIC_DISC_KAMINOMANIMANI, 255, 15);

        register(registry, KONEKUTO, ModSoundEvents.MUSIC_DISC_KONEKUTO, 270, 15);

        register(registry, MATAASHITA, ModSoundEvents.MUSIC_DISC_MATAASHITA, 264, 15);

        register(registry, MAGIA, ModSoundEvents.MUSIC_DISC_MAGIA, 313, 15);

        register(registry, RUMINASU, ModSoundEvents.MUSIC_DISC_RUMINASU, 248, 15);

        register(registry, HIKARIFURU, ModSoundEvents.MUSIC_DISC_HIKARIFURU, 293, 15);

        register(registry, KARAFURU, ModSoundEvents.MUSIC_DISC_KARAFURU, 272, 15);

        register(registry, MISTERIOSO, ModSoundEvents.MUSIC_DISC_MISTERIOSO, 243, 15);

        register(registry, KIMINOGINNONIWA, ModSoundEvents.MUSIC_DISC_KIMINOGINNONIWA, 306, 15);

        register(registry, KOIHIKOIFUEN, ModSoundEvents.MUSIC_DISC_KOIHIKOIFUEN, 237, 15);
        register(registry, KOIHIKOIFUEN_GAME_VER, ModSoundEvents.MUSIC_DISC_KOIHIKOIFUEN_GAME_VER, 107, 15);

        register(registry, TOORYANSEKANBIFURAI, ModSoundEvents.MUSIC_DISC_TOORYANSEKANBIFURAI, 205, 15);
        register(registry, TOORYANSEKANBIFURAI_INSTRUMENT_VER, ModSoundEvents.MUSIC_DISC_TOORYANSEKANBIFURAI_INSTRUMENT_VER, 156, 15);
        register(registry, TOORYANSEKANBIFURAI_QUIET_VER, ModSoundEvents.MUSIC_DISC_TOORYANSEKANBIFURAI_QUIET_VER, 99, 15);

        register(registry, AISHISATOKANSHANOKIMOCHI, ModSoundEvents.MUSIC_DISC_AISHISATOKANSHANOKIMOCHI, 343, 15);

        register(registry, KIZUNAHITOTSU, ModSoundEvents.MUSIC_DISC_KIZUNAHITOTSU, 231, 15);
        register(registry, KIZUNAHITOTSU_INSTRUMENT_VER, ModSoundEvents.MUSIC_DISC_KIZUNAHITOTSU_INSTRUMENT_VER, 207, 15);
        register(registry, KIZUNAHITOTSU_QUIET_VER, ModSoundEvents.MUSIC_DISC_KIZUNAHITOTSU_QUIET_VER, 135, 15);

        register(registry, FUTATSUNOKAGE, ModSoundEvents.MUSIC_DISC_FUTATSUNOKAGE, 250, 15);

        register(registry, MAKONONICHIJOU, ModSoundEvents.MUSIC_DISC_MAKONONICHIJOU, 225, 15);

        register(registry, FUTARIDE, ModSoundEvents.MUSIC_DISC_FUTARIDE, 289, 15);

        register(registry, BLUE_SKY, ModSoundEvents.MUSIC_DISC_BLUE_SKY, 194, 15);

        register(registry, GIFT, ModSoundEvents.MUSIC_DISC_GIFT, 464, 15);

        register(registry, ASTRAL_ABILITY, ModSoundEvents.MUSIC_DISC_ASTRAL_ABILITY, 226, 15);

        register(registry, KAIMINANMINSUYARISUTOSEIKATSU, ModSoundEvents.MUSIC_DISC_KAIMINANMINSUYARISUTOSEIKATSU, 220, 15);

        register(registry, AIDENSADASADAMERUTODAUN, ModSoundEvents.MUSIC_DISC_AIDENSADASADAMERUTODAUN, 243, 15);
        register(registry, AIDENSADASADAMERUTODAUN_TV_VER, ModSoundEvents.MUSIC_DISC_AIDENSADASADAMERUTODAUN_TV_VER, 92, 15);

        register(registry, HOSHIFURUUMI, ModSoundEvents.MUSIC_DISC_HOSHIFURUUMI, 253, 15);
        register(registry, RAY_CHOUKAGUYAHIME_VERSION, ModSoundEvents.MUSIC_DISC_RAY_CHOUKAGUYAHIME_VERSION, 301, 15);
        register(registry, WAARUDOIZUMAIN, ModSoundEvents.MUSIC_DISC_WAARUDOIZUMAIN, 226, 15);
        register(registry, WATASHIHAWATASHINOKOTOGASUKI, ModSoundEvents.MUSIC_DISC_WATASHIHAWATASHINOKOTOGASUKI, 251, 15);
        register(registry, EX_OTOGIBANASHI, ModSoundEvents.MUSIC_DISC_EX_OTOGIBANASHI, 218, 15);


        //English
        //mihoyo
        register(registry, PASSING_MEMORIES, ModSoundEvents.MUSIC_DISC_PASSING_MEMORIES, 219, 15);

        register(registry, THE_ROAD_NOT_TAKEN, ModSoundEvents.MUSIC_DISC_THE_ROAD_NOT_TAKEN, 150, 15);

        register(registry, EMBERFIRE, ModSoundEvents.MUSIC_DISC_EMBERFIRE, 170, 15);

        register(registry, HOPE_IS_THE_THING_WITH_FEATHERS, ModSoundEvents.MUSIC_DISC_HOPE_IS_THE_THING_WITH_FEATHERS, 230, 15);

        register(registry, SWAY_TO_MY_BEAT_IN_COSMOS, ModSoundEvents.MUSIC_DISC_SWAY_TO_MY_BEAT_IN_COSMOS, 165, 15);

        //other
        register(registry, CALL_OF_SILENCE, ModSoundEvents.MUSIC_DISC_CALL_OF_SILENCE, 178, 15);

        register(registry, DUVET, ModSoundEvents.MUSIC_DISC_DUVET, 203, 15);

        register(registry, I_LOVE_YOU_SO, ModSoundEvents.MUSIC_DISC_I_LOVE_YOU_SO, 160, 15);

        register(registry, LEVITATING, ModSoundEvents.MUSIC_DISC_LEVITATING, 203, 15);

        register(registry, COLORS, ModSoundEvents.MUSIC_DISC_COLORS, 261, 15);

        register(registry, RIDE_OR_DIE, ModSoundEvents.MUSIC_DISC_RIDE_OR_DIE, 205, 15);

        register(registry, WHERE_WE_STARTED, ModSoundEvents.MUSIC_DISC_WHERE_WE_STARTED, 244, 15);

        register(registry, PAST_LIVES, ModSoundEvents.MUSIC_DISC_PAST_LIVES, 153, 15);

        register(registry, UMBRELLA, ModSoundEvents.MUSIC_DISC_UMBRELLA, 285, 15);


        //Chinese
        //mihoyo
        register(registry, DEVASTATION_AND_REDEMPTION, ModSoundEvents.MUSIC_DISC_DEVASTATION_AND_REDEMPTION, 160, 15);


        //Other Language
        //mihoyo
        register(registry, NOD_KRAI, ModSoundEvents.MUSIC_DISC_NOD_KRAI, 260, 15);


        //instrumental music
        //mihoyo
        register(registry, THE_PARADE_OF_FLYING_SQUIRRELS, ModSoundEvents.MUSIC_DISC_THE_PARADE_OF_FLYING_SQUIRRELS, 96, 15);

        register(registry, SURASTHANA_FANTASIA, ModSoundEvents.MUSIC_DISC_SURASTHANA_FANTASIA, 141, 15);

        //other
        register(registry, DAY_LIGHT, ModSoundEvents.MUSIC_DISC_DAY_LIGHT, 162, 15);
    }
}