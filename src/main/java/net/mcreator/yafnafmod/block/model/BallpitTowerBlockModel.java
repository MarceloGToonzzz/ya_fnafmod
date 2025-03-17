package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BallpitTowerTileEntity;

public class BallpitTowerBlockModel extends GeoModel<BallpitTowerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BallpitTowerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/tower_ballpit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BallpitTowerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/tower_ballpit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BallpitTowerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/tower_ballpit.png");
	}
}
