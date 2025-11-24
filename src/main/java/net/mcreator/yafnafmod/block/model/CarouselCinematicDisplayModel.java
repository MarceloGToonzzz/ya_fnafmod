package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CarouselCinematicDisplayItem;

public class CarouselCinematicDisplayModel extends GeoModel<CarouselCinematicDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarouselCinematicDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/carousel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarouselCinematicDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/carousel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarouselCinematicDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/retro-carousel_movie.png");
	}
}
