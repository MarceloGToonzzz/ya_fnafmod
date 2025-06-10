package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ToyBonnieBlockTileEntity;

public class ToyBonnieBlockBlockModel extends GeoModel<ToyBonnieBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/toy_bonniebunny.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/toy_bonniebunny.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_tbonnie_day.png");
	}
}
