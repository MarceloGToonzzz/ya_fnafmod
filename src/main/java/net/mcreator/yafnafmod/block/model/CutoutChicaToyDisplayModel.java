package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutChicaToyDisplayItem;

public class CutoutChicaToyDisplayModel extends GeoModel<CutoutChicaToyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutChicaToyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutChicaToyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutChicaToyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_toychica.png");
	}
}
