package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.RetroCupcakeEntityEntity;

public class RetroCupcakeEntityModel extends GeoModel<RetroCupcakeEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroCupcakeEntityEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/cupcake.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroCupcakeEntityEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/cupcake.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroCupcakeEntityEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
