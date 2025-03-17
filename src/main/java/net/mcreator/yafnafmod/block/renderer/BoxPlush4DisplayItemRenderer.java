package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BoxPlush4DisplayModel;
import net.mcreator.yafnafmod.block.display.BoxPlush4DisplayItem;

public class BoxPlush4DisplayItemRenderer extends GeoItemRenderer<BoxPlush4DisplayItem> {
	public BoxPlush4DisplayItemRenderer() {
		super(new BoxPlush4DisplayModel());
	}

	@Override
	public RenderType getRenderType(BoxPlush4DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
