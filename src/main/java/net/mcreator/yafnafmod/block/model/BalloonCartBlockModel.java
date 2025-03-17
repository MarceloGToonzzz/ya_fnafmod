package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BalloonCartTileEntity;

public class BalloonCartBlockModel extends GeoModel<BalloonCartTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BalloonCartTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/balloon_cart.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BalloonCartTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/balloon_cart.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BalloonCartTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/balloon_cart.png");
	}
}
