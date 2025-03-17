package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BreakerControlDisplayItem;

public class BreakerControlDisplayModel extends GeoModel<BreakerControlDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BreakerControlDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/breaker_control.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BreakerControlDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/breaker_control.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BreakerControlDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/breakercontrol.png");
	}
}
