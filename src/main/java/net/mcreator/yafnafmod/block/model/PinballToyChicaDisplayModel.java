package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PinballToyChicaDisplayItem;

public class PinballToyChicaDisplayModel extends GeoModel<PinballToyChicaDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PinballToyChicaDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pinball.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinballToyChicaDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pinball.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinballToyChicaDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pinball_toychica.png");
	}
}
