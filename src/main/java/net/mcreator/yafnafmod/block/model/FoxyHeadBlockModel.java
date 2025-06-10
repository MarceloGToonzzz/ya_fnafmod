package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.FoxyHeadTileEntity;

public class FoxyHeadBlockModel extends GeoModel<FoxyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FoxyHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FoxyHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FoxyHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_foxyclassic.png");
	}
}
