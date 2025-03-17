package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.RetroFoxyBlockDisplayItem;

public class RetroFoxyBlockDisplayModel extends GeoModel<RetroFoxyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RetroFoxyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/retro_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroFoxyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/retro_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroFoxyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_retro_foxy.png");
	}
}
