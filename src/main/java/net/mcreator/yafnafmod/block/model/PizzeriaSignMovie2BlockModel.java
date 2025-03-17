package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PizzeriaSignMovie2TileEntity;

public class PizzeriaSignMovie2BlockModel extends GeoModel<PizzeriaSignMovie2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignMovie2TileEntity animatable) {
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
	public ResourceLocation getModelResource(PizzeriaSignMovie2TileEntity animatable) {
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
	public ResourceLocation getTextureResource(PizzeriaSignMovie2TileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/fnafmovie2sign.png");
		if (blockstate == 2)
			return new ResourceLocation("ya_fnafmod", "textures/block/fnafmovie2sign.png");
		if (blockstate == 3)
			return new ResourceLocation("ya_fnafmod", "textures/block/fnafmovie2sign.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/fnafmovie2sign.png");
	}
}
