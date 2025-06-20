package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ToyChicaHeadDisplayItem;

public class ToyChicaHeadDisplayModel extends GeoModel<ToyChicaHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaHeadDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_chicatoy.png");
	}
}
