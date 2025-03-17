package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.CircusBabyDayEntity;

public class CircusBabyDayModel extends GeoModel<CircusBabyDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(CircusBabyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/baby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CircusBabyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/baby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CircusBabyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
