package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.GusThePugBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.GusThePugBlockDisplayItem;

public class GusThePugBlockDisplayItemRenderer extends GeoItemRenderer<GusThePugBlockDisplayItem> {
	public GusThePugBlockDisplayItemRenderer() {
		super(new GusThePugBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(GusThePugBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
