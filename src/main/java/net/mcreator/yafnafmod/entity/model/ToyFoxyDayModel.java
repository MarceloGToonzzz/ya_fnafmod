package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.ToyFoxyDayEntity;

public class ToyFoxyDayModel extends GeoModel<ToyFoxyDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/toyfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/toyfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
