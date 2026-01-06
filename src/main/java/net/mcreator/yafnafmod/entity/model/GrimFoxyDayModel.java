package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.GrimFoxyDayEntity;

public class GrimFoxyDayModel extends GeoModel<GrimFoxyDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(GrimFoxyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/grimfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrimFoxyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/grimfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrimFoxyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
