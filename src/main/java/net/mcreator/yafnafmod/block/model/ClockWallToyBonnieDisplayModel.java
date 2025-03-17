package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ClockWallToyBonnieDisplayItem;

public class ClockWallToyBonnieDisplayModel extends GeoModel<ClockWallToyBonnieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallToyBonnieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallToyBonnieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallToyBonnieDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_tbonnie.png");
	}
}
