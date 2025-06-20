package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ArcadeRacingBlueDisplayItem;

public class ArcadeRacingBlueDisplayModel extends GeoModel<ArcadeRacingBlueDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeRacingBlueDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/arcade_racer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeRacingBlueDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/arcade_racer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeRacingBlueDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/arcaderacing_blue.png");
	}
}
