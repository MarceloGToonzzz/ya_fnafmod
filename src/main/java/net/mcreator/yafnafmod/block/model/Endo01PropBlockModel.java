package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.Endo01PropTileEntity;

public class Endo01PropBlockModel extends GeoModel<Endo01PropTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo01PropTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/endo01_block.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01PropTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/endo01_block.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01PropTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/endo1.png");
	}
}
