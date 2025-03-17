package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.EmptyExoticButterBasketDisplayItem;

public class EmptyExoticButterBasketDisplayModel extends GeoModel<EmptyExoticButterBasketDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(EmptyExoticButterBasketDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/exoticbutters.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EmptyExoticButterBasketDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/exoticbutters.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EmptyExoticButterBasketDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/exoticbutter_empty.png");
	}
}
