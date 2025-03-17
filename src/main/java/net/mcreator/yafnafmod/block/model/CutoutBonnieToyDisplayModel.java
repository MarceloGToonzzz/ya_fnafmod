package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutBonnieToyDisplayItem;

public class CutoutBonnieToyDisplayModel extends GeoModel<CutoutBonnieToyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutBonnieToyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutBonnieToyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutBonnieToyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_toybonnie.png");
	}
}
