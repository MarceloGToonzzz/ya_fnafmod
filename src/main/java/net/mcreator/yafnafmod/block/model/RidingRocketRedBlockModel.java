package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.RidingRocketRedTileEntity;

public class RidingRocketRedBlockModel extends GeoModel<RidingRocketRedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RidingRocketRedTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/riding_rocket.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RidingRocketRedTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/riding_rocket.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RidingRocketRedTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/ridingrocket_red.png");
	}
}
