package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.RetroChicaHeadDisplayItem;

public class RetroChicaHeadDisplayModel extends GeoModel<RetroChicaHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RetroChicaHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroChicaHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroChicaHeadDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_chicaretro.png");
	}
}
