package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CindyCatBlockTileEntity;

public class CindyCatBlockBlockModel extends GeoModel<CindyCatBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CindyCatBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/candy.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/candy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CindyCatBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/candy.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/candy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CindyCatBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_cindythecat_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_cindythecat.png");
	}
}
