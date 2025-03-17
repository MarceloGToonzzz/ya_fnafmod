package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CarFazvanBlockTileEntity;

public class CarFazvanBlockBlockModel extends GeoModel<CarFazvanBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarFazvanBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/car_fazvan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarFazvanBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/car_fazvan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarFazvanBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/car_fazvan.png");
	}
}
