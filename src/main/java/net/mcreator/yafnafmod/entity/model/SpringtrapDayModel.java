package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.SpringtrapDayEntity;

public class SpringtrapDayModel extends GeoModel<SpringtrapDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpringtrapDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/springtrap.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpringtrapDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/springtrap.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpringtrapDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
