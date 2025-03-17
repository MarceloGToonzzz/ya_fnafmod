package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.LeftyBlockTileEntity;

public class LeftyBlockBlockModel extends GeoModel<LeftyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LeftyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/lefty.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/lefty.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeftyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/lefty.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/lefty.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeftyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_lefty_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_lefty.png");
	}
}
