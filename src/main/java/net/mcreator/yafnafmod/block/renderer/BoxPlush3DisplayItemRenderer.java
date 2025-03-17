package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BoxPlush3DisplayModel;
import net.mcreator.yafnafmod.block.display.BoxPlush3DisplayItem;

public class BoxPlush3DisplayItemRenderer extends GeoItemRenderer<BoxPlush3DisplayItem> {
	public BoxPlush3DisplayItemRenderer() {
		super(new BoxPlush3DisplayModel());
	}

	@Override
	public RenderType getRenderType(BoxPlush3DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
