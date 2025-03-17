package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.VanRideTileEntity;

public class VanRideBlockModel extends GeoModel<VanRideTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(VanRideTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/van_ride.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VanRideTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/van_ride.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VanRideTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/van_ride.png");
	}
}
