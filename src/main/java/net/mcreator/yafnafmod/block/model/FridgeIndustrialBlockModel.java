package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FridgeIndustrialTileEntity;

public class FridgeIndustrialBlockModel extends GeoModel<FridgeIndustrialTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FridgeIndustrialTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fridge_industrial.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FridgeIndustrialTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fridge_industrial.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FridgeIndustrialTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fridge_industrial.png");
	}
}
