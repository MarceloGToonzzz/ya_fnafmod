package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.StageMoonCreepTileEntity;

public class StageMoonCreepBlockModel extends GeoModel<StageMoonCreepTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StageMoonCreepTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/moonprop_creep.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StageMoonCreepTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/moonprop_creep.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StageMoonCreepTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/stage_moon_creep.png");
	}
}
