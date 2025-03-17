package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.LaptopOldTileEntity;

public class LaptopOldBlockModel extends GeoModel<LaptopOldTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LaptopOldTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/laptop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LaptopOldTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/laptop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LaptopOldTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/laptop_old.png");
	}
}
