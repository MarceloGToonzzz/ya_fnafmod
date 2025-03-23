package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.IgnitedChicaBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.IgnitedChicaBlockDisplayItem;

public class IgnitedChicaBlockDisplayItemRenderer extends GeoItemRenderer<IgnitedChicaBlockDisplayItem> {
	public IgnitedChicaBlockDisplayItemRenderer() {
		super(new IgnitedChicaBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(IgnitedChicaBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
