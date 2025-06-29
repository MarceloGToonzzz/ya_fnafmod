package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RetroBonnieHeadTileEntity;

public class RetroBonnieHeadBlockModel extends GeoModel<RetroBonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroBonnieHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroBonnieHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroBonnieHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_bonnieretro.png");
	}
}
