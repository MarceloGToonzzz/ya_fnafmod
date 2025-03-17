package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.BucketBobEntity;

public class BucketBobModel extends GeoModel<BucketBobEntity> {
	@Override
	public ResourceLocation getAnimationResource(BucketBobEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/bucket_bob.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BucketBobEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/bucket_bob.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BucketBobEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
