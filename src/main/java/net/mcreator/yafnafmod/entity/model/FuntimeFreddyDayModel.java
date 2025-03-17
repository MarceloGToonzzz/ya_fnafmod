package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.FuntimeFreddyDayEntity;

public class FuntimeFreddyDayModel extends GeoModel<FuntimeFreddyDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeFreddyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/funtime_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeFreddyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/funtime_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeFreddyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
