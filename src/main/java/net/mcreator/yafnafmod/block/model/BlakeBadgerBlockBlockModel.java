package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BlakeBadgerBlockTileEntity;

public class BlakeBadgerBlockBlockModel extends GeoModel<BlakeBadgerBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlakeBadgerBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/blakebadger.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/blakebadger.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlakeBadgerBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/blakebadger.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/blakebadger.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlakeBadgerBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_blakebadger_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_blakebadger.png");
	}
}
