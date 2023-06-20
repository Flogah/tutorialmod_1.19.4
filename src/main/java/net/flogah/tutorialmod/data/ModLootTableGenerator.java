package net.flogah.tutorialmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.flogah.tutorialmod.block.ModBlocks;
import net.flogah.tutorialmod.item.ModItems;
import net.minecraft.item.ItemConvertible;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
	public ModLootTableGenerator(FabricDataOutput dataOutput) {
		super(dataOutput);
	}

	@Override
	public void generate() {
		addDrop(ModBlocks.CITRINE_BLOCK);

		add(ModBlocks.CITRINE_ORE, oreDrops(ModBlocks.CITRINE_ORE, ModItems.RAW_CITRINE));
		add(ModBlocks.DEEPSLATE_CITRINE_ORE, oreDrops(ModBlocks.DEEPSLATE_CITRINE_ORE, ModItems.RAW_CITRINE));

	}
}
