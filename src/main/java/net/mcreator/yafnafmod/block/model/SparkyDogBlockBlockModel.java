package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.SparkyDogBlockTileEntity;

public class SparkyDogBlockBlockModel extends GeoModel<SparkyDogBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SparkyDogBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/sparky.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SparkyDogBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/sparky.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SparkyDogBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_sparky.png");
	}
}
