package net.flogah.tutorialmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.flogah.tutorialmod.block.ModBlocks;
import net.flogah.tutorialmod.item.ModItems;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.BlockStateModelGenerator;
import net.minecraft.data.client.model.Models;

public class ModModelProvider extends FabricModelProvider {
	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CITRINE_BLOCK);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CITRINE_ORE);
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_CITRINE_ORE);
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		itemModelGenerator.register(ModItems.CITRINE, Models.SINGLE_LAYER_ITEM);
		itemModelGenerator.register(ModItems.RAW_CITRINE, Models.SINGLE_LAYER_ITEM);
	}
}
