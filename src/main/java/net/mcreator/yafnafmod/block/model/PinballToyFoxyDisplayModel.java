package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PinballToyFoxyDisplayItem;

public class PinballToyFoxyDisplayModel extends GeoModel<PinballToyFoxyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PinballToyFoxyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pinball.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinballToyFoxyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pinball.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinballToyFoxyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pinball_toyfoxy.png");
	}
}
