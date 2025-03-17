package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.StageLightPinkDisplayItem;

public class StageLightPinkDisplayModel extends GeoModel<StageLightPinkDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StageLightPinkDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/stagelight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightPinkDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/stagelight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightPinkDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/stagelight_off.png");
	}
}
