package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FazOvenDisplayItem;

public class FazOvenDisplayModel extends GeoModel<FazOvenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FazOvenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fazoven.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FazOvenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fazoven.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FazOvenDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fazoven.png");
	}
}
