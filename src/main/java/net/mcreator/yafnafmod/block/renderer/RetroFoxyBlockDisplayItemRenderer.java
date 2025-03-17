package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RetroFoxyBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.RetroFoxyBlockDisplayItem;

public class RetroFoxyBlockDisplayItemRenderer extends GeoItemRenderer<RetroFoxyBlockDisplayItem> {
	public RetroFoxyBlockDisplayItemRenderer() {
		super(new RetroFoxyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(RetroFoxyBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
