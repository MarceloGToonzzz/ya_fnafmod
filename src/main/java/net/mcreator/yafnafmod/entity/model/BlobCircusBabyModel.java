package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.BlobCircusBabyEntity;

public class BlobCircusBabyModel extends GeoModel<BlobCircusBabyEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlobCircusBabyEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/wirepile.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlobCircusBabyEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/wirepile.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlobCircusBabyEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
