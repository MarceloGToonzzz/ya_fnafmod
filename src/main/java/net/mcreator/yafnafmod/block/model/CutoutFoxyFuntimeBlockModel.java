package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CutoutFoxyFuntimeTileEntity;

public class CutoutFoxyFuntimeBlockModel extends GeoModel<CutoutFoxyFuntimeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CutoutFoxyFuntimeTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/cutout_diag.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutFoxyFuntimeTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/cutout_diag.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutFoxyFuntimeTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/cutout_funtimefoxy.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_funtimefoxy.png");
	}
}
