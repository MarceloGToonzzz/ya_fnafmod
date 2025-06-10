package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.Endo01PileTileEntity;

public class Endo01PileBlockModel extends GeoModel<Endo01PileTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Endo01PileTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/endopile.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Endo01PileTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/endopile.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Endo01PileTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_endo1.png");
	}
}
