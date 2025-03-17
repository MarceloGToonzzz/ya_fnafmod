package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.RetroChicaBlockDisplayItem;

public class RetroChicaBlockDisplayModel extends GeoModel<RetroChicaBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RetroChicaBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/retro_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroChicaBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/retro_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroChicaBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_retro_chica.png");
	}
}
