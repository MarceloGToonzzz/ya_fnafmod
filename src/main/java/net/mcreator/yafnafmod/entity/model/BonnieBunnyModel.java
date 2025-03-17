package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.BonnieBunnyEntity;

public class BonnieBunnyModel extends GeoModel<BonnieBunnyEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnyEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/bonniebunny.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnyEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/bonniebunny.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnyEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
