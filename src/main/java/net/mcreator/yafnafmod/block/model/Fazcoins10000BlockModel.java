package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.Fazcoins10000TileEntity;

public class Fazcoins10000BlockModel extends GeoModel<Fazcoins10000TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Fazcoins10000TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fazcoin_bag.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Fazcoins10000TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fazcoin_bag.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Fazcoins10000TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/coinbag.png");
	}
}
