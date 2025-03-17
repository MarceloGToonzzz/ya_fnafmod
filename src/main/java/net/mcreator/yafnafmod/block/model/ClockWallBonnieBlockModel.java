package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ClockWallBonnieTileEntity;

public class ClockWallBonnieBlockModel extends GeoModel<ClockWallBonnieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallBonnieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallBonnieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallBonnieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_bonnie.png");
	}
}
