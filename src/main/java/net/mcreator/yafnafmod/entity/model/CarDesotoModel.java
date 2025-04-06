package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.CarDesotoEntity;

public class CarDesotoModel extends GeoModel<CarDesotoEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarDesotoEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/car_desoto.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarDesotoEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/car_desoto.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarDesotoEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
