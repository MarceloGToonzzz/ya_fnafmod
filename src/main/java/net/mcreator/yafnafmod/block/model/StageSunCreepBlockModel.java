package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.StageSunCreepTileEntity;

public class StageSunCreepBlockModel extends GeoModel<StageSunCreepTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StageSunCreepTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/sunprop_creep.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageSunCreepTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/sunprop_creep.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageSunCreepTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/stage_sun_creep.png");
	}
}
