package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ScraptrapBlockTileEntity;

public class ScraptrapBlockBlockModel extends GeoModel<ScraptrapBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ScraptrapBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/scraptrap.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScraptrapBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/scraptrap.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScraptrapBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_scraptrap.png");
	}
}
