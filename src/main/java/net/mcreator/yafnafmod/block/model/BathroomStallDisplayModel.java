package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.BathroomStallDisplayItem;

public class BathroomStallDisplayModel extends GeoModel<BathroomStallDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BathroomStallDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/bathroom_stall.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BathroomStallDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/bathroom_stall.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BathroomStallDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/bathroom_stall.png");
	}
}
