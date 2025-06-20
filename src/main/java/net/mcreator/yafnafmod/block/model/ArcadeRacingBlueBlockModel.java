package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ArcadeRacingBlueTileEntity;

public class ArcadeRacingBlueBlockModel extends GeoModel<ArcadeRacingBlueTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeRacingBlueTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/arcade_racer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeRacingBlueTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/arcade_racer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeRacingBlueTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/arcaderacing_blue.png");
	}
}
