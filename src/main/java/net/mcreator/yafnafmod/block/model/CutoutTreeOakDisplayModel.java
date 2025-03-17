package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutTreeOakDisplayItem;

public class CutoutTreeOakDisplayModel extends GeoModel<CutoutTreeOakDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutTreeOakDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutTreeOakDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutTreeOakDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_treeoak.png");
	}
}
