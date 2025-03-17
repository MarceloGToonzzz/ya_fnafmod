package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RascBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.RascBlockDisplayItem;

public class RascBlockDisplayItemRenderer extends GeoItemRenderer<RascBlockDisplayItem> {
	public RascBlockDisplayItemRenderer() {
		super(new RascBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(RascBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
