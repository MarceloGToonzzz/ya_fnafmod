package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ExoticButterBasketTileEntity;

public class ExoticButterBasketBlockModel extends GeoModel<ExoticButterBasketTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ExoticButterBasketTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/exoticbutters.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/exoticbutters.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ExoticButterBasketTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/exoticbutters.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/exoticbutters.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ExoticButterBasketTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/exoticbutter_empty.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/exoticbutter.png");
	}
}
