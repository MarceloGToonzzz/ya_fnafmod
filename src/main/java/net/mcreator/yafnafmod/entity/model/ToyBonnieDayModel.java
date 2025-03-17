package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.ToyBonnieDayEntity;

public class ToyBonnieDayModel extends GeoModel<ToyBonnieDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/toy_bonniebunny.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/toy_bonniebunny.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
