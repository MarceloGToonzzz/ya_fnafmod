package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PizzeriaSignMovieTileEntity;

public class PizzeriaSignMovieBlockModel extends GeoModel<PizzeriaSignMovieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignMovieTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign_movie_offset.animation.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign_movie.animation.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign_movie_offset.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign_movie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignMovieTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign_movie_offset.geo.json");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign_movie.geo.json");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign_movie_offset.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign_movie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignMovieTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/fnafmoviesign.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/fnafmoviesign.png");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "textures/block/fnafmoviesign.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/fnafmoviesign.png");
	}
}
