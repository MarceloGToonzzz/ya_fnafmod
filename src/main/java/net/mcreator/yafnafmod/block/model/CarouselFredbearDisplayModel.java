package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CarouselFredbearDisplayItem;

public class CarouselFredbearDisplayModel extends GeoModel<CarouselFredbearDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarouselFredbearDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/carousel_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarouselFredbearDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/carousel_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarouselFredbearDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/carouselfreddy_fredbear.png");
	}
}
