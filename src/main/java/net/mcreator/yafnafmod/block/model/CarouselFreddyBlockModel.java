package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CarouselFreddyTileEntity;

public class CarouselFreddyBlockModel extends GeoModel<CarouselFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarouselFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/carousel_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarouselFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/carousel_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarouselFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/carouselfreddy_classic.png");
	}
}
