package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.NightmareBonnieEntity;

public class NightmareBonnieModel extends GeoModel<NightmareBonnieEntity> {
	@Override
	public ResourceLocation getAnimationResource(NightmareBonnieEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/nightmare_bonnie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NightmareBonnieEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/nightmare_bonnie.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NightmareBonnieEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
