package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.HappyFrogDayEntity;

public class HappyFrogDayModel extends GeoModel<HappyFrogDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(HappyFrogDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/happy_frog.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HappyFrogDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/happy_frog.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HappyFrogDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
