package com.xiaomu.xiaomu_mod.sound;

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

    RegistryKey<JukeboxSong> MAGIC_MOVIE_VER_S2_ENDING = of("magic_movie_ver_s2_ending");

    RegistryKey<JukeboxSong> MAGIC_MOVIE_VER_S3_OPENING = of("magic_movie_ver_s3_opening");

    RegistryKey<JukeboxSong> MAGIC_MOVIE_VER_S3_EPISODE = of("magic_movie_ver_s3_episode");

    RegistryKey<JukeboxSong> MAGIC_MOVIE_VER_S3_ENDING = of("magic_movie_ver_s3_ending");

    RegistryKey<JukeboxSong> SENREN_BANKA_OPENING = of("senren_banka_opening");
    RegistryKey<JukeboxSong> SENREN_BANKA_OPENING_GAME_VER = of("senren_banka_opening_game_ver");

    RegistryKey<JukeboxSong> SENREN_BANKA_YOSHINO = of("senren_banka_yoshino");
    RegistryKey<JukeboxSong> SENREN_BANKA_YOSHINO_INSTRUMENT_VER = of("senren_banka_yoshino_instrument_ver");
    RegistryKey<JukeboxSong> SENREN_BANKA_YOSHINO_QUIET_VER = of("senren_banka_yoshino_quiet_ver");

    RegistryKey<JukeboxSong> SENREN_BANKA_YOSHINO_ENDING = of("senren_banka_yoshino_ending");

    RegistryKey<JukeboxSong> SENREN_BANKA_MURASAME = of("senren_banka_murasame");
    RegistryKey<JukeboxSong> SENREN_BANKA_MURASAME_INSTRUMENT_VER = of("senren_banka_murasame_instrument_ver");
    RegistryKey<JukeboxSong> SENREN_BANKA_MURASAME_QUIET_VER = of("senren_banka_murasame_quiet_ver");

    RegistryKey<JukeboxSong> SENREN_BANKA_MURASAME_ENDING = of("senren_banka_murasame_ending");

    RegistryKey<JukeboxSong> SENREN_BANKA_MAKO = of("senren_banka_mako");

    RegistryKey<JukeboxSong> SENREN_BANKA_MAKO_ENDING = of("senren_banka_mako_ending");

    RegistryKey<JukeboxSong> SENREN_BANKA_LENA = of("senren_banka_lena");

    RegistryKey<JukeboxSong> SENREN_BANKA_LENA_ENDING = of("senren_banka_lena_ending");

    RegistryKey<JukeboxSong> RIDDLE_JOKER_OPENING = of("riddle_joker_opening");

    RegistryKey<JukeboxSong> SLEEP_S1_OPENING = of("sleep_s1_opening");

    RegistryKey<JukeboxSong> SISTER_S1_OPENING = of("sister_s1_opening");
    RegistryKey<JukeboxSong> SISTER_S1_OPENING_TV_VER = of("sister_s1_opening_tv_ver");

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

        register(registry, MAGIC_MOVIE_VER_S2_ENDING, ModSoundEvents.MUSIC_DISC_MAGIC_MOVIE_VER_S2_ENDING, 293, 15);

        register(registry, MAGIC_MOVIE_VER_S3_OPENING, ModSoundEvents.MUSIC_DISC_MAGIC_MOVIE_VER_S3_OPENING, 272, 15);

        register(registry, MAGIC_MOVIE_VER_S3_EPISODE, ModSoundEvents.MUSIC_DISC_MAGIC_MOVIE_VER_S3_EPISODE, 243, 15);

        register(registry, MAGIC_MOVIE_VER_S3_ENDING, ModSoundEvents.MUSIC_DISC_MAGIC_MOVIE_VER_S3_ENDING, 306, 15);

        register(registry, SENREN_BANKA_OPENING, ModSoundEvents.MUSIC_DISC_SENREN_BANKA_OPENING, 237, 15);
        register(registry, SENREN_BANKA_OPENING_GAME_VER, ModSoundEvents.MUSIC_DISC_SENREN_BANKA_OPENING_GAME_VER, 107, 15);

        register(registry, SENREN_BANKA_YOSHINO, ModSoundEvents.MUSIC_DISC_SENREN_BANKA_YOSHINO, 205, 15);
        register(registry, SENREN_BANKA_YOSHINO_INSTRUMENT_VER, ModSoundEvents.MUSIC_DISC_SENREN_BANKA_YOSHINO_INSTRUMENT_VER, 156, 15);
        register(registry, SENREN_BANKA_YOSHINO_QUIET_VER, ModSoundEvents.MUSIC_DISC_SENREN_BANKA_YOSHINO_QUIET_VER, 99, 15);

        register(registry, SENREN_BANKA_YOSHINO_ENDING, ModSoundEvents.MUSIC_DISC_SENREN_BANKA_YOSHINO_ENDING, 343, 15);

        register(registry, SENREN_BANKA_MURASAME, ModSoundEvents.MUSIC_DISC_SENREN_BANKA_MURASAME, 231, 15);
        register(registry, SENREN_BANKA_MURASAME_INSTRUMENT_VER, ModSoundEvents.MUSIC_DISC_SENREN_BANKA_MURASAME_INSTRUMENT_VER, 207, 15);
        register(registry, SENREN_BANKA_MURASAME_QUIET_VER, ModSoundEvents.MUSIC_DISC_SENREN_BANKA_MURASAME_QUIET_VER, 135, 15);

        register(registry, SENREN_BANKA_MURASAME_ENDING, ModSoundEvents.MUSIC_DISC_SENREN_BANKA_MURASAME_ENDING, 250, 15);

        register(registry, SENREN_BANKA_MAKO, ModSoundEvents.MUSIC_DISC_SENREN_BANKA_MAKO, 225, 15);

        register(registry, SENREN_BANKA_MAKO_ENDING, ModSoundEvents.MUSIC_DISC_SENREN_BANKA_MAKO_ENDING, 289, 15);

        register(registry, SENREN_BANKA_LENA, ModSoundEvents.MUSIC_DISC_SENREN_BANKA_LENA, 194, 15);

        register(registry, SENREN_BANKA_LENA_ENDING, ModSoundEvents.MUSIC_DISC_SENREN_BANKA_LENA_ENDING, 464, 15);

        register(registry, RIDDLE_JOKER_OPENING, ModSoundEvents.MUSIC_DISC_RIDDLE_JOKER_OPENING, 226, 15);

        register(registry, SLEEP_S1_OPENING, ModSoundEvents.MUSIC_DISC_SLEEP_S1_OPENING, 220, 15);

        register(registry, SISTER_S1_OPENING, ModSoundEvents.MUSIC_DISC_SISTER_S1_OPENING, 243, 15);
        register(registry, SISTER_S1_OPENING_TV_VER, ModSoundEvents.MUSIC_DISC_SISTER_S1_OPENING_TV_VER, 92, 15);


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