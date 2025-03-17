package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ClockWallToyFoxyDisplayItem;

public class ClockWallToyFoxyDisplayModel extends GeoModel<ClockWallToyFoxyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallToyFoxyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallToyFoxyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallToyFoxyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_tfoxy.png");
	}
}
