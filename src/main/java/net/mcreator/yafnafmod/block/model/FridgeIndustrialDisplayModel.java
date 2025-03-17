package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FridgeIndustrialDisplayItem;

public class FridgeIndustrialDisplayModel extends GeoModel<FridgeIndustrialDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FridgeIndustrialDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fridge_industrial.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FridgeIndustrialDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fridge_industrial.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FridgeIndustrialDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fridge_industrial.png");
	}
}
