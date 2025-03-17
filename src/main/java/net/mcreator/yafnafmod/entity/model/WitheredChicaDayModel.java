package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.WitheredChicaDayEntity;

public class WitheredChicaDayModel extends GeoModel<WitheredChicaDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/withered_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/withered_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
