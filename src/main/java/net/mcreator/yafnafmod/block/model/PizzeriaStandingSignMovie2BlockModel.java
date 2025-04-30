package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PizzeriaStandingSignMovie2TileEntity;

public class PizzeriaStandingSignMovie2BlockModel extends GeoModel<PizzeriaStandingSignMovie2TileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PizzeriaStandingSignMovie2TileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/fnafsignstanding_outside.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/fnafsignstanding_outside.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PizzeriaStandingSignMovie2TileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/fnafsignstanding_outside.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/fnafsignstanding_outside.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PizzeriaStandingSignMovie2TileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/fnafmovie2signstanding_outside.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/fnafmovie2signstanding_outside.png");
	}
}
