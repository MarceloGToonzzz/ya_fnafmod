package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.DuckPondDisplayItem;

public class DuckPondDisplayModel extends GeoModel<DuckPondDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DuckPondDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/duck_pond.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DuckPondDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/duck_pond.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DuckPondDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/duck_pond.png");
	}
}
