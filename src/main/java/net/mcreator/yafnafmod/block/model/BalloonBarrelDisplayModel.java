package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BalloonBarrelDisplayItem;

public class BalloonBarrelDisplayModel extends GeoModel<BalloonBarrelDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BalloonBarrelDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/balloon_barrel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BalloonBarrelDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/balloon_barrel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BalloonBarrelDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/balloonbarrel.png");
	}
}
