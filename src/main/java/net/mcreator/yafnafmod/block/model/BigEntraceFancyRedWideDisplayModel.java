package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigEntraceFancyRedWideDisplayItem;

public class BigEntraceFancyRedWideDisplayModel extends GeoModel<BigEntraceFancyRedWideDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigEntraceFancyRedWideDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigwidedoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigEntraceFancyRedWideDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigwidedoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigEntraceFancyRedWideDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_fancyredentrance_wide.png");
	}
}
