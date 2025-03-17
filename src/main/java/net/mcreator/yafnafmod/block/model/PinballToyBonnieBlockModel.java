package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.PinballToyBonnieTileEntity;

public class PinballToyBonnieBlockModel extends GeoModel<PinballToyBonnieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PinballToyBonnieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pinball.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinballToyBonnieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pinball.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinballToyBonnieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pinball_toybonnie.png");
	}
}
