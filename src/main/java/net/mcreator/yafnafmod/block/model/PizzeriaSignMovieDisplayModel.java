package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzeriaSignMovieDisplayItem;

public class PizzeriaSignMovieDisplayModel extends GeoModel<PizzeriaSignMovieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignMovieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign_movie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignMovieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign_movie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignMovieDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fnafmoviesign.png");
	}
}
