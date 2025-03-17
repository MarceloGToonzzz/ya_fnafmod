package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzeriaSignMovie2DisplayItem;

public class PizzeriaSignMovie2DisplayModel extends GeoModel<PizzeriaSignMovie2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignMovie2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pizzeria_sign_movie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignMovie2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pizzeria_sign_movie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignMovie2DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fnafmovie2sign.png");
	}
}
