package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.WitheredJollyRatBlockTileEntity;

public class WitheredJollyRatBlockBlockModel extends GeoModel<WitheredJollyRatBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredJollyRatBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/jollyrat.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/jollyrat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredJollyRatBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/jollyrat.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/jollyrat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredJollyRatBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_withered_jollyrat_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_withered_jollyrat.png");
	}
}
