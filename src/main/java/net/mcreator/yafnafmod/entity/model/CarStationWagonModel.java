package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.CarStationWagonEntity;

public class CarStationWagonModel extends GeoModel<CarStationWagonEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarStationWagonEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/car_station_wagon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarStationWagonEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/car_station_wagon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarStationWagonEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
