package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FridgeGrayDisplayModel;
import net.mcreator.yafnafmod.block.display.FridgeGrayDisplayItem;

public class FridgeGrayDisplayItemRenderer extends GeoItemRenderer<FridgeGrayDisplayItem> {
	public FridgeGrayDisplayItemRenderer() {
		super(new FridgeGrayDisplayModel());
	}

	@Override
	public RenderType getRenderType(FridgeGrayDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
