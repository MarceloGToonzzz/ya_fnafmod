package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PinTheBowtieFreddyDisplayItem;

public class PinTheBowtieFreddyDisplayModel extends GeoModel<PinTheBowtieFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PinTheBowtieFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pinthebowtie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinTheBowtieFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pinthebowtie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinTheBowtieFreddyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pinthebowtie.png");
	}
}
