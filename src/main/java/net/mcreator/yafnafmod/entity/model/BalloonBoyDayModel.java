package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.BalloonBoyDayEntity;

public class BalloonBoyDayModel extends GeoModel<BalloonBoyDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(BalloonBoyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/bb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BalloonBoyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/bb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BalloonBoyDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
