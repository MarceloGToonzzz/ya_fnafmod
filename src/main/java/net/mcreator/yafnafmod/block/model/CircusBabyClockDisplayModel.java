package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CircusBabyClockDisplayItem;

public class CircusBabyClockDisplayModel extends GeoModel<CircusBabyClockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CircusBabyClockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock_cbbaby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CircusBabyClockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock_cbbaby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CircusBabyClockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_circusbabyclock.png");
	}
}
