package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutFredbearBittenDisplayItem;

public class CutoutFredbearBittenDisplayModel extends GeoModel<CutoutFredbearBittenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutFredbearBittenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutFredbearBittenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutFredbearBittenDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_fredbear_bitten.png");
	}
}
