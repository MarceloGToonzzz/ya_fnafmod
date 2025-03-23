package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.WitheredJollyRatBlockDisplayItem;

public class WitheredJollyRatBlockDisplayModel extends GeoModel<WitheredJollyRatBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredJollyRatBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/jollyrat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredJollyRatBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/jollyrat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredJollyRatBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_withered_jollyrat.png");
	}
}
