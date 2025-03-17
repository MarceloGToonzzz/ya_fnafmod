package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.Fazcoins1000TileEntity;

public class Fazcoins1000BlockModel extends GeoModel<Fazcoins1000TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Fazcoins1000TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fazcoins_1000.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Fazcoins1000TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fazcoins_1000.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Fazcoins1000TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fazcoin_alot.png");
	}
}
