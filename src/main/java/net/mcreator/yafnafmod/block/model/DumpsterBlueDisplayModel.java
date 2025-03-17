package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.DumpsterBlueDisplayItem;

public class DumpsterBlueDisplayModel extends GeoModel<DumpsterBlueDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DumpsterBlueDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/dumpster.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DumpsterBlueDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/dumpster.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DumpsterBlueDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/dumpster_blue.png");
	}
}
