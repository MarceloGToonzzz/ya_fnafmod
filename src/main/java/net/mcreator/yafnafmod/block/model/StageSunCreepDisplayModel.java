package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.StageSunCreepDisplayItem;

public class StageSunCreepDisplayModel extends GeoModel<StageSunCreepDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StageSunCreepDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/sunprop_creep.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageSunCreepDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/sunprop_creep.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageSunCreepDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/stage_sun_creep.png");
	}
}
