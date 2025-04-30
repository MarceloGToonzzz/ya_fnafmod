package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PizzeriaStandingSignMovie2DisplayItem;

public class PizzeriaStandingSignMovie2DisplayModel extends GeoModel<PizzeriaStandingSignMovie2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaStandingSignMovie2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fnafsignstanding_outside.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaStandingSignMovie2DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fnafsignstanding_outside.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaStandingSignMovie2DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fnafmovie2signstanding_outside.png");
	}
}
