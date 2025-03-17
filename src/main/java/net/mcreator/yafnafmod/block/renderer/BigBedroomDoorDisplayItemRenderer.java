package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigBedroomDoorDisplayModel;
import net.mcreator.yafnafmod.block.display.BigBedroomDoorDisplayItem;

public class BigBedroomDoorDisplayItemRenderer extends GeoItemRenderer<BigBedroomDoorDisplayItem> {
	public BigBedroomDoorDisplayItemRenderer() {
		super(new BigBedroomDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigBedroomDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
