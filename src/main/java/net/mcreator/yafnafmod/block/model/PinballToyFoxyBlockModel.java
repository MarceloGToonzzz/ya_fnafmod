package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PinballToyFoxyTileEntity;

public class PinballToyFoxyBlockModel extends GeoModel<PinballToyFoxyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PinballToyFoxyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pinball.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinballToyFoxyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pinball.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinballToyFoxyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pinball_toyfoxy.png");
	}
}
