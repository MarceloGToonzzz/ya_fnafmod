package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutTreePalmDisplayItem;

public class CutoutTreePalmDisplayModel extends GeoModel<CutoutTreePalmDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutTreePalmDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutTreePalmDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutTreePalmDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_treepalm.png");
	}
}
