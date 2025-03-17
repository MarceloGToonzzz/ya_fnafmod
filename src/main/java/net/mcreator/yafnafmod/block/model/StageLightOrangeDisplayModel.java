package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.StageLightOrangeDisplayItem;

public class StageLightOrangeDisplayModel extends GeoModel<StageLightOrangeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StageLightOrangeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/stagelight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageLightOrangeDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/stagelight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageLightOrangeDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/stagelight_off.png");
	}
}
