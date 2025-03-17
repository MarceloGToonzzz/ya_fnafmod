package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.PlushtrapEntity;

public class PlushtrapModel extends GeoModel<PlushtrapEntity> {
	@Override
	public ResourceLocation getAnimationResource(PlushtrapEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/plushtrap.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PlushtrapEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/plushtrap.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PlushtrapEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
