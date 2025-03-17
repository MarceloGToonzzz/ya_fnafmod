package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigBackstageDoor2DisplayItem;

public class BigBackstageDoor2DisplayModel extends GeoModel<BigBackstageDoor2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigBackstageDoor2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigdoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigBackstageDoor2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigdoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigBackstageDoor2DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_backstagedoor2.png");
	}
}
