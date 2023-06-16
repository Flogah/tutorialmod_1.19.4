package net.flogah.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.flogah.tutorialmod.block.ModBlocks;
import net.flogah.tutorialmod.item.ModItemGroup;
import net.flogah.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
