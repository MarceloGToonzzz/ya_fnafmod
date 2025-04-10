package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.RatItemItem;

public class RatItemItemModel extends GeoModel<RatItemItem> {
	@Override
	public ResourceLocation getAnimationResource(RatItemItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/rat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RatItemItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/rat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RatItemItem animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/item/rat.png");
	}
}
