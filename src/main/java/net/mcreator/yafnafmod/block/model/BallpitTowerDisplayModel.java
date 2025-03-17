package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BallpitTowerDisplayItem;

public class BallpitTowerDisplayModel extends GeoModel<BallpitTowerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BallpitTowerDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/tower_ballpit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BallpitTowerDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/tower_ballpit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BallpitTowerDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/tower_ballpit.png");
	}
}
