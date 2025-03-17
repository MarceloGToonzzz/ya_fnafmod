package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CarouselFreddyRetroTileEntity;

public class CarouselFreddyRetroBlockModel extends GeoModel<CarouselFreddyRetroTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarouselFreddyRetroTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/carousel_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarouselFreddyRetroTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/carousel_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarouselFreddyRetroTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/carouselfreddy_retro.png");
	}
}
