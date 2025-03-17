package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.FuntimeFoxyDayEntity;

public class FuntimeFoxyDayModel extends GeoModel<FuntimeFoxyDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(FuntimeFoxyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/funtime_foxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FuntimeFoxyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/funtime_foxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FuntimeFoxyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
