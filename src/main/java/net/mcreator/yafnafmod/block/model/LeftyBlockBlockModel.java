package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.LeftyBlockTileEntity;

public class LeftyBlockBlockModel extends GeoModel<LeftyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LeftyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/lefty.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeftyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/lefty.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeftyBlockTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_lefty.png");
	}
}
