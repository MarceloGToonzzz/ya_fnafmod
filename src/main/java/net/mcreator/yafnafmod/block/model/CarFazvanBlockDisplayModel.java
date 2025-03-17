package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CarFazvanBlockDisplayItem;

public class CarFazvanBlockDisplayModel extends GeoModel<CarFazvanBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarFazvanBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/car_fazvan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarFazvanBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/car_fazvan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarFazvanBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/car_fazvan.png");
	}
}
