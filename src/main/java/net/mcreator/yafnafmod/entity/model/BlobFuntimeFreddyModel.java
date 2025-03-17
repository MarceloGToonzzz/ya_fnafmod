package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.BlobFuntimeFreddyEntity;

public class BlobFuntimeFreddyModel extends GeoModel<BlobFuntimeFreddyEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlobFuntimeFreddyEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/wirepile.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlobFuntimeFreddyEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/wirepile.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlobFuntimeFreddyEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
