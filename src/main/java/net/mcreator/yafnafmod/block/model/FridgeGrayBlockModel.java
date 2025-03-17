package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FridgeGrayTileEntity;

public class FridgeGrayBlockModel extends GeoModel<FridgeGrayTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FridgeGrayTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fridge.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FridgeGrayTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fridge.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FridgeGrayTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fridge_gray.png");
	}
}
