package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ArcadeRacingPinkDisplayItem;

public class ArcadeRacingPinkDisplayModel extends GeoModel<ArcadeRacingPinkDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeRacingPinkDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/arcade_racer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeRacingPinkDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/arcade_racer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeRacingPinkDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/arcaderacing_pink.png");
	}
}
