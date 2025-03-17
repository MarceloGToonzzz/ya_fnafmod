package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.Fazcoins5DisplayItem;

public class Fazcoins5DisplayModel extends GeoModel<Fazcoins5DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Fazcoins5DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/fazcoins_5.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Fazcoins5DisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/fazcoins_5.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Fazcoins5DisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/fazcoin.png");
	}
}
