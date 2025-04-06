package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CindyCatBlockDisplayItem;

public class CindyCatBlockDisplayModel extends GeoModel<CindyCatBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CindyCatBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/candy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CindyCatBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/candy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CindyCatBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_cindythecat.png");
	}
}
