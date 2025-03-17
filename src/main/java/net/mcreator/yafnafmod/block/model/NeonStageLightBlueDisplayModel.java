package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.NeonStageLightBlueDisplayItem;

public class NeonStageLightBlueDisplayModel extends GeoModel<NeonStageLightBlueDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonStageLightBlueDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/stagelight_neon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonStageLightBlueDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/stagelight_neon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonStageLightBlueDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/stagelight_neon_blue.png");
	}
}
