package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutFreddyRetroDisplayItem;

public class CutoutFreddyRetroDisplayModel extends GeoModel<CutoutFreddyRetroDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutFreddyRetroDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutFreddyRetroDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutFreddyRetroDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_freddyretro.png");
	}
}
