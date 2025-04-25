package dev.unowly;

import dev.unowly.item.ModItems;
import dev.unowly.tab.MythicalBlocksTabGroup;
import dev.unowly.tab.MythicalCombatTabGroup;
import dev.unowly.tab.MythicalItemsTabGroup;
import dev.unowly.tab.MythicalToolsTabGroup;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mythical implements ModInitializer {
	public static final String MOD_ID = "mythical";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Mythical initializing...");

	//ITEMS
		ModItems.initialise();

	//TAB
		MythicalBlocksTabGroup.initialise();
		MythicalItemsTabGroup.initialise();
		MythicalToolsTabGroup.initialise();
		MythicalCombatTabGroup.initialise();
	}
}