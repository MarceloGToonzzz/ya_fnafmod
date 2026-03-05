package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.GoldenFreddySuitEntity;

public class GoldenFreddySuitModel extends GeoModel<GoldenFreddySuitEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldenFreddySuitEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/fredbear_suit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldenFreddySuitEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/fredbear_suit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldenFreddySuitEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
