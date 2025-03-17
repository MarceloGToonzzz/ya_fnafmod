package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigKitchenWhiteDoorDisplayItem;

public class BigKitchenWhiteDoorDisplayModel extends GeoModel<BigKitchenWhiteDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigKitchenWhiteDoorDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigdoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigKitchenWhiteDoorDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigdoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigKitchenWhiteDoorDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_kitchendoor2.png");
	}
}
