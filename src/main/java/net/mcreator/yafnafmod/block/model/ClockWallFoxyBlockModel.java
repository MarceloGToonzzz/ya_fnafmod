package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ClockWallFoxyTileEntity;

public class ClockWallFoxyBlockModel extends GeoModel<ClockWallFoxyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallFoxyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallFoxyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallFoxyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_foxy.png");
	}
}
