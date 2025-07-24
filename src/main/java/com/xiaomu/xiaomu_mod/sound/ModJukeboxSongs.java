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

    RegistryKey<JukeboxSong> MAID_S2_ENDING = of("maid_s2_ending");

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

    RegistryKey<JukeboxSong> SENREN_BANKA_OPENING = of("senren_banka_opening");
    RegistryKey<JukeboxSong> SENREN_BANKA_OPENING_GAME_VER = of("senren_banka_opening_game_ver");

    //English
    RegistryKey<JukeboxSong> PASSING_MEMORIES = of("passing_memories");

    RegistryKey<JukeboxSong> CALL_OF_SILENCE = of("call_of_silence");

    RegistryKey<JukeboxSong> DUVET = of("duvet");

    RegistryKey<JukeboxSong> I_LOVE_YOU_SO = of("i_love_you_so");

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
        register(registry, MAID_S1_OPENING, ModSoundEvents.MUSIC_DISC_MAID_S1_OPENING, 227, 15);
        register(registry, MAID_S1_OPENING_TV_VER, ModSoundEvents.MUSIC_DISC_MAID_S1_OPENING_TV_VER, 95, 15);

        register(registry, MAID_S1_ENDING, ModSoundEvents.MUSIC_DISC_MAID_S1_ENDING, 246, 15);
        register(registry, MAID_S1_ENDING_TV_VER, ModSoundEvents.MUSIC_DISC_MAID_S1_ENDING_TV_VER, 90, 15);

        register(registry, MAID_S2_OPENING, ModSoundEvents.MUSIC_DISC_MAID_S2_OPENING, 284, 15);

        register(registry, MAID_S2_ENDING, ModSoundEvents.MUSIC_DISC_MAID_S2_ENDING, 222, 15);

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

        register(registry, SENREN_BANKA_OPENING, ModSoundEvents.MUSIC_DISC_SENREN_BANKA_OPENING, 237, 15);
        register(registry, SENREN_BANKA_OPENING_GAME_VER, ModSoundEvents.MUSIC_DISC_SENREN_BANKA_OPENING_GAME_VER, 107, 15);


        //English
        register(registry, PASSING_MEMORIES, ModSoundEvents.MUSIC_DISC_PASSING_MEMORIES, 219, 15);

        register(registry, CALL_OF_SILENCE, ModSoundEvents.MUSIC_DISC_CALL_OF_SILENCE, 178, 15);

        register(registry, DUVET, ModSoundEvents.MUSIC_DISC_DUVET, 203, 15);

        register(registry, I_LOVE_YOU_SO, ModSoundEvents.MUSIC_DISC_I_LOVE_YOU_SO, 160, 15);

        register(registry, DAY_LIGHT, ModSoundEvents.MUSIC_DISC_DAY_LIGHT, 162, 15);
    }
}
