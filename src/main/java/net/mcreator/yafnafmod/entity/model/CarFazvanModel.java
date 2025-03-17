package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.CarFazvanEntity;

public class CarFazvanModel extends GeoModel<CarFazvanEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarFazvanEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/car_fazvan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarFazvanEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/car_fazvan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarFazvanEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
