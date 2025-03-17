package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.WitheredChicaEntity;

public class WitheredChicaModel extends GeoModel<WitheredChicaEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredChicaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/withered_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredChicaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/withered_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredChicaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
