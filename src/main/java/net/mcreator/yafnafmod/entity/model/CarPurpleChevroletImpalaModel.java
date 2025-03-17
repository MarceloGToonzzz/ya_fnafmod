package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.CarPurpleChevroletImpalaEntity;

public class CarPurpleChevroletImpalaModel extends GeoModel<CarPurpleChevroletImpalaEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarPurpleChevroletImpalaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/car_purple_chevrolet_impala.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarPurpleChevroletImpalaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/car_purple_chevrolet_impala.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarPurpleChevroletImpalaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
