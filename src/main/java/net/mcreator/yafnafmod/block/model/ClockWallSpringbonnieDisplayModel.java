package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ClockWallSpringbonnieDisplayItem;

public class ClockWallSpringbonnieDisplayModel extends GeoModel<ClockWallSpringbonnieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallSpringbonnieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallSpringbonnieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallSpringbonnieDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_sbonnie.png");
	}
}
