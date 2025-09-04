package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CarouselDisplayItem;

public class CarouselDisplayModel extends GeoModel<CarouselDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarouselDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/carousel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarouselDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/carousel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarouselDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/retro-carousel.png");
	}
}
