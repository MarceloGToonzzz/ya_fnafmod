package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigRentalWindowedDoorDisplayItem;

public class BigRentalWindowedDoorDisplayModel extends GeoModel<BigRentalWindowedDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigRentalWindowedDoorDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigdoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigRentalWindowedDoorDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigdoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigRentalWindowedDoorDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_rentaldoor2.png");
	}
}
