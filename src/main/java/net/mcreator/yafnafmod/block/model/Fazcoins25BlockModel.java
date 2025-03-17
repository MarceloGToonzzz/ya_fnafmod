package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.Fazcoins25TileEntity;

public class Fazcoins25BlockModel extends GeoModel<Fazcoins25TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Fazcoins25TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fazcoins_25.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Fazcoins25TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fazcoins_25.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Fazcoins25TileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fazcoin_alot.png");
	}
}
