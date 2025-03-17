package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.RascBlockDisplayItem;

public class RascBlockDisplayModel extends GeoModel<RascBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RascBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/rasc.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RascBlockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/rasc.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RascBlockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/rasc.png");
	}
}
