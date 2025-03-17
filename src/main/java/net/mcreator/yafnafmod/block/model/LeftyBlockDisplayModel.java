package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.LeftyBlockDisplayItem;

public class LeftyBlockDisplayModel extends GeoModel<LeftyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LeftyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/lefty.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeftyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/lefty.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeftyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_lefty.png");
	}
}
