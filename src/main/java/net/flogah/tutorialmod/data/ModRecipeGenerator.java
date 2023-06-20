package net.flogah.tutorialmod.data;

import com.ibm.icu.text.Normalizer2;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.flogah.tutorialmod.block.ModBlocks;
import net.flogah.tutorialmod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonFactory;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonFactory;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeCategory;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
	public ModRecipeGenerator(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
		offerSmelting(exporter, List.of(ModItems.RAW_CITRINE), RecipeCategory.MISC, ModItems.CITRINE,
			3f, 200, "citrine");

		offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CITRINE, RecipeCategory.MISC,
			ModBlocks.CITRINE_BLOCK);

		// JUST AN EXAMPLE
		ShapedRecipeJsonFactory.create(RecipeCategory.MISC, ModItems.RAW_CITRINE)
			.pattern("SSS")
			.pattern("SCS")
			.pattern("SSS")
			.ingredient('S', Items.STONE)
			.ingredient('C', ModItems.CITRINE)
			.criterion(FabricRecipeProvider.hasItem(Items.STONE),
					FabricRecipeProvider.conditionsFromItem(Items.STONE))
			.criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE),
					FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE))
			.offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RAW_CITRINE)));

		//redmaple wood
		offerShapelessRecipe(exporter, ModBlocks.RED_MAPLE_PLANKS, ModBlocks.RED_MAPLE_LOG, "citrine", 4);

	}
}
