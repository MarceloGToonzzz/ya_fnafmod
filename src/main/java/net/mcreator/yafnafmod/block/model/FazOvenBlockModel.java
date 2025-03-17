package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FazOvenTileEntity;

public class FazOvenBlockModel extends GeoModel<FazOvenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FazOvenTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fazoven.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FazOvenTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fazoven.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FazOvenTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fazoven.png");
	}
}
