package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.LargeFanDisplayItem;

public class LargeFanDisplayModel extends GeoModel<LargeFanDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LargeFanDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/large_fan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LargeFanDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/large_fan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LargeFanDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/large_fan.png");
	}
}
