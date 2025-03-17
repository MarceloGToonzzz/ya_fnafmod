package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.GarfeldTileEntity;

public class GarfeldBlockModel extends GeoModel<GarfeldTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GarfeldTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/garfeld.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GarfeldTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/garfeld.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GarfeldTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/garfeld.png");
	}
}
