package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.WitheredFreddyBlockDisplayItem;

public class WitheredFreddyBlockDisplayModel extends GeoModel<WitheredFreddyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WitheredFreddyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/withered_freddyfazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredFreddyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/withered_freddyfazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredFreddyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_withered_freddy.png");
	}
}
