package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.MedicalStationTileEntity;

public class MedicalStationBlockModel extends GeoModel<MedicalStationTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MedicalStationTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "animations/medical_station.animation.json");
		return new ResourceLocation("ya_fnafmod", "animations/medical_station.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MedicalStationTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "geo/medical_station.geo.json");
		return new ResourceLocation("ya_fnafmod", "geo/medical_station.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MedicalStationTileEntity animatable) {
		final int blockstate = animatable.blockstateNew;
		if (blockstate == 1)
			return new ResourceLocation("ya_fnafmod", "textures/block/medical_station_open.png");
		return new ResourceLocation("ya_fnafmod", "textures/block/medical_station_closed.png");
	}
}
