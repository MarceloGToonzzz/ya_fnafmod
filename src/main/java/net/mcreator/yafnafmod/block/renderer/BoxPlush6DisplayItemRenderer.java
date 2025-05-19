package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BoxPlush6DisplayModel;
import net.mcreator.yafnafmod.block.display.BoxPlush6DisplayItem;

public class BoxPlush6DisplayItemRenderer extends GeoItemRenderer<BoxPlush6DisplayItem> {
	public BoxPlush6DisplayItemRenderer() {
		super(new BoxPlush6DisplayModel());
	}

	@Override
	public RenderType getRenderType(BoxPlush6DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
