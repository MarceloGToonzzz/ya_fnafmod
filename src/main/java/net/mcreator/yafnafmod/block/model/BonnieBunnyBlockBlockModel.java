package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BonnieBunnyBlockTileEntity;

public class BonnieBunnyBlockBlockModel extends GeoModel<BonnieBunnyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnieBunnyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/bonniebunny.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/bonniebunny.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnieBunnyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/bonniebunny.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/bonniebunny.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnieBunnyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_bonniebunny_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_bonniebunny.png");
	}
}
