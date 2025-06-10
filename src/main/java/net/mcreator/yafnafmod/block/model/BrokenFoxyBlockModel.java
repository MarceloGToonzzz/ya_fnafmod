package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BrokenFoxyTileEntity;

public class BrokenFoxyBlockModel extends GeoModel<BrokenFoxyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFoxyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/broken_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFoxyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/broken_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFoxyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/broken_foxy.png");
	}
}
