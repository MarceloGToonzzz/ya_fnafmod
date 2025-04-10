package net.mcreator.yafnafmod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.item.ShotgunItem;

public class ShotgunItemModel extends GeoModel<ShotgunItem> {
	@Override
	public ResourceLocation getAnimationResource(ShotgunItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/shotgun.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShotgunItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/shotgun.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShotgunItem animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/item/shotgun.png");
	}
}
