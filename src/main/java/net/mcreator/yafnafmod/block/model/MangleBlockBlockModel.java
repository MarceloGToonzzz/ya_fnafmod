package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.MangleBlockTileEntity;

public class MangleBlockBlockModel extends GeoModel<MangleBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MangleBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/mangle.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/mangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MangleBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/mangle.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/mangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MangleBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_mangle-skin.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_mangle.png");
	}
}
