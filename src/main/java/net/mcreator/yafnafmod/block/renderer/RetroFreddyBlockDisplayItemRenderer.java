package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RetroFreddyBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.RetroFreddyBlockDisplayItem;

public class RetroFreddyBlockDisplayItemRenderer extends GeoItemRenderer<RetroFreddyBlockDisplayItem> {
	public RetroFreddyBlockDisplayItemRenderer() {
		super(new RetroFreddyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(RetroFreddyBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
