package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.CutoutBalloonTwinsDisplayItem;

public class CutoutBalloonTwinsDisplayModel extends GeoModel<CutoutBalloonTwinsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutBalloonTwinsDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/cutout.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutBalloonTwinsDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/cutout.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutBalloonTwinsDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/cutout_bbjj.png");
	}
}
