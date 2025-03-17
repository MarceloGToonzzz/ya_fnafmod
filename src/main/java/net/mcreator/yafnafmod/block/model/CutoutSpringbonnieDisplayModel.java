package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutSpringbonnieDisplayItem;

public class CutoutSpringbonnieDisplayModel extends GeoModel<CutoutSpringbonnieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutSpringbonnieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutSpringbonnieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutSpringbonnieDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_springbonnie.png");
	}
}
