package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CarPoilceCruiserChevroletImpalaBlockTileEntity;

public class CarPoilceCruiserChevroletImpalaBlockBlockModel extends GeoModel<CarPoilceCruiserChevroletImpalaBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarPoilceCruiserChevroletImpalaBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/car__police_cruiser_chevrolet_impala_1983.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarPoilceCruiserChevroletImpalaBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/car__police_cruiser_chevrolet_impala_1983.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarPoilceCruiserChevroletImpalaBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/car__police_cruiser_chevrolet_impala_1983.png");
	}
}
