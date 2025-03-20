package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CarPoliceCruiserChevroletImpala1983BlockTileEntity;

public class CarPoliceCruiserChevroletImpala1983BlockBlockModel extends GeoModel<CarPoliceCruiserChevroletImpala1983BlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarPoliceCruiserChevroletImpala1983BlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/car__police_cruiser_chevrolet_impala_1983.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarPoliceCruiserChevroletImpala1983BlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/car__police_cruiser_chevrolet_impala_1983.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarPoliceCruiserChevroletImpala1983BlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/car__police_cruiser_chevrolet_impala_1983.png");
	}
}
