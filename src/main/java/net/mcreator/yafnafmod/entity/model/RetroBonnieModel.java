package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.RetroBonnieEntity;

public class RetroBonnieModel extends GeoModel<RetroBonnieEntity> {
	@Override
	public ResourceLocation getAnimationResource(RetroBonnieEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/withered_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RetroBonnieEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/withered_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RetroBonnieEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
