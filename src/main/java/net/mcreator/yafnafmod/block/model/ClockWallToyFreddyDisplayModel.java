package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ClockWallToyFreddyDisplayItem;

public class ClockWallToyFreddyDisplayModel extends GeoModel<ClockWallToyFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallToyFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallToyFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallToyFreddyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_tfreddy.png");
	}
}
