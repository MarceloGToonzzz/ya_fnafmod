package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.MangleDayEntity;

public class MangleDayModel extends GeoModel<MangleDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(MangleDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/mangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MangleDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/mangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MangleDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
