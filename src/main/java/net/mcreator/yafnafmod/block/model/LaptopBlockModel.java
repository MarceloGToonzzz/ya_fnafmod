package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.LaptopTileEntity;

public class LaptopBlockModel extends GeoModel<LaptopTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LaptopTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/laptop.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LaptopTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/laptop.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LaptopTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/laptop_new.png");
	}
}
