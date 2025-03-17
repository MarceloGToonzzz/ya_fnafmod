package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.ToyFoxyStillDayEntity;

public class ToyFoxyStillDayModel extends GeoModel<ToyFoxyStillDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFoxyStillDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/toyfoxy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFoxyStillDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/toyfoxy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFoxyStillDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
