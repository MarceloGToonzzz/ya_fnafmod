package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CarPoliceCruiserChevroletImpala1983BlockDisplayItem;

public class CarPoliceCruiserChevroletImpala1983BlockDisplayModel extends GeoModel<CarPoliceCruiserChevroletImpala1983BlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CarPoliceCruiserChevroletImpala1983BlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/car__police_cruiser_chevrolet_impala_1983.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarPoliceCruiserChevroletImpala1983BlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/car__police_cruiser_chevrolet_impala_1983.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarPoliceCruiserChevroletImpala1983BlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/car__police_cruiser_chevrolet_impala_1983.png");
	}
}
