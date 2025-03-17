package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ClockWallFreddyTileEntity;

public class ClockWallFreddyBlockModel extends GeoModel<ClockWallFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_freddy.png");
	}
}
