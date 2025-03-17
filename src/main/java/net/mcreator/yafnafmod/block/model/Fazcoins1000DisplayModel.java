package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.Fazcoins1000DisplayItem;

public class Fazcoins1000DisplayModel extends GeoModel<Fazcoins1000DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Fazcoins1000DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fazcoins_1000.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Fazcoins1000DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fazcoins_1000.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Fazcoins1000DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fazcoin_alot.png");
	}
}
