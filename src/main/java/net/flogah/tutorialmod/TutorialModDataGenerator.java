package net.flogah.tutorialmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.flogah.tutorialmod.data.ModLootTableGenerator;
import net.flogah.tutorialmod.data.ModModelProvider;
import net.flogah.tutorialmod.data.ModRecipeGenerator;
import net.flogah.tutorialmod.data.ModWorldGenerator;
import net.flogah.tutorialmod.world.ModConfiguredFeatures;
import net.flogah.tutorialmod.world.ModPlacedFeatures;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistrySetBuilder;

public class TutorialModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModLootTableGenerator::new);
		pack.addProvider(ModRecipeGenerator::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModWorldGenerator::new);
	}

	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder) {
		registryBuilder.add(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.add(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
