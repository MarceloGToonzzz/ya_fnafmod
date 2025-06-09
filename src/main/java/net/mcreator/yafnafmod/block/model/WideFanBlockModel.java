package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.WideFanTileEntity;

public class WideFanBlockModel extends GeoModel<WideFanTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WideFanTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/wide_fan_horizontal.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/wide_fan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WideFanTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/wide_fan_horizontal.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/wide_fan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WideFanTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/wide_fan.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/wide_fan.png");
	}
}
