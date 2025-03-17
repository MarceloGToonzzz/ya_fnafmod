package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.PanStanDayEntity;

public class PanStanDayModel extends GeoModel<PanStanDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(PanStanDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/pan_stan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PanStanDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/pan_stan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PanStanDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
