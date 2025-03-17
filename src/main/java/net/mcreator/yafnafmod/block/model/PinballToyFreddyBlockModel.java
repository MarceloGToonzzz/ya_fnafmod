package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PinballToyFreddyTileEntity;

public class PinballToyFreddyBlockModel extends GeoModel<PinballToyFreddyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PinballToyFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pinball.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinballToyFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pinball.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinballToyFreddyTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pinball_toyfreddy.png");
	}
}
