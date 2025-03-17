package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ClockWallSpringbonnieTileEntity;

public class ClockWallSpringbonnieBlockModel extends GeoModel<ClockWallSpringbonnieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallSpringbonnieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallSpringbonnieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallSpringbonnieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_sbonnie.png");
	}
}
