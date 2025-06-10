package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ChicaHeadTileEntity;

public class ChicaHeadBlockModel extends GeoModel<ChicaHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChicaHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChicaHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChicaHeadTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_chicaclassic.png");
	}
}
