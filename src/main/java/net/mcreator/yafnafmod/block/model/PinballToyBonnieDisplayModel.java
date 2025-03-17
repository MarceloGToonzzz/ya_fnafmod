package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.PinballToyBonnieDisplayItem;

public class PinballToyBonnieDisplayModel extends GeoModel<PinballToyBonnieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PinballToyBonnieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/pinball.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinballToyBonnieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/pinball.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinballToyBonnieDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/pinball_toybonnie.png");
	}
}
