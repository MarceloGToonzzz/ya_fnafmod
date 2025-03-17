package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigClosetDisplayItem;

public class BigClosetDisplayModel extends GeoModel<BigClosetDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigClosetDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigcloset.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigClosetDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigcloset.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigClosetDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigcloset.png");
	}
}
