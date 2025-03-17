package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ExoticButterBasketDisplayItem;

public class ExoticButterBasketDisplayModel extends GeoModel<ExoticButterBasketDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ExoticButterBasketDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/exoticbutters.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ExoticButterBasketDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/exoticbutters.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ExoticButterBasketDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/exoticbutter.png");
	}
}
