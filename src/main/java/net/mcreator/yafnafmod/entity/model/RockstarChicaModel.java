package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.RockstarChicaEntity;

public class RockstarChicaModel extends GeoModel<RockstarChicaEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockstarChicaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/rockstar_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockstarChicaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/rockstar_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockstarChicaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
