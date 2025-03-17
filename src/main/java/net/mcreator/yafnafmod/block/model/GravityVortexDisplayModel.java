package net.mcreator.yafnafmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.block.display.GravityVortexDisplayItem;

public class GravityVortexDisplayModel extends GeoModel<GravityVortexDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GravityVortexDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "animations/gravity_vortex.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GravityVortexDisplayItem animatable) {
		return new ResourceLocation("ya_fnafmod", "geo/gravity_vortex.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GravityVortexDisplayItem entity) {
		return new ResourceLocation("ya_fnafmod", "textures/block/gravity_vortex.png");
	}
}
