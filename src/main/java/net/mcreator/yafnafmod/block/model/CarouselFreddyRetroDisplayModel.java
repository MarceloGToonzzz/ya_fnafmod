package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CarouselFreddyRetroDisplayItem;

public class CarouselFreddyRetroDisplayModel extends GeoModel<CarouselFreddyRetroDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarouselFreddyRetroDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/carousel_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarouselFreddyRetroDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/carousel_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarouselFreddyRetroDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/carouselfreddy_retro.png");
	}
}
