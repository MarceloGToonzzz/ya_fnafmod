package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BonnieBunnyBlockTileEntity;

public class BonnieBunnyBlockBlockModel extends GeoModel<BonnieBunnyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bonniebunny.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bonniebunny.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_bonniebunny.png");
	}
}
