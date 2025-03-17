package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigBackstageDoorRedDisplayItem;

public class BigBackstageDoorRedDisplayModel extends GeoModel<BigBackstageDoorRedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigBackstageDoorRedDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigdoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigBackstageDoorRedDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigdoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigBackstageDoorRedDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_redbackstage.png");
	}
}
