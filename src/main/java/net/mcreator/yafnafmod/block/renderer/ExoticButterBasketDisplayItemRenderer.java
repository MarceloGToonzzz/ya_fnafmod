package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ExoticButterBasketDisplayModel;
import net.mcreator.yafnafmod.block.display.ExoticButterBasketDisplayItem;

public class ExoticButterBasketDisplayItemRenderer extends GeoItemRenderer<ExoticButterBasketDisplayItem> {
	public ExoticButterBasketDisplayItemRenderer() {
		super(new ExoticButterBasketDisplayModel());
	}

	@Override
	public RenderType getRenderType(ExoticButterBasketDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
