package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RetroChicaBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.RetroChicaBlockDisplayItem;

public class RetroChicaBlockDisplayItemRenderer extends GeoItemRenderer<RetroChicaBlockDisplayItem> {
	public RetroChicaBlockDisplayItemRenderer() {
		super(new RetroChicaBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(RetroChicaBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
