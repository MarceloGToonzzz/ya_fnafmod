package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RetroFoxyHeadTileEntity;

public class RetroFoxyHeadBlockModel extends GeoModel<RetroFoxyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroFoxyHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroFoxyHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroFoxyHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_foxyretro.png");
	}
}
