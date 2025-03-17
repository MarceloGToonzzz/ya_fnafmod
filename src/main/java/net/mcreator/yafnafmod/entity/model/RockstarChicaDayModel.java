package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.RockstarChicaDayEntity;

public class RockstarChicaDayModel extends GeoModel<RockstarChicaDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockstarChicaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/rockstar_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockstarChicaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/rockstar_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockstarChicaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
