package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BallpitVintageDisplayItem;

public class BallpitVintageDisplayModel extends GeoModel<BallpitVintageDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BallpitVintageDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/rotten_pit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BallpitVintageDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/rotten_pit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BallpitVintageDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/ballpit_new.png");
	}
}
