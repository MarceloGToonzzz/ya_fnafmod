package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigEntranceDoorWideDisplayItem;

public class BigEntranceDoorWideDisplayModel extends GeoModel<BigEntranceDoorWideDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigEntranceDoorWideDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigwidedoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigEntranceDoorWideDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigwidedoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigEntranceDoorWideDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_entrance_wide.png");
	}
}
