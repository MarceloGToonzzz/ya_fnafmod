package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.NeonStageLightGreenDisplayItem;

public class NeonStageLightGreenDisplayModel extends GeoModel<NeonStageLightGreenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonStageLightGreenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/stagelight_neon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonStageLightGreenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/stagelight_neon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonStageLightGreenDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/stagelight_neon_green.png");
	}
}
