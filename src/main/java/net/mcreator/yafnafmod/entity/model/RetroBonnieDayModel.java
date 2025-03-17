package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.RetroBonnieDayEntity;

public class RetroBonnieDayModel extends GeoModel<RetroBonnieDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroBonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/withered_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroBonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/withered_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroBonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
