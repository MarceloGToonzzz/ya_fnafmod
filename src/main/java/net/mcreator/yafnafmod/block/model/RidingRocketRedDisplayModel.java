package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.RidingRocketRedDisplayItem;

public class RidingRocketRedDisplayModel extends GeoModel<RidingRocketRedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RidingRocketRedDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/riding_rocket.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RidingRocketRedDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/riding_rocket.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RidingRocketRedDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/ridingrocket_red.png");
	}
}
