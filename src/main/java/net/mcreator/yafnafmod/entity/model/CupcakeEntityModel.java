package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.CupcakeEntityEntity;

public class CupcakeEntityModel extends GeoModel<CupcakeEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(CupcakeEntityEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/cupcake.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CupcakeEntityEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/cupcake.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CupcakeEntityEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
