package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PigpatchBlockTileEntity;

public class PigpatchBlockBlockModel extends GeoModel<PigpatchBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PigpatchBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pigpatch.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PigpatchBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pigpatch.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PigpatchBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_pigpatch.png");
	}
}
