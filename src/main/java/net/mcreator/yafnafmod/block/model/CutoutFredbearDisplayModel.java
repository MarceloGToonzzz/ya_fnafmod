package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutFredbearDisplayItem;

public class CutoutFredbearDisplayModel extends GeoModel<CutoutFredbearDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutFredbearDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutFredbearDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutFredbearDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_fredbear.png");
	}
}
