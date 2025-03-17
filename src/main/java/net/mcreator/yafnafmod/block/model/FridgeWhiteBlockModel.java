package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FridgeWhiteTileEntity;

public class FridgeWhiteBlockModel extends GeoModel<FridgeWhiteTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FridgeWhiteTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fridge.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FridgeWhiteTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fridge.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FridgeWhiteTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fridge_white.png");
	}
}
