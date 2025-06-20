package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ToyChicaHeadTileEntity;

public class ToyChicaHeadBlockModel extends GeoModel<ToyChicaHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_chicatoy.png");
	}
}
