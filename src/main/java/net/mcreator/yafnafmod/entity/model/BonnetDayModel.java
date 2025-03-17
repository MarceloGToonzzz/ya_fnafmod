package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.BonnetDayEntity;

public class BonnetDayModel extends GeoModel<BonnetDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(BonnetDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/bonbon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BonnetDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/bonbon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BonnetDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
