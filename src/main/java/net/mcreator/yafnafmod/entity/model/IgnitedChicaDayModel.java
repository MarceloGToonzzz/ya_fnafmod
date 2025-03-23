package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.IgnitedChicaDayEntity;

public class IgnitedChicaDayModel extends GeoModel<IgnitedChicaDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(IgnitedChicaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/ignited_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IgnitedChicaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/ignited_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IgnitedChicaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
