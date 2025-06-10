package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BonnieHeadTileEntity;

public class BonnieHeadBlockModel extends GeoModel<BonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_bonnieclassic.png");
	}
}
