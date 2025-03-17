package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PinTheBowtieFreddyTileEntity;

public class PinTheBowtieFreddyBlockModel extends GeoModel<PinTheBowtieFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PinTheBowtieFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pinthebowtie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinTheBowtieFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pinthebowtie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinTheBowtieFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pinthebowtie.png");
	}
}
