package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CarHarleyMotorcycleBlockTileEntity;

public class CarHarleyMotorcycleBlockBlockModel extends GeoModel<CarHarleyMotorcycleBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarHarleyMotorcycleBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/car_harley_motorcycle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarHarleyMotorcycleBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/car_harley_motorcycle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarHarleyMotorcycleBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/car_harley_motorcycle_fritz.png");
	}
}
