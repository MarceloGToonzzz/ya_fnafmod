package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CircusBabyBlockTileEntity;

public class CircusBabyBlockBlockModel extends GeoModel<CircusBabyBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CircusBabyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/baby.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/baby.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CircusBabyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/baby.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/baby.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CircusBabyBlockTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_baby_fms.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_baby.png");
	}
}
