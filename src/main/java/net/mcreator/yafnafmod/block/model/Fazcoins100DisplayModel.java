package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.Fazcoins100DisplayItem;

public class Fazcoins100DisplayModel extends GeoModel<Fazcoins100DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Fazcoins100DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fazcoins_100.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Fazcoins100DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fazcoins_100.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Fazcoins100DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fazcoin_alot.png");
	}
}
