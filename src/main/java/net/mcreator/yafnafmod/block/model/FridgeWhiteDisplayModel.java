package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FridgeWhiteDisplayItem;

public class FridgeWhiteDisplayModel extends GeoModel<FridgeWhiteDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FridgeWhiteDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fridge.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FridgeWhiteDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fridge.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FridgeWhiteDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fridge_white.png");
	}
}
