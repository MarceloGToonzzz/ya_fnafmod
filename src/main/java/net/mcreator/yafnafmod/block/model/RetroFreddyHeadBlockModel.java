package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RetroFreddyHeadTileEntity;

public class RetroFreddyHeadBlockModel extends GeoModel<RetroFreddyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroFreddyHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroFreddyHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroFreddyHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_freddyretro.png");
	}
}
