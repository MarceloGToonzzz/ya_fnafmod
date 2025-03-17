package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RascBlockTileEntity;

public class RascBlockBlockModel extends GeoModel<RascBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RascBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/rasc.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RascBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/rasc.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RascBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/rasc.png");
	}
}
