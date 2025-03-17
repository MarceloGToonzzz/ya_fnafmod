package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CarouselFreddyDisplayItem;

public class CarouselFreddyDisplayModel extends GeoModel<CarouselFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarouselFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/carousel_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarouselFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/carousel_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarouselFreddyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/carouselfreddy_classic.png");
	}
}
