package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigKitchenWhiteDoorWideDisplayItem;

public class BigKitchenWhiteDoorWideDisplayModel extends GeoModel<BigKitchenWhiteDoorWideDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigKitchenWhiteDoorWideDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigwidedoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigKitchenWhiteDoorWideDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigwidedoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigKitchenWhiteDoorWideDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_kitchendoor2_wide.png");
	}
}
