package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.RetroFoxyHeadDisplayItem;

public class RetroFoxyHeadDisplayModel extends GeoModel<RetroFoxyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RetroFoxyHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroFoxyHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroFoxyHeadDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_foxyretro.png");
	}
}
