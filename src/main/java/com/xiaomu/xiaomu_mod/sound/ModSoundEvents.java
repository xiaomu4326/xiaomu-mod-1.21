package com.xiaomu.xiaomu_mod.sound;

import com.xiaomu.xiaomu_mod.XiaomuMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSoundEvents {
    //Japanese
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_MAID_S1_OPENING = registerReference("music_disc.maid_s1_opening");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_MAID_S1_OPENING_TV_VER = registerReference("music_disc.maid_s1_opening_tv_ver");

    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_MAID_S1_ENDING = registerReference("music_disc.maid_s1_ending");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_MAID_S1_ENDING_TV_VER = registerReference("music_disc.maid_s1_ending_tv_ver");

    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_MAID_S2_OPENING = registerReference("music_disc.maid_s2_opening");

    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_MAID_S2_ENDING = registerReference("music_disc.maid_s2_ending");

    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_DEER_S1_OPENING = registerReference("music_disc.deer_s1_opening");

    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_CAFE_S1_OPENING = registerReference("music_disc.cafe_s1_opening");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_CAFE_S1_OPENING_TV_VER = registerReference("music_disc.cafe_s1_opening_tv_ver");

    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_CAFE_S1_ENDING = registerReference("music_disc.cafe_s1_ending");
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_CAFE_S1_ENDING_TV_VER = registerReference("music_disc.cafe_s1_ending_tv_ver");

    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_SO_LUCKY = registerReference("music_disc.so_lucky");

    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_AT_THE_MERCY_OF_GOD = registerReference("music_disc.at_the_mercy_of_god");

    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_MAGIC_TV_VER_S1_OPENING = registerReference("music_disc.magic_tv_ver_s1_opening");

    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_MAGIC_TV_VER_S1_EPISODE_1_TO_2_ENDING = registerReference("music_disc.magic_tv_ver_s1_episode_1_to_2_ending");

    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_MAGIC_TV_VER_S1_EPISODE_3_TO_11_ENDING = registerReference("music_disc.magic_tv_ver_s1_episode_3_to_11_ending");

    //English
    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_PASSING_MEMORIES = registerReference("music_disc.passing_memories");

    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_CALL_OF_SILENCE = registerReference("music_disc.call_of_silence");

    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_DUVET = registerReference("music_disc.duvet");

    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_I_LOVE_YOU_SO = registerReference("music_disc.i_love_you_so");

    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_DAY_LIGHT = registerReference("music_disc.day_light");


    private static SoundEvent register(String name){
        Identifier id = Identifier.of(XiaomuMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    private static RegistryEntry.Reference<SoundEvent> registerReference(String name){
        Identifier id = Identifier.of(XiaomuMod.MOD_ID, name);
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerModSoundEvents(){
    }
}
