package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CarPurpleChevroletImpalaBlockDisplayItem;

public class CarPurpleChevroletImpalaBlockDisplayModel extends GeoModel<CarPurpleChevroletImpalaBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarPurpleChevroletImpalaBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/car_purple_chevrolet_impala.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarPurpleChevroletImpalaBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/car_purple_chevrolet_impala.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarPurpleChevroletImpalaBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/car_purple_chevrolet_impala.png");
	}
}
