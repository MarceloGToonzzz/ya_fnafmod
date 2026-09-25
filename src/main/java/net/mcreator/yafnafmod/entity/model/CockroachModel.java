package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.CockroachEntity;

public class CockroachModel extends GeoModel<CockroachEntity> {
	@Override
	public ResourceLocation getAnimationResource(CockroachEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/cockroach.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CockroachEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/cockroach.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CockroachEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
