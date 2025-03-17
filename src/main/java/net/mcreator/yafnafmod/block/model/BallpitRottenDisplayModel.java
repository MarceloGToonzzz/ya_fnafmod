package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BallpitRottenDisplayItem;

public class BallpitRottenDisplayModel extends GeoModel<BallpitRottenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BallpitRottenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/rotten_pit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BallpitRottenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/rotten_pit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BallpitRottenDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/ballpit_rotten.png");
	}
}
