package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.StageMoonCreepDisplayItem;

public class StageMoonCreepDisplayModel extends GeoModel<StageMoonCreepDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StageMoonCreepDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/moonprop_creep.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageMoonCreepDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/moonprop_creep.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageMoonCreepDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/stage_moon_creep.png");
	}
}
