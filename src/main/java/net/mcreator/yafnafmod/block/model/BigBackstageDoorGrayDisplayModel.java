package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigBackstageDoorGrayDisplayItem;

public class BigBackstageDoorGrayDisplayModel extends GeoModel<BigBackstageDoorGrayDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigBackstageDoorGrayDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigdoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigBackstageDoorGrayDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigdoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigBackstageDoorGrayDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_graybackstagedoor1.png");
	}
}
