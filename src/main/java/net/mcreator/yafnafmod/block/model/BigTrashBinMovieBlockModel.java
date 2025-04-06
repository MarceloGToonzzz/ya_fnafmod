package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BigTrashBinMovieTileEntity;

public class BigTrashBinMovieBlockModel extends GeoModel<BigTrashBinMovieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BigTrashBinMovieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/big_trashbin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigTrashBinMovieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/big_trashbin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigTrashBinMovieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/big_trashbin_movie.png");
	}
}
