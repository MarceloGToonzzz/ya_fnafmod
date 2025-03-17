package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ClockWallToyFoxyTileEntity;

public class ClockWallToyFoxyBlockModel extends GeoModel<ClockWallToyFoxyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallToyFoxyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallToyFoxyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallToyFoxyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_tfoxy.png");
	}
}
