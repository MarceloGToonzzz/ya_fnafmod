package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ClockWallChicaTileEntity;

public class ClockWallChicaBlockModel extends GeoModel<ClockWallChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallChicaTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallChicaTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallChicaTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_chica.png");
	}
}
