package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ToyBonnieHeadTileEntity;

public class ToyBonnieHeadBlockModel extends GeoModel<ToyBonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_bonnietoy.png");
	}
}
