package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RetroFreddyBlockTileEntity;

public class RetroFreddyBlockBlockModel extends GeoModel<RetroFreddyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroFreddyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/retro_freddyfazbear.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/retro_freddyfazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroFreddyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/retro_freddyfazbear.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/retro_freddyfazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroFreddyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_retro_freddy-skin.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_retro_freddy.png");
	}
}
