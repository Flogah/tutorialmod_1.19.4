package net.flogah.tutorialmod.world;

import net.flogah.tutorialmod.block.ModBlocks;
import net.flogah.tutorialmod.TutorialMod;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.BootstrapContext;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.util.PlacedFeatureUtil;

import java.util.List;

public class ModPlacedFeatures {

	/*
	public static final RegistryKey<PlacedFeature> RED_MAPLE_PLACED_KEY = registerKey("red_maple_placed");

	public static void bootstrap(BootstrapContext<PlacedFeature> context) {
		var configuredFeatureRegistryEntryLookup = context.lookup(RegistryKeys.CONFIGURED_FEATURE);

		register(context, RED_MAPLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getHolderOrThrow(ModConfiguredFeatures.RED_MAPLE_KEY),
			//PlacedFeatureUtil.createCountExtraModifier(1, 0.1f, 2), PlacedFeatureUtil.createWouldSurvivePlacementModifier(ModBlocks.RED_MAPLE_SAPLING));
			VegetationPlacedFeatures.modifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1f, 2), ModBlocks.RED_MAPLE_SAPLING));
	}

	public static RegistryKey<PlacedFeature> registerKey(String name) {
		return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TutorialMod.MOD_ID, name));
	}

	private static void register(BootstrapContext<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
								 List<PlacementModifier> modifiers) {
		context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
	}

	private static <FC extends FeatureConfig, F extends Feature<FC>> void register(BootstrapContext<PlacedFeature> context, RegistryKey<PlacedFeature> key,
																				   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
																				   PlacementModifier... modifiers) {
		register(context, key, configuration, List.of(modifiers));
	}

	 */
}
