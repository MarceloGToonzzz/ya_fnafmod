package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.WideFanDisplayItem;

public class WideFanDisplayModel extends GeoModel<WideFanDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WideFanDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/wide_fan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WideFanDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/wide_fan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WideFanDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/wide_fan.png");
	}
}
