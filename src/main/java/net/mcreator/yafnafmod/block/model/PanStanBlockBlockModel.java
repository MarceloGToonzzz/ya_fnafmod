package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PanStanBlockTileEntity;

public class PanStanBlockBlockModel extends GeoModel<PanStanBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PanStanBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pan_stan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PanStanBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pan_stan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PanStanBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_pan_stan.png");
	}
}
