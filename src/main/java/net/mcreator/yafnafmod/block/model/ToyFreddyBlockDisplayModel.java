package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.ToyFreddyBlockDisplayItem;

public class ToyFreddyBlockDisplayModel extends GeoModel<ToyFreddyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/toy_freddyfazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/toy_freddyfazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_tfreddy_day.png");
	}
}
