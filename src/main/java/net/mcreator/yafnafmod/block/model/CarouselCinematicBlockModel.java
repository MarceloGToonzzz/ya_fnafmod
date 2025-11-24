package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CarouselCinematicTileEntity;

public class CarouselCinematicBlockModel extends GeoModel<CarouselCinematicTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CarouselCinematicTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/carousel_on.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/carousel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CarouselCinematicTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/carousel_on.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/carousel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CarouselCinematicTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/retro-carousel_movie-on.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/retro-carousel_movie.png");
	}
}
