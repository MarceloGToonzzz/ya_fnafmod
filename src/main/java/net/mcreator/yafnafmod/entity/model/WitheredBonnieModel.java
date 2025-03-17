package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.WitheredBonnieEntity;

public class WitheredBonnieModel extends GeoModel<WitheredBonnieEntity> {
	@Override
	public ResourceLocation getAnimationResource(WitheredBonnieEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/withered_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WitheredBonnieEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/withered_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WitheredBonnieEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
