package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CircusBabyClockTileEntity;

public class CircusBabyClockBlockModel extends GeoModel<CircusBabyClockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CircusBabyClockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock_cbbaby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CircusBabyClockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock_cbbaby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CircusBabyClockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_circusbabyclock.png");
	}
}
