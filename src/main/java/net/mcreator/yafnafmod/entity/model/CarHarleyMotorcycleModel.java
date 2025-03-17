package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.CarHarleyMotorcycleEntity;

public class CarHarleyMotorcycleModel extends GeoModel<CarHarleyMotorcycleEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarHarleyMotorcycleEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/car_harley_motorcycle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarHarleyMotorcycleEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/car_harley_motorcycle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarHarleyMotorcycleEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
