package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.BidybabDayEntity;

public class BidybabDayModel extends GeoModel<BidybabDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(BidybabDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/bidybab.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BidybabDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/bidybab.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BidybabDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
