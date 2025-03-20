package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.FuntimeFreddyBlockDisplayItem;

public class FuntimeFreddyBlockDisplayModel extends GeoModel<FuntimeFreddyBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeFreddyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/funtime_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeFreddyBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/funtime_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeFreddyBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/animatronic_ftfreddy.png");
	}
}
