package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigTrashBinMovieDisplayItem;

public class BigTrashBinMovieDisplayModel extends GeoModel<BigTrashBinMovieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigTrashBinMovieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/big_trashbin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigTrashBinMovieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/big_trashbin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigTrashBinMovieDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/big_trashbin_movie.png");
	}
}
