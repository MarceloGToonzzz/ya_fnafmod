package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ClockWallToyChicaTileEntity;

public class ClockWallToyChicaBlockModel extends GeoModel<ClockWallToyChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallToyChicaTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallToyChicaTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallToyChicaTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_tchica.png");
	}
}
