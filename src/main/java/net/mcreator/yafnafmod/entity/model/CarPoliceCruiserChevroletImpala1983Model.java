package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.CarPoliceCruiserChevroletImpala1983Entity;

public class CarPoliceCruiserChevroletImpala1983Model extends GeoModel<CarPoliceCruiserChevroletImpala1983Entity> {
	@Override
	public ResourceLocation getAnimationResource(CarPoliceCruiserChevroletImpala1983Entity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/car__police_cruiser_chevrolet_impala_1983.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarPoliceCruiserChevroletImpala1983Entity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/car__police_cruiser_chevrolet_impala_1983.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarPoliceCruiserChevroletImpala1983Entity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
