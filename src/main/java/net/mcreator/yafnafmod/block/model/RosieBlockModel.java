package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RosieTileEntity;

public class RosieBlockModel extends GeoModel<RosieTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RosieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/rosie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RosieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/rosie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RosieTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/rosie.png");
	}
}
