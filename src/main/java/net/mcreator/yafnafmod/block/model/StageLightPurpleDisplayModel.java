package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.StageLightPurpleDisplayItem;

public class StageLightPurpleDisplayModel extends GeoModel<StageLightPurpleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StageLightPurpleDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/stagelight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightPurpleDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/stagelight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightPurpleDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/stagelight_off.png");
	}
}
