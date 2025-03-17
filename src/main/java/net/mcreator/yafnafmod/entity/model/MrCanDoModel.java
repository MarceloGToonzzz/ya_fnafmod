package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.MrCanDoEntity;

public class MrCanDoModel extends GeoModel<MrCanDoEntity> {
	@Override
	public ResourceLocation getAnimationResource(MrCanDoEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/mr_can_do.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrCanDoEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/mr_can_do.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrCanDoEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
