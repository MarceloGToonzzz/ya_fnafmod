package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutFreddyToyDisplayItem;

public class CutoutFreddyToyDisplayModel extends GeoModel<CutoutFreddyToyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutFreddyToyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutFreddyToyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutFreddyToyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_toyfreddy.png");
	}
}
