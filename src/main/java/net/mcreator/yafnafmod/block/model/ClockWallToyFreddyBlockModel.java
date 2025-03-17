package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ClockWallToyFreddyTileEntity;

public class ClockWallToyFreddyBlockModel extends GeoModel<ClockWallToyFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallToyFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallToyFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallToyFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_tfreddy.png");
	}
}
