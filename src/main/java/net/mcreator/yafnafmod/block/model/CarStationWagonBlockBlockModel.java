package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CarStationWagonBlockTileEntity;

public class CarStationWagonBlockBlockModel extends GeoModel<CarStationWagonBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarStationWagonBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/car_station_wagon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarStationWagonBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/car_station_wagon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarStationWagonBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/car_station_wagon.png");
	}
}
