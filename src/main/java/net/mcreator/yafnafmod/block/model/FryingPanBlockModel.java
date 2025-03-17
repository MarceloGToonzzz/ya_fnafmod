package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FryingPanTileEntity;

public class FryingPanBlockModel extends GeoModel<FryingPanTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FryingPanTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fryingpan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FryingPanTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fryingpan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FryingPanTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fryingpan.png");
	}
}
