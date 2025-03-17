package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.DiscountBallpitTileEntity;

public class DiscountBallpitBlockModel extends GeoModel<DiscountBallpitTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DiscountBallpitTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/discount_ballpit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DiscountBallpitTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/discount_ballpit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DiscountBallpitTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/discount_ballpit.png");
	}
}
