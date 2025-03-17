package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutChicaRetroDisplayItem;

public class CutoutChicaRetroDisplayModel extends GeoModel<CutoutChicaRetroDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutChicaRetroDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutChicaRetroDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutChicaRetroDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_chicaretro.png");
	}
}
