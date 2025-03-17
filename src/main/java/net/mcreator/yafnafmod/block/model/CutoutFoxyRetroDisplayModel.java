package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutFoxyRetroDisplayItem;

public class CutoutFoxyRetroDisplayModel extends GeoModel<CutoutFoxyRetroDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutFoxyRetroDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutFoxyRetroDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutFoxyRetroDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_foxyretro.png");
	}
}
