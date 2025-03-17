package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.SanitationStationDisplayItem;

public class SanitationStationDisplayModel extends GeoModel<SanitationStationDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SanitationStationDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/sanitation_station.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SanitationStationDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/sanitation_station.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SanitationStationDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/sanitation_station.png");
	}
}
