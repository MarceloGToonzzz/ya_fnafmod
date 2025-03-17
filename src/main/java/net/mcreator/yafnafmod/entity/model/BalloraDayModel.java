package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.BalloraDayEntity;

public class BalloraDayModel extends GeoModel<BalloraDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(BalloraDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/ballora.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BalloraDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/ballora.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BalloraDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
