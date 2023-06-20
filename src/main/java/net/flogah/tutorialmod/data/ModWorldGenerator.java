package net.flogah.tutorialmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.flogah.tutorialmod.TutorialMod;
import net.minecraft.registry.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModWorldGenerator extends FabricDynamicRegistryProvider {
	public ModWorldGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
		super(output, registriesFuture);
	}

	@Override
	protected void configure(HolderLookup.Provider registries, Entries entries) {
		// HERE GOES FUTURE WORLD GEN
	}

	@Override
	public String getName() {
		return TutorialMod.MOD_ID;
	}
}
