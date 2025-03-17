package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.ToyChicaStillDayEntity;

public class ToyChicaStillDayModel extends GeoModel<ToyChicaStillDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToyChicaStillDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/toy_chicachicken.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyChicaStillDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/toy_chicachicken.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyChicaStillDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
