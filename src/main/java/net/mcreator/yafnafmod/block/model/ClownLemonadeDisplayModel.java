package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ClownLemonadeDisplayItem;

public class ClownLemonadeDisplayModel extends GeoModel<ClownLemonadeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ClownLemonadeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/clown_lemonade.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ClownLemonadeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/clown_lemonade.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ClownLemonadeDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/clown_lemonade.png");
	}
}
