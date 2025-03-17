package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutBabyDisplayItem;

public class CutoutBabyDisplayModel extends GeoModel<CutoutBabyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutBabyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutBabyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutBabyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_baby.png");
	}
}
