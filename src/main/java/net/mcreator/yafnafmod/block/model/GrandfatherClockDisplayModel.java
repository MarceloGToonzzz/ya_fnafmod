package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.GrandfatherClockDisplayItem;

public class GrandfatherClockDisplayModel extends GeoModel<GrandfatherClockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GrandfatherClockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/grandfather_clock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrandfatherClockDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/grandfather_clock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrandfatherClockDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/grandfather_clock.png");
	}
}
