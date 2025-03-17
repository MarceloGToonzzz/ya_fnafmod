package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.JackOChicaEntity;

public class JackOChicaModel extends GeoModel<JackOChicaEntity> {
	@Override
	public ResourceLocation getAnimationResource(JackOChicaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/nightmare_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JackOChicaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/nightmare_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JackOChicaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
