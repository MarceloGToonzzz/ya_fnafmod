package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutFoxyToyDisplayItem;

public class CutoutFoxyToyDisplayModel extends GeoModel<CutoutFoxyToyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutFoxyToyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutFoxyToyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutFoxyToyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_toyfoxy.png");
	}
}
