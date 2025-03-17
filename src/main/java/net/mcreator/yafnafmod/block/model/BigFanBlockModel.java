package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BigFanTileEntity;

public class BigFanBlockModel extends GeoModel<BigFanTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BigFanTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/big_fan_horizontal.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/big_fan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigFanTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/big_fan_horizontal.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/big_fan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigFanTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/big_fan.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/big_fan.png");
	}
}
