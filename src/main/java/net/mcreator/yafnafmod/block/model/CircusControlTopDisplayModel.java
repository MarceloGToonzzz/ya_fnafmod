package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CircusControlTopDisplayItem;

public class CircusControlTopDisplayModel extends GeoModel<CircusControlTopDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CircusControlTopDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/circus_control.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CircusControlTopDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/circus_control.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CircusControlTopDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/circus_control.png");
	}
}
