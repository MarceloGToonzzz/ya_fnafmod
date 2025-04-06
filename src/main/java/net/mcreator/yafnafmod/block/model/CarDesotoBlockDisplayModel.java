package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CarDesotoBlockDisplayItem;

public class CarDesotoBlockDisplayModel extends GeoModel<CarDesotoBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarDesotoBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/car_desoto.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarDesotoBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/car_desoto.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarDesotoBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/car_desoto.png");
	}
}
