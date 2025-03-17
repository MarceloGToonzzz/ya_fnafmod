package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.WitheredFoxyDayEntity;

public class WitheredFoxyDayModel extends GeoModel<WitheredFoxyDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFoxyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/withered_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFoxyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/withered_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFoxyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
