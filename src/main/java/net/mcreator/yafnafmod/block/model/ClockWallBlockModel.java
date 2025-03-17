package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ClockWallTileEntity;

public class ClockWallBlockModel extends GeoModel<ClockWallTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock.png");
	}
}
