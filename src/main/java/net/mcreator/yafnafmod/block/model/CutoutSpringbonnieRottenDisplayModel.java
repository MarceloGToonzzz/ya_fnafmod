package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutSpringbonnieRottenDisplayItem;

public class CutoutSpringbonnieRottenDisplayModel extends GeoModel<CutoutSpringbonnieRottenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutSpringbonnieRottenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutSpringbonnieRottenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutSpringbonnieRottenDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_springbonnie_rotten.png");
	}
}
