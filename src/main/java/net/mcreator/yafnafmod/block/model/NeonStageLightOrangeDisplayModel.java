package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.NeonStageLightOrangeDisplayItem;

public class NeonStageLightOrangeDisplayModel extends GeoModel<NeonStageLightOrangeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NeonStageLightOrangeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/stagelight_neon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NeonStageLightOrangeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/stagelight_neon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NeonStageLightOrangeDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/stagelight_neon_orange.png");
	}
}
