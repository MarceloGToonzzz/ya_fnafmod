package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.BucketBobDayEntity;

public class BucketBobDayModel extends GeoModel<BucketBobDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(BucketBobDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/bucket_bob.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BucketBobDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/bucket_bob.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BucketBobDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
