package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.RetroFoxyDayEntity;

public class RetroFoxyDayModel extends GeoModel<RetroFoxyDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroFoxyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/withered_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroFoxyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/withered_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroFoxyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
