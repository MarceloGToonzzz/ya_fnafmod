package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BalloonCartDisplayItem;

public class BalloonCartDisplayModel extends GeoModel<BalloonCartDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BalloonCartDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/balloon_cart.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BalloonCartDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/balloon_cart.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BalloonCartDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/balloon_cart.png");
	}
}
