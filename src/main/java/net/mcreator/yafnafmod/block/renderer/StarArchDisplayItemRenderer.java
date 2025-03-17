package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.StarArchDisplayModel;
import net.mcreator.yafnafmod.block.display.StarArchDisplayItem;

public class StarArchDisplayItemRenderer extends GeoItemRenderer<StarArchDisplayItem> {
	public StarArchDisplayItemRenderer() {
		super(new StarArchDisplayModel());
	}

	@Override
	public RenderType getRenderType(StarArchDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
