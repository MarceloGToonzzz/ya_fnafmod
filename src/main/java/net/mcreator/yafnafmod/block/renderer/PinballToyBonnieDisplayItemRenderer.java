package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PinballToyBonnieDisplayModel;
import net.mcreator.yafnafmod.block.display.PinballToyBonnieDisplayItem;

public class PinballToyBonnieDisplayItemRenderer extends GeoItemRenderer<PinballToyBonnieDisplayItem> {
	public PinballToyBonnieDisplayItemRenderer() {
		super(new PinballToyBonnieDisplayModel());
	}

	@Override
	public RenderType getRenderType(PinballToyBonnieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
