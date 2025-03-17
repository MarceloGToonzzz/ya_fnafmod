package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RidingRocketPurpleTileEntity;

public class RidingRocketPurpleBlockModel extends GeoModel<RidingRocketPurpleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RidingRocketPurpleTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/riding_rocket.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RidingRocketPurpleTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/riding_rocket.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RidingRocketPurpleTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/ridingrocket_blue.png");
	}
}
