package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RetroChicaBlockTileEntity;

public class RetroChicaBlockBlockModel extends GeoModel<RetroChicaBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroChicaBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/retro_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroChicaBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/retro_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroChicaBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_retro_chica.png");
	}
}
