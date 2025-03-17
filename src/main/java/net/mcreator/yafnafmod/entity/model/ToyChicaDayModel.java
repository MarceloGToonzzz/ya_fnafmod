package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.ToyChicaDayEntity;

public class ToyChicaDayModel extends GeoModel<ToyChicaDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/toy_chicachicken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/toy_chicachicken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
