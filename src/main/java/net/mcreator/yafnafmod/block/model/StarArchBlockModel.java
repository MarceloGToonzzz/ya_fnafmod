package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.StarArchTileEntity;

public class StarArchBlockModel extends GeoModel<StarArchTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StarArchTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/star_arch.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StarArchTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/star_arch.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StarArchTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/star_arch.png");
	}
}
