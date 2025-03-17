package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ClockWallDisplayItem;

public class ClockWallDisplayModel extends GeoModel<ClockWallDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock.png");
	}
}
