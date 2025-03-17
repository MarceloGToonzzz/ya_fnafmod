package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.ToyFreddyStillDayEntity;

public class ToyFreddyStillDayModel extends GeoModel<ToyFreddyStillDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyStillDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/toy_freddyfazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyStillDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/toy_freddyfazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyStillDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
