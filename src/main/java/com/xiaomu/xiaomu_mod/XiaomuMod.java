package com.xiaomu.xiaomu_mod;

import com.xiaomu.xiaomu_mod.block.ModBlocks;
import com.xiaomu.xiaomu_mod.item.ModItemGroup;
import com.xiaomu.xiaomu_mod.item.ModItems;
import com.xiaomu.xiaomu_mod.sound.ModSoundEvents;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XiaomuMod implements ModInitializer {
	public static final String MOD_ID = "xiaomu_mod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItems.registerModItems();
		ModItemGroup.registerRecordsGroup();
		ModSoundEvents.registerModSoundEvents();
		ModBlocks.registerModBlocks();

		LOGGER.info("Yoshino, Tohru and all of my waifus are so cute!");
		LOGGER.info("MOD_ID: " + MOD_ID);
		LOGGER.info("Waiting for the game interface to open");
	}
}