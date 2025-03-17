package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BigFanDisplayItem;

public class BigFanDisplayModel extends GeoModel<BigFanDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BigFanDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/big_fan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigFanDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/big_fan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigFanDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/big_fan.png");
	}
}
