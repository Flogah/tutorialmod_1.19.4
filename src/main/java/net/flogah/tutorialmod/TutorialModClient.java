package net.flogah.tutorialmod;

import net.fabricmc.api.ClientModInitializer;
import net.flogah.tutorialmod.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;

public class TutorialModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.RED_MAPLE_LEAVES);
  		BlockRenderLayerMap.put(RenderLayer.getCutout(), ModBlocks.RED_MAPLE_SAPLING);
    }
}
