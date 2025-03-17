package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CarStationWagonBlockDisplayItem;

public class CarStationWagonBlockDisplayModel extends GeoModel<CarStationWagonBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarStationWagonBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/car_station_wagon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarStationWagonBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/car_station_wagon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarStationWagonBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/car_station_wagon.png");
	}
}
