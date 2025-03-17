package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.RetroFreddyDayEntity;

public class RetroFreddyDayModel extends GeoModel<RetroFreddyDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroFreddyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/withered_freddyfazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroFreddyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/withered_freddyfazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroFreddyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
