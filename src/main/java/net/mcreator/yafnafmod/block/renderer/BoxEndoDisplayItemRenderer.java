package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BoxEndoDisplayModel;
import net.mcreator.yafnafmod.block.display.BoxEndoDisplayItem;

public class BoxEndoDisplayItemRenderer extends GeoItemRenderer<BoxEndoDisplayItem> {
	public BoxEndoDisplayItemRenderer() {
		super(new BoxEndoDisplayModel());
	}

	@Override
	public RenderType getRenderType(BoxEndoDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
