package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.RetroFreddyBlockDisplayItem;

public class RetroFreddyBlockDisplayModel extends GeoModel<RetroFreddyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RetroFreddyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/retro_freddyfazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroFreddyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/retro_freddyfazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroFreddyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_retro_freddy.png");
	}
}
