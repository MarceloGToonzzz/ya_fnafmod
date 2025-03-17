package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CarouselFredbearTileEntity;

public class CarouselFredbearBlockModel extends GeoModel<CarouselFredbearTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarouselFredbearTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/carousel_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarouselFredbearTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/carousel_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarouselFredbearTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/carouselfreddy_fredbear.png");
	}
}
