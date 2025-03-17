package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ClockWallToyBonnieTileEntity;

public class ClockWallToyBonnieBlockModel extends GeoModel<ClockWallToyBonnieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallToyBonnieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallToyBonnieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallToyBonnieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_tbonnie.png");
	}
}
