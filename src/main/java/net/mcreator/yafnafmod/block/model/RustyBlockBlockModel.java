package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RustyBlockTileEntity;

public class RustyBlockBlockModel extends GeoModel<RustyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RustyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/endo.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/endo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RustyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/endo.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/endo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RustyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_endo1_rusty_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_endo1_rusty.png");
	}
}
