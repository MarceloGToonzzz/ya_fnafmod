package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigBedroomDoorDisplayItem;

public class BigBedroomDoorDisplayModel extends GeoModel<BigBedroomDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigBedroomDoorDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigdoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigBedroomDoorDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigdoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigBedroomDoorDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_bedroomdoor.png");
	}
}
