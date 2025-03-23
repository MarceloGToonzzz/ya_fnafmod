package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BucketBobBlockDisplayItem;

public class BucketBobBlockDisplayModel extends GeoModel<BucketBobBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BucketBobBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bucket_bob.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BucketBobBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bucket_bob.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BucketBobBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_bucket_bob.png");
	}
}
