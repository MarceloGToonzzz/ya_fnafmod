package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RetroChicaHeadTileEntity;

public class RetroChicaHeadBlockModel extends GeoModel<RetroChicaHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroChicaHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroChicaHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroChicaHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_chicaretro.png");
	}
}
