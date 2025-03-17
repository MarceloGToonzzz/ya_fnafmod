package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PinballToyFreddyDisplayItem;

public class PinballToyFreddyDisplayModel extends GeoModel<PinballToyFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PinballToyFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pinball.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinballToyFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pinball.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinballToyFreddyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pinball_toyfreddy.png");
	}
}
