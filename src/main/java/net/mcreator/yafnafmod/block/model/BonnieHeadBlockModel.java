package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BonnieHeadTileEntity;

public class BonnieHeadBlockModel extends GeoModel<BonnieHeadTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieHeadTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieHeadTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieHeadTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/head_bonnieclassic_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/head_bonnieclassic.png");
	}
}
