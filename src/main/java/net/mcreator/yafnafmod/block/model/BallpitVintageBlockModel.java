package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BallpitVintageTileEntity;

public class BallpitVintageBlockModel extends GeoModel<BallpitVintageTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BallpitVintageTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/rotten_pit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BallpitVintageTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/rotten_pit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BallpitVintageTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/ballpit_new.png");
	}
}
