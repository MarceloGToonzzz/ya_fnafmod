package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.RetroCupcakeFmsEntityEntity;

public class RetroCupcakeFmsEntityModel extends GeoModel<RetroCupcakeFmsEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroCupcakeFmsEntityEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/cupcake.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroCupcakeFmsEntityEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/cupcake.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroCupcakeFmsEntityEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
