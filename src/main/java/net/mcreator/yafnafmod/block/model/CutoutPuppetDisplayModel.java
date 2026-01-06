package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutPuppetDisplayItem;

public class CutoutPuppetDisplayModel extends GeoModel<CutoutPuppetDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutPuppetDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutPuppetDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutPuppetDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_puppet.png");
	}
}
