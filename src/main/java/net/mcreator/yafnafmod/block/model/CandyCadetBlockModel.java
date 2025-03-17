package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CandyCadetTileEntity;

public class CandyCadetBlockModel extends GeoModel<CandyCadetTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CandyCadetTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/candy_cadet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CandyCadetTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/candy_cadet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CandyCadetTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/candy_cadet.png");
	}
}
