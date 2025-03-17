package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.LargeFanTileEntity;

public class LargeFanBlockModel extends GeoModel<LargeFanTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(LargeFanTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/large_fan_horizontal.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/large_fan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LargeFanTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/large_fan_horizontal.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/large_fan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LargeFanTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/large_fan.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/large_fan.png");
	}
}
