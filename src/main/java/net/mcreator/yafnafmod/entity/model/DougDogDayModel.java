package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.DougDogDayEntity;

public class DougDogDayModel extends GeoModel<DougDogDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(DougDogDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/sparky.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DougDogDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/sparky.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DougDogDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
