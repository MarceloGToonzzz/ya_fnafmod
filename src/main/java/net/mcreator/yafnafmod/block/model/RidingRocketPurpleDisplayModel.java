package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.RidingRocketPurpleDisplayItem;

public class RidingRocketPurpleDisplayModel extends GeoModel<RidingRocketPurpleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RidingRocketPurpleDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/riding_rocket.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RidingRocketPurpleDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/riding_rocket.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RidingRocketPurpleDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/ridingrocket_blue.png");
	}
}
