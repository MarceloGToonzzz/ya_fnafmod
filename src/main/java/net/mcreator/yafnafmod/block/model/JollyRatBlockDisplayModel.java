package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.JollyRatBlockDisplayItem;

public class JollyRatBlockDisplayModel extends GeoModel<JollyRatBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(JollyRatBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/jollyrat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JollyRatBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/jollyrat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JollyRatBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_jollyrat.png");
	}
}
