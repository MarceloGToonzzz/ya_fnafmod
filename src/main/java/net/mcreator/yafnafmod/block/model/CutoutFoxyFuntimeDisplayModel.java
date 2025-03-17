package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutFoxyFuntimeDisplayItem;

public class CutoutFoxyFuntimeDisplayModel extends GeoModel<CutoutFoxyFuntimeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutFoxyFuntimeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutFoxyFuntimeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutFoxyFuntimeDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_funtimefoxy.png");
	}
}
