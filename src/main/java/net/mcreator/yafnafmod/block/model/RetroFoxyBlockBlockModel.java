package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RetroFoxyBlockTileEntity;

public class RetroFoxyBlockBlockModel extends GeoModel<RetroFoxyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroFoxyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/retro_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroFoxyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/retro_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroFoxyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_retro_foxy.png");
	}
}
