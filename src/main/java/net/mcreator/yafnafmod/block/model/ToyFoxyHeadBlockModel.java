package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ToyFoxyHeadTileEntity;

public class ToyFoxyHeadBlockModel extends GeoModel<ToyFoxyHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_foxytoy.png");
	}
}
