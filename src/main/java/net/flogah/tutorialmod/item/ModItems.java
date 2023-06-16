package net.flogah.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.flogah.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {

	public static final Item CITRINE = registerItem("citrine",
		new Item(new QuiltItemSettings()));

	public static final Item RAW_CITRINE = registerItem("raw_citrine",
		new Item(new QuiltItemSettings()));

	private static Item registerItem(String name, Item item){
		return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
	}

	public static void registerModItems(){
		TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
	}

	public static void addItemsToItemGroup(){
		addToItemGroup(ItemGroups.INGREDIENTS, CITRINE);
		addToItemGroup(ItemGroups.INGREDIENTS, RAW_CITRINE);
	}

	private static void addToItemGroup(ItemGroup group, Item item){
		ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.addItem(item));

		addItemsToItemGroup();
	}

	/*
	public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
		new Item(new QuiltItemSettings()));
	public static final Item TANZANITE = registerItem("tanzanite",
		new Item(new QuiltItemSettings()));
	private static Item registerItem(String name, Item item){
		return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
	}
	public static void registerModItems(){
		TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL_BLOCKS).register(content -> {
			content.addItem(RAW_TANZANITE);
			content.addItem(TANZANITE);
		});
	}

	 */
}
