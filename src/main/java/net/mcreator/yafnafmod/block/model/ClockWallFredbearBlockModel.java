package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ClockWallFredbearTileEntity;

public class ClockWallFredbearBlockModel extends GeoModel<ClockWallFredbearTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallFredbearTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallFredbearTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallFredbearTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_fredbear.png");
	}
}
