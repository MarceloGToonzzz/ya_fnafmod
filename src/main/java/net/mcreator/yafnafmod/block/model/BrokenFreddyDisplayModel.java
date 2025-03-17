package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BrokenFreddyDisplayItem;

public class BrokenFreddyDisplayModel extends GeoModel<BrokenFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrokenFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/broken_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrokenFreddyDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/broken_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrokenFreddyDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/broken_freddy.png");
	}
}
