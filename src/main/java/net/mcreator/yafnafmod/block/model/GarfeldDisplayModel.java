package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.GarfeldDisplayItem;

public class GarfeldDisplayModel extends GeoModel<GarfeldDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GarfeldDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/garfeld.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GarfeldDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/garfeld.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GarfeldDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/garfeld.png");
	}
}
