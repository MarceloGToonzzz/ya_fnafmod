package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigBackstageDoorBlack2DisplayItem;

public class BigBackstageDoorBlack2DisplayModel extends GeoModel<BigBackstageDoorBlack2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigBackstageDoorBlack2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigdoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigBackstageDoorBlack2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigdoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigBackstageDoorBlack2DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_blackbackstagedoor2.png");
	}
}
