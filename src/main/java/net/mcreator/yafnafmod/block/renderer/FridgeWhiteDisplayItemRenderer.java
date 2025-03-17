package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FridgeWhiteDisplayModel;
import net.mcreator.yafnafmod.block.display.FridgeWhiteDisplayItem;

public class FridgeWhiteDisplayItemRenderer extends GeoItemRenderer<FridgeWhiteDisplayItem> {
	public FridgeWhiteDisplayItemRenderer() {
		super(new FridgeWhiteDisplayModel());
	}

	@Override
	public RenderType getRenderType(FridgeWhiteDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
