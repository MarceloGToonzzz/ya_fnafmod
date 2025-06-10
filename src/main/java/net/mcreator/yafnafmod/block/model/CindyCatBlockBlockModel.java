package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CindyCatBlockTileEntity;

public class CindyCatBlockBlockModel extends GeoModel<CindyCatBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CindyCatBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/candy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CindyCatBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/candy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CindyCatBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_cindythecat.png");
	}
}
