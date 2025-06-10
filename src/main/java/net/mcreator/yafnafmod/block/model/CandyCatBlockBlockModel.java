package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CandyCatBlockTileEntity;

public class CandyCatBlockBlockModel extends GeoModel<CandyCatBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CandyCatBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/candy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CandyCatBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/candy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CandyCatBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_candythecat.png");
	}
}
