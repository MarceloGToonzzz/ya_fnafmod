package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.JackOBonnieEntity;

public class JackOBonnieModel extends GeoModel<JackOBonnieEntity> {
	@Override
	public ResourceLocation getAnimationResource(JackOBonnieEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/nightmare_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JackOBonnieEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/nightmare_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JackOBonnieEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
