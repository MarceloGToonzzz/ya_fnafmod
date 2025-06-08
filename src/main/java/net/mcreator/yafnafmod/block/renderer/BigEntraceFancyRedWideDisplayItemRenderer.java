package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigEntraceFancyRedWideDisplayModel;
import net.mcreator.yafnafmod.block.display.BigEntraceFancyRedWideDisplayItem;

public class BigEntraceFancyRedWideDisplayItemRenderer extends GeoItemRenderer<BigEntraceFancyRedWideDisplayItem> {
	public BigEntraceFancyRedWideDisplayItemRenderer() {
		super(new BigEntraceFancyRedWideDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigEntraceFancyRedWideDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
