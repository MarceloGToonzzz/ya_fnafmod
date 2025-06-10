package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BrokenChicaTileEntity;

public class BrokenChicaBlockModel extends GeoModel<BrokenChicaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrokenChicaTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/broken_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenChicaTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/broken_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenChicaTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/broken_chica.png");
	}
}
