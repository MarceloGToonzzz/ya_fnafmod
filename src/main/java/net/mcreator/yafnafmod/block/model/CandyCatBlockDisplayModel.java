package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CandyCatBlockDisplayItem;

public class CandyCatBlockDisplayModel extends GeoModel<CandyCatBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CandyCatBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/candy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CandyCatBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/candy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CandyCatBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_candythecat.png");
	}
}
