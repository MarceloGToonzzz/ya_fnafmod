package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RetroFreddyHeadDisplayModel;
import net.mcreator.yafnafmod.block.display.RetroFreddyHeadDisplayItem;

public class RetroFreddyHeadDisplayItemRenderer extends GeoItemRenderer<RetroFreddyHeadDisplayItem> {
	public RetroFreddyHeadDisplayItemRenderer() {
		super(new RetroFreddyHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(RetroFreddyHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
