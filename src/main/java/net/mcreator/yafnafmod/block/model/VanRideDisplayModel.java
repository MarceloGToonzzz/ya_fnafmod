package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.VanRideDisplayItem;

public class VanRideDisplayModel extends GeoModel<VanRideDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(VanRideDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/van_ride.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VanRideDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/van_ride.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VanRideDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/van_ride.png");
	}
}
