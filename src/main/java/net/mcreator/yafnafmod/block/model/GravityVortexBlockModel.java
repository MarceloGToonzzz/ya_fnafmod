package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.entity.GravityVortexTileEntity;

public class GravityVortexBlockModel extends GeoModel<GravityVortexTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GravityVortexTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/gravity_vortex.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GravityVortexTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/gravity_vortex.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GravityVortexTileEntity animatable) {
		return new ResourceLocation("ya_fnafmod", "textures/block/gravity_vortex.png");
	}
}
