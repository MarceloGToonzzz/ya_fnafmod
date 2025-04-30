package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.RetroFreddyHeadDisplayItem;

public class RetroFreddyHeadDisplayModel extends GeoModel<RetroFreddyHeadDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RetroFreddyHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/animatronic_head.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroFreddyHeadDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/animatronic_head.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroFreddyHeadDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/head_freddyretro.png");
	}
}
