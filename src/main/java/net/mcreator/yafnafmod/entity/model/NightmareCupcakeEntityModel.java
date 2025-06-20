package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.NightmareCupcakeEntityEntity;

public class NightmareCupcakeEntityModel extends GeoModel<NightmareCupcakeEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(NightmareCupcakeEntityEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/cupcake.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NightmareCupcakeEntityEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/cupcake.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NightmareCupcakeEntityEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
