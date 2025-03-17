package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.SpringbonnieDayEntity;

public class SpringbonnieDayModel extends GeoModel<SpringbonnieDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringbonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/springbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringbonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/springbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringbonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
