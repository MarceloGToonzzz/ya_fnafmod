package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.WideFanDisplayModel;
import net.mcreator.yafnafmod.block.display.WideFanDisplayItem;

public class WideFanDisplayItemRenderer extends GeoItemRenderer<WideFanDisplayItem> {
	public WideFanDisplayItemRenderer() {
		super(new WideFanDisplayModel());
	}

	@Override
	public RenderType getRenderType(WideFanDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
