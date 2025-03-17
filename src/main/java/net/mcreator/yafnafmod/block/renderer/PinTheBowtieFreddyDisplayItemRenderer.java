package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PinTheBowtieFreddyDisplayModel;
import net.mcreator.yafnafmod.block.display.PinTheBowtieFreddyDisplayItem;

public class PinTheBowtieFreddyDisplayItemRenderer extends GeoItemRenderer<PinTheBowtieFreddyDisplayItem> {
	public PinTheBowtieFreddyDisplayItemRenderer() {
		super(new PinTheBowtieFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(PinTheBowtieFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
