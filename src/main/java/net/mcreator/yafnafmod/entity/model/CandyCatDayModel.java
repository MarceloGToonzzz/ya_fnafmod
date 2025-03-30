package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.CandyCatDayEntity;

public class CandyCatDayModel extends GeoModel<CandyCatDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(CandyCatDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/candy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CandyCatDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/candy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CandyCatDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
