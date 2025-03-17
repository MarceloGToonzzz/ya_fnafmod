package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigKitchenDoorWideDisplayItem;

public class BigKitchenDoorWideDisplayModel extends GeoModel<BigKitchenDoorWideDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigKitchenDoorWideDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigwidedoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigKitchenDoorWideDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigwidedoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigKitchenDoorWideDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_kitchendoor1_wide.png");
	}
}
