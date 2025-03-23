package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigBackstageDoorGray2DisplayItem;

public class BigBackstageDoorGray2DisplayModel extends GeoModel<BigBackstageDoorGray2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigBackstageDoorGray2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigdoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigBackstageDoorGray2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigdoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigBackstageDoorGray2DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_graybackstagedoor2.png");
	}
}
