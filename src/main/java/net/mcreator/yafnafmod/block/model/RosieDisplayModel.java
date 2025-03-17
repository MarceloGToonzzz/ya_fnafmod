package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.RosieDisplayItem;

public class RosieDisplayModel extends GeoModel<RosieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RosieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/rosie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RosieDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/rosie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RosieDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/rosie.png");
	}
}
