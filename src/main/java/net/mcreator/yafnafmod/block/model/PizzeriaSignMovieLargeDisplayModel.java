package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzeriaSignMovieLargeDisplayItem;

public class PizzeriaSignMovieLargeDisplayModel extends GeoModel<PizzeriaSignMovieLargeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaSignMovieLargeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/large_pizzeria_sign.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaSignMovieLargeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/large_pizzeria_sign.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaSignMovieLargeDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pizzeriasign-large-fnafmovie1.png");
	}
}
