package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CarHarleyMotorcycleBlockDisplayItem;

public class CarHarleyMotorcycleBlockDisplayModel extends GeoModel<CarHarleyMotorcycleBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarHarleyMotorcycleBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/car_harley_motorcycle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarHarleyMotorcycleBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/car_harley_motorcycle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarHarleyMotorcycleBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/car_harley_motorcycle_fritz.png");
	}
}
