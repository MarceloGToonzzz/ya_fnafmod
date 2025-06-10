package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PopgoesWeaselBlockTileEntity;

public class PopgoesWeaselBlockBlockModel extends GeoModel<PopgoesWeaselBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PopgoesWeaselBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/popgoes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PopgoesWeaselBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/popgoes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PopgoesWeaselBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_popgoes.png");
	}
}
