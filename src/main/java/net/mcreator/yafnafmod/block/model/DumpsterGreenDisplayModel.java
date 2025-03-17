package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.DumpsterGreenDisplayItem;

public class DumpsterGreenDisplayModel extends GeoModel<DumpsterGreenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DumpsterGreenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/dumpster.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DumpsterGreenDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/dumpster.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DumpsterGreenDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/dumpster_green.png");
	}
}
