package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.NightmareChicaEntity;

public class NightmareChicaModel extends GeoModel<NightmareChicaEntity> {
	@Override
	public ResourceLocation getAnimationResource(NightmareChicaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/nightmare_chica.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NightmareChicaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/nightmare_chica.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NightmareChicaEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
