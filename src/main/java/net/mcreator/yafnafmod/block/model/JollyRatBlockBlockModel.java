package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.JollyRatBlockTileEntity;

public class JollyRatBlockBlockModel extends GeoModel<JollyRatBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(JollyRatBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/jollyrat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JollyRatBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/jollyrat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JollyRatBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_jollyrat.png");
	}
}
