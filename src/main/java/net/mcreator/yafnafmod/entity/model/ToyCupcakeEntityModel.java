package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.ToyCupcakeEntityEntity;

public class ToyCupcakeEntityModel extends GeoModel<ToyCupcakeEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyCupcakeEntityEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/cupcake.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyCupcakeEntityEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/cupcake.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyCupcakeEntityEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
