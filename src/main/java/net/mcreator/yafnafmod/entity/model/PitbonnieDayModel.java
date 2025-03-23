package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.PitbonnieDayEntity;

public class PitbonnieDayModel extends GeoModel<PitbonnieDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(PitbonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/pitbonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PitbonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/pitbonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PitbonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
