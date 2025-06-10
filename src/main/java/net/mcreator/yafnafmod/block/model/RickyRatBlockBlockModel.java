package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RickyRatBlockTileEntity;

public class RickyRatBlockBlockModel extends GeoModel<RickyRatBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RickyRatBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/rickyrat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RickyRatBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/rickyrat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RickyRatBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_rickyrat.png");
	}
}
