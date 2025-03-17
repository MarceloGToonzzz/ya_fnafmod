package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ClockWallFreddyDisplayItem;

public class ClockWallFreddyDisplayModel extends GeoModel<ClockWallFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallFreddyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_freddy.png");
	}
}
