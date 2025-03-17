package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BigClosetTileEntity;

public class BigClosetBlockModel extends GeoModel<BigClosetTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BigClosetTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/bigclosetopen.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/bigcloset.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigClosetTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/bigclosetopen.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/bigcloset.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigClosetTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/bigcloset.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/bigcloset.png");
	}
}
