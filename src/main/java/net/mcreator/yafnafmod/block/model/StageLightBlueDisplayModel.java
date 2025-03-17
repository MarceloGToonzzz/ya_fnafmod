package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.StageLightBlueDisplayItem;

public class StageLightBlueDisplayModel extends GeoModel<StageLightBlueDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StageLightBlueDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/stagelight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightBlueDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/stagelight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightBlueDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/stagelight_off.png");
	}
}
