package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.RickyRatBlockDisplayItem;

public class RickyRatBlockDisplayModel extends GeoModel<RickyRatBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RickyRatBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/rickyrat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RickyRatBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/rickyrat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RickyRatBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_rickyrat.png");
	}
}
