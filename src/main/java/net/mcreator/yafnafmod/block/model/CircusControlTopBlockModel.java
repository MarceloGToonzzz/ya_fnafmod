package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.CircusControlTopTileEntity;

public class CircusControlTopBlockModel extends GeoModel<CircusControlTopTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CircusControlTopTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/breaker_control.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/circus_control.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CircusControlTopTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/breaker_control.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/circus_control.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CircusControlTopTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/breakercontrol_nomegaphone.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/circus_control.png");
	}
}
