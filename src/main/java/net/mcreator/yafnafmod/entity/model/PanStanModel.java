package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.PanStanEntity;

public class PanStanModel extends GeoModel<PanStanEntity> {
	@Override
	public ResourceLocation getAnimationResource(PanStanEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/pan_stan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PanStanEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/pan_stan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PanStanEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
