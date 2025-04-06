package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RickyRatBlockTileEntity;

public class RickyRatBlockBlockModel extends GeoModel<RickyRatBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RickyRatBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/rickyrat.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/rickyrat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RickyRatBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/rickyrat.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/rickyrat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RickyRatBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_rickyrat_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_rickyrat.png");
	}
}
