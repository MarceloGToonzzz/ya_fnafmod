package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.WitheredDougDogDayEntity;

public class WitheredDougDogDayModel extends GeoModel<WitheredDougDogDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredDougDogDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/sparky.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredDougDogDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/sparky.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredDougDogDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
