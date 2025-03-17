package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.EmptyExoticButterBasketDisplayModel;
import net.mcreator.yafnafmod.block.display.EmptyExoticButterBasketDisplayItem;

public class EmptyExoticButterBasketDisplayItemRenderer extends GeoItemRenderer<EmptyExoticButterBasketDisplayItem> {
	public EmptyExoticButterBasketDisplayItemRenderer() {
		super(new EmptyExoticButterBasketDisplayModel());
	}

	@Override
	public RenderType getRenderType(EmptyExoticButterBasketDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
