package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BallpitRottenTileEntity;

public class BallpitRottenBlockModel extends GeoModel<BallpitRottenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BallpitRottenTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/rotten_pit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BallpitRottenTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/rotten_pit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BallpitRottenTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/ballpit_rotten.png");
	}
}
