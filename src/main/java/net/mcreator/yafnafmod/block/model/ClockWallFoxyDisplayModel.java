package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ClockWallFoxyDisplayItem;

public class ClockWallFoxyDisplayModel extends GeoModel<ClockWallFoxyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallFoxyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallFoxyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallFoxyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_foxy.png");
	}
}
