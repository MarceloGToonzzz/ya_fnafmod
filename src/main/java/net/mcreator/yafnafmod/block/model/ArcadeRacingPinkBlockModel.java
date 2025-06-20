package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.ArcadeRacingPinkTileEntity;

public class ArcadeRacingPinkBlockModel extends GeoModel<ArcadeRacingPinkTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ArcadeRacingPinkTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/arcade_racer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArcadeRacingPinkTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/arcade_racer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArcadeRacingPinkTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/arcaderacing_pink.png");
	}
}
