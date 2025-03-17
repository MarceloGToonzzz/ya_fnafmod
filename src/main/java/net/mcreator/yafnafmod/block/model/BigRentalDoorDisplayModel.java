package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigRentalDoorDisplayItem;

public class BigRentalDoorDisplayModel extends GeoModel<BigRentalDoorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigRentalDoorDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bigdoor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigRentalDoorDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bigdoor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigRentalDoorDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bigdoor_rentaldoor1.png");
	}
}
