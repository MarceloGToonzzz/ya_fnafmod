package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutBonnieRetroDisplayItem;

public class CutoutBonnieRetroDisplayModel extends GeoModel<CutoutBonnieRetroDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutBonnieRetroDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutBonnieRetroDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutBonnieRetroDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_bonnieretro.png");
	}
}
