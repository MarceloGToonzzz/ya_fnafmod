package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FryerTileEntity;

public class FryerBlockModel extends GeoModel<FryerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FryerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fryer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FryerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fryer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FryerTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fryer.png");
	}
}
