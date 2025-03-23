package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.IgnitedChicaBlockDisplayItem;

public class IgnitedChicaBlockDisplayModel extends GeoModel<IgnitedChicaBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IgnitedChicaBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/ignited_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IgnitedChicaBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/ignited_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IgnitedChicaBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_ignited_chica.png");
	}
}
