package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.WitheredBonnieDayEntity;

public class WitheredBonnieDayModel extends GeoModel<WitheredBonnieDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/withered_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/withered_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonnieDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
