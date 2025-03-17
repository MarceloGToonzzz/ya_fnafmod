package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.ToyChicaEntity;

public class ToyChicaModel extends GeoModel<ToyChicaEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/toy_chicachicken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/toy_chicachicken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
