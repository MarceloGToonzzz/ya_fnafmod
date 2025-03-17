package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.Fredbear01BlockTileEntity;

public class Fredbear01BlockBlockModel extends GeoModel<Fredbear01BlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(Fredbear01BlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/fredbear.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/fredbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Fredbear01BlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/fredbear.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/fredbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Fredbear01BlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_fredbear_stage01_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_fredbear_stage01.png");
	}
}
