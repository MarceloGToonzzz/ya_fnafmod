package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BlakeBadgerBlockDisplayItem;

public class BlakeBadgerBlockDisplayModel extends GeoModel<BlakeBadgerBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BlakeBadgerBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/blakebadger.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlakeBadgerBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/blakebadger.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlakeBadgerBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_blakebadger.png");
	}
}
