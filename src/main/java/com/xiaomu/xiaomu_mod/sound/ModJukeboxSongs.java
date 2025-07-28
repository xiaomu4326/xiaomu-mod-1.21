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
    RegistryKey<JukeboxSong> MAID_S1_OPENING = of("maid_s1_opening");
    RegistryKey<JukeboxSong> MAID_S1_OPENING_TV_VER = of("maid_s1_opening_tv_ver");

    RegistryKey<JukeboxSong> MAID_S1_ENDING = of("maid_s1_ending");
    RegistryKey<JukeboxSong> MAID_S1_ENDING_TV_VER = of("maid_s1_ending_tv_ver");

    RegistryKey<JukeboxSong> MAID_S2_OPENING = of("maid_s2_opening");
    RegistryKey<JukeboxSong> MAID_S2_OPENING_TV_VER = of("maid_s2_opening_tv_ver");

    RegistryKey<JukeboxSong> MAID_S2_ENDING = of("maid_s2_ending");
    RegistryKey<JukeboxSong> MAID_S2_ENDING_TV_VER = of("maid_s2_ending_tv_ver");

    RegistryKey<JukeboxSong> DEER_S1_OPENING = of("deer_s1_opening");

    RegistryKey<JukeboxSong> CAFE_S1_OPENING = of("cafe_s1_opening");
    RegistryKey<JukeboxSong> CAFE_S1_OPENING_TV_VER = of("cafe_s1_opening_tv_ver");

    RegistryKey<JukeboxSong> CAFE_S1_ENDING = of("cafe_s1_ending");
    RegistryKey<JukeboxSong> CAFE_S1_ENDING_TV_VER = of("cafe_s1_ending_tv_ver");

    RegistryKey<JukeboxSong> SO_LUCKY = of("so_lucky");

    RegistryKey<JukeboxSong> AT_THE_MERCY_OF_GOD = of("at_the_mercy_of_god");

    RegistryKey<JukeboxSong> MAGIC_TV_VER_S1_OPENING = of("magic_tv_ver_s1_opening");

    RegistryKey<JukeboxSong> MAGIC_TV_VER_S1_EPISODE_1_TO_2_ENDING = of("magic_tv_ver_s1_episode_1_to_2_ending");

    RegistryKey<JukeboxSong> MAGIC_TV_VER_S1_EPISODE_3_TO_11_ENDING = of("magic_tv_ver_s1_episode_3_to_11_ending");

    RegistryKey<JukeboxSong> MAGIC_MOVIE_VER_S1_TO_S2_OPENING = of("magic_movie_ver_s1_to_s2_opening");

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

    RegistryKey<JukeboxSong> SLEEP_S1_OPENING = of("sleep_s1_opening");

    //English
    RegistryKey<JukeboxSong> PASSING_MEMORIES = of("passing_memories");

    RegistryKey<JukeboxSong> CALL_OF_SILENCE = of("call_of_silence");

    RegistryKey<JukeboxSong> DUVET = of("duvet");

    RegistryKey<JukeboxSong> I_LOVE_YOU_SO = of("i_love_you_so");

    RegistryKey<JukeboxSong> DAY_LIGHT = of("day_light");

    RegistryKey<JukeboxSong> HOPE_IS_THE_THING_WITH_FEATHERS = of("hope_is_the_thing_with_feathers");

    RegistryKey<JukeboxSong> SWAY_TO_MY_BEAT_IN_COSMOS = of("sway_to_my_beat_in_cosmos");

    RegistryKey<JukeboxSong> LEVITATING = of("levitating");

    RegistryKey<JukeboxSong> COLORS = of("colors");

    RegistryKey<JukeboxSong> RIDE_OR_DIE = of("ride_or_die");

    RegistryKey<JukeboxSong> WHERE_WE_STARTED = of("where_we_started");

    RegistryKey<JukeboxSong> PAST_LIVES = of("past_lives");


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
        register(registry, MAID_S1_OPENING, ModSoundEvents.MUSIC_DISC_MAID_S1_OPENING, 277, 15);
        register(registry, MAID_S1_OPENING_TV_VER, ModSoundEvents.MUSIC_DISC_MAID_S1_OPENING_TV_VER, 95, 15);

        register(registry, MAID_S1_ENDING, ModSoundEvents.MUSIC_DISC_MAID_S1_ENDING, 246, 15);
        register(registry, MAID_S1_ENDING_TV_VER, ModSoundEvents.MUSIC_DISC_MAID_S1_ENDING_TV_VER, 90, 15);

        register(registry, MAID_S2_OPENING, ModSoundEvents.MUSIC_DISC_MAID_S2_OPENING, 284, 15);
        register(registry, MAID_S2_OPENING_TV_VER, ModSoundEvents.MUSIC_DISC_MAID_S2_OPENING_TV_VER, 88, 15);

        register(registry, MAID_S2_ENDING, ModSoundEvents.MUSIC_DISC_MAID_S2_ENDING, 222, 15);
        register(registry, MAID_S2_ENDING_TV_VER, ModSoundEvents.MUSIC_DISC_MAID_S2_ENDING_TV_VER, 92, 15);

        register(registry, DEER_S1_OPENING, ModSoundEvents.MUSIC_DISC_DEER_S1_OPENING, 201, 15);

        register(registry, CAFE_S1_OPENING, ModSoundEvents.MUSIC_DISC_CAFE_S1_OPENING, 255, 15);
        register(registry, CAFE_S1_OPENING_TV_VER, ModSoundEvents.MUSIC_DISC_CAFE_S1_OPENING_TV_VER, 91, 15);

        register(registry, CAFE_S1_ENDING, ModSoundEvents.MUSIC_DISC_CAFE_S1_ENDING, 274, 15);
        register(registry, CAFE_S1_ENDING_TV_VER, ModSoundEvents.MUSIC_DISC_CAFE_S1_ENDING_TV_VER, 92, 15);

        register(registry, SO_LUCKY, ModSoundEvents.MUSIC_DISC_SO_LUCKY, 193, 15);

        register(registry, AT_THE_MERCY_OF_GOD, ModSoundEvents.MUSIC_DISC_AT_THE_MERCY_OF_GOD, 255, 15);

        register(registry, MAGIC_TV_VER_S1_OPENING, ModSoundEvents.MUSIC_DISC_MAGIC_TV_VER_S1_OPENING, 270, 15);

        register(registry, MAGIC_TV_VER_S1_EPISODE_1_TO_2_ENDING, ModSoundEvents.MUSIC_DISC_MAGIC_TV_VER_S1_EPISODE_1_TO_2_ENDING, 264, 15);

        register(registry, MAGIC_TV_VER_S1_EPISODE_3_TO_11_ENDING, ModSoundEvents.MUSIC_DISC_MAGIC_TV_VER_S1_EPISODE_3_TO_11_ENDING, 313, 15);

        register(registry, MAGIC_MOVIE_VER_S1_TO_S2_OPENING, ModSoundEvents.MUSIC_DISC_MAGIC_MOVIE_VER_S1_TO_S2_OPENING, 248, 15);

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

        register(registry, SLEEP_S1_OPENING, ModSoundEvents.MUSIC_DISC_SLEEP_S1_OPENING, 220, 15);


        //English
        register(registry, PASSING_MEMORIES, ModSoundEvents.MUSIC_DISC_PASSING_MEMORIES, 219, 15);

        register(registry, CALL_OF_SILENCE, ModSoundEvents.MUSIC_DISC_CALL_OF_SILENCE, 178, 15);

        register(registry, DUVET, ModSoundEvents.MUSIC_DISC_DUVET, 203, 15);

        register(registry, I_LOVE_YOU_SO, ModSoundEvents.MUSIC_DISC_I_LOVE_YOU_SO, 160, 15);

        register(registry, DAY_LIGHT, ModSoundEvents.MUSIC_DISC_DAY_LIGHT, 162, 15);

        register(registry, HOPE_IS_THE_THING_WITH_FEATHERS, ModSoundEvents.MUSIC_DISC_HOPE_IS_THE_THING_WITH_FEATHERS, 230, 15);

        register(registry, SWAY_TO_MY_BEAT_IN_COSMOS, ModSoundEvents.MUSIC_DISC_SWAY_TO_MY_BEAT_IN_COSMOS, 165, 15);

        register(registry, LEVITATING, ModSoundEvents.MUSIC_DISC_LEVITATING, 203, 15);

        register(registry, COLORS, ModSoundEvents.MUSIC_DISC_COLORS, 261, 15);

        register(registry, RIDE_OR_DIE, ModSoundEvents.MUSIC_DISC_RIDE_OR_DIE, 205, 15);

        register(registry, WHERE_WE_STARTED, ModSoundEvents.MUSIC_DISC_WHERE_WE_STARTED, 244, 15);

        register(registry, PAST_LIVES, ModSoundEvents.MUSIC_DISC_PAST_LIVES, 153, 15);
    }
}