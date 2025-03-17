package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.BonnieBunnyDayEntity;

public class BonnieBunnyDayModel extends GeoModel<BonnieBunnyDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/bonniebunny.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/bonniebunny.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
