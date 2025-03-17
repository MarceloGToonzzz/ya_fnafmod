package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigEntranceDoorDisplayItem;

public class BigEntranceDoorDisplayModel extends GeoModel<BigEntranceDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigEntranceDoorDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigdoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigEntranceDoorDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigdoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigEntranceDoorDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_entrance.png");
	}
}
