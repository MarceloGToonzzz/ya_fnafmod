package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.Fazcoins100TileEntity;

public class Fazcoins100BlockModel extends GeoModel<Fazcoins100TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Fazcoins100TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fazcoins_100.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Fazcoins100TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fazcoins_100.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Fazcoins100TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fazcoin_alot.png");
	}
}
