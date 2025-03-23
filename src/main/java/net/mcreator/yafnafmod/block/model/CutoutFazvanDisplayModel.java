package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutFazvanDisplayItem;

public class CutoutFazvanDisplayModel extends GeoModel<CutoutFazvanDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutFazvanDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutFazvanDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutFazvanDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_fazvan.png");
	}
}
