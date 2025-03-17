package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PinballToyFoxyDisplayModel;
import net.mcreator.yafnafmod.block.display.PinballToyFoxyDisplayItem;

public class PinballToyFoxyDisplayItemRenderer extends GeoItemRenderer<PinballToyFoxyDisplayItem> {
	public PinballToyFoxyDisplayItemRenderer() {
		super(new PinballToyFoxyDisplayModel());
	}

	@Override
	public RenderType getRenderType(PinballToyFoxyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
