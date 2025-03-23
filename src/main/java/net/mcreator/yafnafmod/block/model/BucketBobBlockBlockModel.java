package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BucketBobBlockTileEntity;

public class BucketBobBlockBlockModel extends GeoModel<BucketBobBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BucketBobBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bucket_bob.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BucketBobBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bucket_bob.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BucketBobBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_bucket_bob.png");
	}
}
