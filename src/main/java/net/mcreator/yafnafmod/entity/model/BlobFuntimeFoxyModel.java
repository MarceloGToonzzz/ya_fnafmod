package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.BlobFuntimeFoxyEntity;

public class BlobFuntimeFoxyModel extends GeoModel<BlobFuntimeFoxyEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlobFuntimeFoxyEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/wirepile.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlobFuntimeFoxyEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/wirepile.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlobFuntimeFoxyEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
