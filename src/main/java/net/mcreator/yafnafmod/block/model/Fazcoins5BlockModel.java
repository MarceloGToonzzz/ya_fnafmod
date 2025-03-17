package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.Fazcoins5TileEntity;

public class Fazcoins5BlockModel extends GeoModel<Fazcoins5TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Fazcoins5TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fazcoins_5.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Fazcoins5TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fazcoins_5.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Fazcoins5TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fazcoin.png");
	}
}
