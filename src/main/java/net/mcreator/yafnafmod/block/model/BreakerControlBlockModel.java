package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.BreakerControlTileEntity;

public class BreakerControlBlockModel extends GeoModel<BreakerControlTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BreakerControlTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/breaker_control.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/breaker_control.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BreakerControlTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/breaker_control.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/breaker_control.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BreakerControlTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/breakercontrol_nomegaphone.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/breakercontrol.png");
	}
}
