package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutTreePineDisplayItem;

public class CutoutTreePineDisplayModel extends GeoModel<CutoutTreePineDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutTreePineDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutTreePineDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutTreePineDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_treepine.png");
	}
}
