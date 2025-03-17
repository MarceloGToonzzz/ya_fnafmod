package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.DeluxeBallpitTileEntity;

public class DeluxeBallpitBlockModel extends GeoModel<DeluxeBallpitTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeluxeBallpitTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/deluxe_ballpit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeluxeBallpitTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/deluxe_ballpit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeluxeBallpitTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/deluxe_ballpit.png");
	}
}
