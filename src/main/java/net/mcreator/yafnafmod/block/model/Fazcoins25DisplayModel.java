package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.Fazcoins25DisplayItem;

public class Fazcoins25DisplayModel extends GeoModel<Fazcoins25DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Fazcoins25DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fazcoins_25.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Fazcoins25DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fazcoins_25.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Fazcoins25DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fazcoin_alot.png");
	}
}
