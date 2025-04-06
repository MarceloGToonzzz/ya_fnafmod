package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CarDesotoBlockTileEntity;

public class CarDesotoBlockBlockModel extends GeoModel<CarDesotoBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarDesotoBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/car_desoto.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarDesotoBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/car_desoto.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarDesotoBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/car_desoto.png");
	}
}
