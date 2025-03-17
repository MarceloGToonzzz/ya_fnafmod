package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FridgeGrayDisplayItem;

public class FridgeGrayDisplayModel extends GeoModel<FridgeGrayDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FridgeGrayDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fridge.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FridgeGrayDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fridge.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FridgeGrayDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fridge_gray.png");
	}
}
