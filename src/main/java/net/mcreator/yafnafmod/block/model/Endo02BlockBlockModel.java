package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.Endo02BlockTileEntity;

public class Endo02BlockBlockModel extends GeoModel<Endo02BlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo02BlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/endo02block.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo02BlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/endo02block.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo02BlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_endo2.png");
	}
}
