package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PopgoesWeaselBlockTileEntity;

public class PopgoesWeaselBlockBlockModel extends GeoModel<PopgoesWeaselBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PopgoesWeaselBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/popgoes.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/popgoes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PopgoesWeaselBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/popgoes.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/popgoes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PopgoesWeaselBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_popgoes_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_popgoes.png");
	}
}
