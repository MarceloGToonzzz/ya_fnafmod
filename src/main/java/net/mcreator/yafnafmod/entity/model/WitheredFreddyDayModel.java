package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.WitheredFreddyDayEntity;

public class WitheredFreddyDayModel extends GeoModel<WitheredFreddyDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFreddyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/withered_freddyfazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFreddyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/withered_freddyfazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFreddyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
