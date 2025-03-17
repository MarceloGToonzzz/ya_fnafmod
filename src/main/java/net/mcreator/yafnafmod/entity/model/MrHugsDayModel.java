package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.MrHugsDayEntity;

public class MrHugsDayModel extends GeoModel<MrHugsDayEntity> {
	@Override
	public ResourceLocation getAnimationResource(MrHugsDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/mrhugs.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MrHugsDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/mrhugs.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MrHugsDayEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
