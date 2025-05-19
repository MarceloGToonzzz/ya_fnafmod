package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.ScrapSparkyDogDayEntity;

public class ScrapSparkyDogDayModel extends GeoModel<ScrapSparkyDogDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(ScrapSparkyDogDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/sparky.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScrapSparkyDogDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/sparky.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScrapSparkyDogDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
