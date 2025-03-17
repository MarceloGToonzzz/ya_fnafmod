package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.GarfeldDisplayModel;
import net.mcreator.yafnafmod.block.display.GarfeldDisplayItem;

public class GarfeldDisplayItemRenderer extends GeoItemRenderer<GarfeldDisplayItem> {
	public GarfeldDisplayItemRenderer() {
		super(new GarfeldDisplayModel());
	}

	@Override
	public RenderType getRenderType(GarfeldDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
