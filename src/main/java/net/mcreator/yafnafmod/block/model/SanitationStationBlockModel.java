package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.SanitationStationTileEntity;

public class SanitationStationBlockModel extends GeoModel<SanitationStationTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SanitationStationTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/sanitation_station.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SanitationStationTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/sanitation_station.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SanitationStationTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/sanitation_station.png");
	}
}
