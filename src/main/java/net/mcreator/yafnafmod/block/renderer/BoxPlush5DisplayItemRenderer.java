package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BoxPlush5DisplayModel;
import net.mcreator.yafnafmod.block.display.BoxPlush5DisplayItem;

public class BoxPlush5DisplayItemRenderer extends GeoItemRenderer<BoxPlush5DisplayItem> {
	public BoxPlush5DisplayItemRenderer() {
		super(new BoxPlush5DisplayModel());
	}

	@Override
	public RenderType getRenderType(BoxPlush5DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
