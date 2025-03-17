package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ClockWallFredbearDisplayItem;

public class ClockWallFredbearDisplayModel extends GeoModel<ClockWallFredbearDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallFredbearDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallFredbearDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallFredbearDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_fredbear.png");
	}
}
