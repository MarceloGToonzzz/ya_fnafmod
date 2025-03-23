package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigBackstageDoorBlackDisplayItem;

public class BigBackstageDoorBlackDisplayModel extends GeoModel<BigBackstageDoorBlackDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigBackstageDoorBlackDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigdoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigBackstageDoorBlackDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigdoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigBackstageDoorBlackDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_blackbackstagedoor1.png");
	}
}
