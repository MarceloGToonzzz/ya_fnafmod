package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutFreddyFuntimeDisplayItem;

public class CutoutFreddyFuntimeDisplayModel extends GeoModel<CutoutFreddyFuntimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutFreddyFuntimeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutFreddyFuntimeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutFreddyFuntimeDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_funtimefreddy.png");
	}
}
