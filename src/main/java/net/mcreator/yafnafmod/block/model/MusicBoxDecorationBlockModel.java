package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.MusicBoxDecorationTileEntity;

public class MusicBoxDecorationBlockModel extends GeoModel<MusicBoxDecorationTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MusicBoxDecorationTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/puppetbox_open.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/puppetbox_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MusicBoxDecorationTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/puppetbox_open.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/puppetbox_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MusicBoxDecorationTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/musicbox_deco.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/musicbox_deco.png");
	}
}
