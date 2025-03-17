package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.StageLightGreenDisplayItem;

public class StageLightGreenDisplayModel extends GeoModel<StageLightGreenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StageLightGreenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/stagelight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightGreenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/stagelight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightGreenDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/stagelight_off.png");
	}
}
