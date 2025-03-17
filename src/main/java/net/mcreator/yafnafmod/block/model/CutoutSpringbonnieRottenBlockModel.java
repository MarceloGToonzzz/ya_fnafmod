package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CutoutSpringbonnieRottenTileEntity;

public class CutoutSpringbonnieRottenBlockModel extends GeoModel<CutoutSpringbonnieRottenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CutoutSpringbonnieRottenTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/cutout_diag.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutSpringbonnieRottenTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/cutout_diag.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutSpringbonnieRottenTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/cutout_springbonnie_rotten.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_springbonnie_rotten.png");
	}
}
