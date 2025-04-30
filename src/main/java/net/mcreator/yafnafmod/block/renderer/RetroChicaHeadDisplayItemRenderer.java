package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RetroChicaHeadDisplayModel;
import net.mcreator.yafnafmod.block.display.RetroChicaHeadDisplayItem;

public class RetroChicaHeadDisplayItemRenderer extends GeoItemRenderer<RetroChicaHeadDisplayItem> {
	public RetroChicaHeadDisplayItemRenderer() {
		super(new RetroChicaHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(RetroChicaHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
