package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.BlakeBadgerDayEntity;

public class BlakeBadgerDayModel extends GeoModel<BlakeBadgerDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlakeBadgerDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/blakebadger.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlakeBadgerDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/blakebadger.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlakeBadgerDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
