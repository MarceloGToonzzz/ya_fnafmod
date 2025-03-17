package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ClockWallBonnieDisplayItem;

public class ClockWallBonnieDisplayModel extends GeoModel<ClockWallBonnieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallBonnieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallBonnieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallBonnieDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_bonnie.png");
	}
}
