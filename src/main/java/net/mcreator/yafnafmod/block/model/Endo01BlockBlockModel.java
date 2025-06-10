package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.Endo01BlockTileEntity;

public class Endo01BlockBlockModel extends GeoModel<Endo01BlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo01BlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/endo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01BlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/endo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01BlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_endo1.png");
	}
}
