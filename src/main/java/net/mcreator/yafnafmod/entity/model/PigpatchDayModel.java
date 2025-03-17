package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.PigpatchDayEntity;

public class PigpatchDayModel extends GeoModel<PigpatchDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(PigpatchDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/pigpatch.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PigpatchDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/pigpatch.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PigpatchDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
