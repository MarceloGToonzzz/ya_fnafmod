package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.RetroChicaDayEntity;

public class RetroChicaDayModel extends GeoModel<RetroChicaDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroChicaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/retro_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroChicaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/retro_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroChicaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
