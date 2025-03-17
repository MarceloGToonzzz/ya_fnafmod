package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.ToyBonnieStillDayEntity;

public class ToyBonnieStillDayModel extends GeoModel<ToyBonnieStillDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieStillDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/toy_bonniebunny.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieStillDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/toy_bonniebunny.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieStillDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
