package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CarFazvanPropTileEntity;

public class CarFazvanPropBlockModel extends GeoModel<CarFazvanPropTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarFazvanPropTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/car_fazvan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarFazvanPropTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/car_fazvan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarFazvanPropTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/car_fazvan_prop.png");
	}
}
