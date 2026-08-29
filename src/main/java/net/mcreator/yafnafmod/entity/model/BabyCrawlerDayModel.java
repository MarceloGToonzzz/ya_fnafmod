package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.BabyCrawlerDayEntity;

public class BabyCrawlerDayModel extends GeoModel<BabyCrawlerDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabyCrawlerDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/baby_crawler.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabyCrawlerDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/baby_crawler.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabyCrawlerDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
