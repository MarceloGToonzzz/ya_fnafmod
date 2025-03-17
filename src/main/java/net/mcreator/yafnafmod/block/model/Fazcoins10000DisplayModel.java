package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.Fazcoins10000DisplayItem;

public class Fazcoins10000DisplayModel extends GeoModel<Fazcoins10000DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Fazcoins10000DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fazcoin_bag.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Fazcoins10000DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fazcoin_bag.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Fazcoins10000DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/coinbag.png");
	}
}
