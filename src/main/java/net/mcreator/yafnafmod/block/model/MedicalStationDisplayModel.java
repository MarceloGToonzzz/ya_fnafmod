package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.MedicalStationDisplayItem;

public class MedicalStationDisplayModel extends GeoModel<MedicalStationDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MedicalStationDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/medical_station.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MedicalStationDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/medical_station.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MedicalStationDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/medical_station_closed.png");
	}
}
