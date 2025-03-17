package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.ShadowBonnieEntity;

public class ShadowBonnieModel extends GeoModel<ShadowBonnieEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShadowBonnieEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/toy_bonniebunny.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShadowBonnieEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/toy_bonniebunny.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShadowBonnieEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
