package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ToyBonnieBlockTileEntity;

public class ToyBonnieBlockBlockModel extends GeoModel<ToyBonnieBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyBonnieBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/toy_bonniebunny.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/toy_bonniebunny.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyBonnieBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/toy_bonniebunny.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/toy_bonniebunny.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyBonnieBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_tbonnie_fms_day.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_tbonnie_day.png");
	}
}
