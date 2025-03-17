package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.PlushtrapDayEntity;

public class PlushtrapDayModel extends GeoModel<PlushtrapDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(PlushtrapDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/plushtrap.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PlushtrapDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/plushtrap.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PlushtrapDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
