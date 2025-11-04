package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.RetroChicaEntity;

public class RetroChicaModel extends GeoModel<RetroChicaEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroChicaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/retro_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroChicaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/retro_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroChicaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
