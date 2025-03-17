package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ClockWallChicaDisplayItem;

public class ClockWallChicaDisplayModel extends GeoModel<ClockWallChicaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClockWallChicaDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClockWallChicaDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClockWallChicaDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clock_chica.png");
	}
}
