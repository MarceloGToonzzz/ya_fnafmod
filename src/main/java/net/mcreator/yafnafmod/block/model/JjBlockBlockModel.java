package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.JjBlockTileEntity;

public class JjBlockBlockModel extends GeoModel<JjBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(JjBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/bb.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/bb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JjBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/bb.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/bb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JjBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_jj-skin.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_jj.png");
	}
}
