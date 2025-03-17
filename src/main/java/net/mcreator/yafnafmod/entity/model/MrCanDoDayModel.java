package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.MrCanDoDayEntity;

public class MrCanDoDayModel extends GeoModel<MrCanDoDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(MrCanDoDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/mr_can_do.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrCanDoDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/mr_can_do.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrCanDoDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
