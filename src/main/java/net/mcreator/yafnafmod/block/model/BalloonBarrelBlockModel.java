package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BalloonBarrelTileEntity;

public class BalloonBarrelBlockModel extends GeoModel<BalloonBarrelTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BalloonBarrelTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/balloon_barrel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BalloonBarrelTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/balloon_barrel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BalloonBarrelTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/balloonbarrel.png");
	}
}
