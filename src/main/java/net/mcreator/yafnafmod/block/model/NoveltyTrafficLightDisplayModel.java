package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.NoveltyTrafficLightDisplayItem;

public class NoveltyTrafficLightDisplayModel extends GeoModel<NoveltyTrafficLightDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(NoveltyTrafficLightDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/novelty_trafficlight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NoveltyTrafficLightDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/novelty_trafficlight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NoveltyTrafficLightDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/novelty_trafficlight.png");
	}
}
