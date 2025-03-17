package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.NeonStageLightPinkDisplayItem;

public class NeonStageLightPinkDisplayModel extends GeoModel<NeonStageLightPinkDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonStageLightPinkDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/stagelight_neon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonStageLightPinkDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/stagelight_neon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonStageLightPinkDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/stagelight_neon_pink.png");
	}
}
