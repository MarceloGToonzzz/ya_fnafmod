package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BoxPlush1DisplayModel;
import net.mcreator.yafnafmod.block.display.BoxPlush1DisplayItem;

public class BoxPlush1DisplayItemRenderer extends GeoItemRenderer<BoxPlush1DisplayItem> {
	public BoxPlush1DisplayItemRenderer() {
		super(new BoxPlush1DisplayModel());
	}

	@Override
	public RenderType getRenderType(BoxPlush1DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
