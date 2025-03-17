package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.BonnetEntity;

public class BonnetModel extends GeoModel<BonnetEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnetEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/bonbon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnetEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/bonbon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnetEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
