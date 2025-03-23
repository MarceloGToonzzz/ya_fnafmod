package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.JollyRatDayEntity;

public class JollyRatDayModel extends GeoModel<JollyRatDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(JollyRatDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/jollyrat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JollyRatDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/jollyrat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JollyRatDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
