package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CarouselFreddyToyTileEntity;

public class CarouselFreddyToyBlockModel extends GeoModel<CarouselFreddyToyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarouselFreddyToyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/carousel_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarouselFreddyToyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/carousel_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarouselFreddyToyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/carouselfreddy_toy.png");
	}
}
