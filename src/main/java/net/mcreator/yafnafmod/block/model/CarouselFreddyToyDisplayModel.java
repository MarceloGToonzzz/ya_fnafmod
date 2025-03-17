package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CarouselFreddyToyDisplayItem;

public class CarouselFreddyToyDisplayModel extends GeoModel<CarouselFreddyToyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarouselFreddyToyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/carousel_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarouselFreddyToyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/carousel_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarouselFreddyToyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/carouselfreddy_toy.png");
	}
}
