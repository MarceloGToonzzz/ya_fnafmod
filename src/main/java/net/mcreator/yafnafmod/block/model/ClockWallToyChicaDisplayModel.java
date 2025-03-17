package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ClockWallToyChicaDisplayItem;

public class ClockWallToyChicaDisplayModel extends GeoModel<ClockWallToyChicaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallToyChicaDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallToyChicaDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallToyChicaDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_tchica.png");
	}
}
