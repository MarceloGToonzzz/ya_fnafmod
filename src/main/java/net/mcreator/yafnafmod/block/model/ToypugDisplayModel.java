package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ToypugDisplayItem;

public class ToypugDisplayModel extends GeoModel<ToypugDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToypugDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/toypug.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToypugDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/toypug.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToypugDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/toypug.png");
	}
}
