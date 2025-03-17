package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.OrvilleElephantDayEntity;

public class OrvilleElephantDayModel extends GeoModel<OrvilleElephantDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(OrvilleElephantDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/orville_elephant.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OrvilleElephantDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/orville_elephant.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OrvilleElephantDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
